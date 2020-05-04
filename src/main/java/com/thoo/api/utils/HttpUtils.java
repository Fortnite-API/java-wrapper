package com.thoo.api.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoo.api.FortniteAPIImpl;
import com.thoo.api.enums.Language;
import com.thoo.api.model.BaseModel;
import com.thoo.api.model.ExceptionModel;
import com.thoo.api.objects.FortniteResponse;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.Optional;

public final class HttpUtils {

    public static Gson gson;
    public static OkHttpClient client;

    public HttpUtils(FortniteAPIImpl api){
        gson = new GsonBuilder()
                .setLenient().create();
        client = new OkHttpClient.Builder()
                .addInterceptor(new FortniteInterceptor(api.getApiKey(), Language.EN)).build();
    }

    @NotNull
    public static <T> FortniteResponse<BaseModel<T>> parse(Call<BaseModel<T>> call) {
        try {
            Response<BaseModel<T>> response = call.execute();
            if(response.isSuccessful()){
                return new FortniteResponse<>(response.body(), true, Optional.empty());
            } else {
                return new FortniteResponse<>(response.body(), false, Optional.of(gson.fromJson(response.errorBody().string(), ExceptionModel.class)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new FortniteResponse<>(null, false, Optional.empty());
        }
    }

    public final static class FortniteInterceptor implements Interceptor {

        private String apiKey;
        private Language language;

        public FortniteInterceptor(String apiKey, Language language) {
            this.apiKey = apiKey;
            this.language = language;
        }

        public okhttp3.Response intercept(Chain chain) throws IOException {
            Request request = chain.request().newBuilder()
                    .header("x-api-key", apiKey).build();
            return chain.proceed(request);
        }

    }

}
