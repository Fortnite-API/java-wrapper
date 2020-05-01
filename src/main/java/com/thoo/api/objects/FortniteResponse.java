package com.thoo.api.objects;

import com.thoo.api.exceptions.InvalidAPIKeyException;
import com.thoo.api.model.ExceptionModel;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.function.Consumer;

public final class FortniteResponse<T> implements Cloneable {

    private T model;
    private boolean successful;
    private Optional<ExceptionModel> error;

    public FortniteResponse(T model, boolean successful, Optional<ExceptionModel> error){
        this.successful = successful;
        this.model = model;
        this.error = error;
        if(error.isPresent()){
            if(error.get().error.equalsIgnoreCase("invalid api-key. make sure to submit the right api key.")){
                try {
                    throw new InvalidAPIKeyException();
                } catch (InvalidAPIKeyException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void ifSuccessful(Consumer<T> action){
        if(successful) action.accept(model);
    }

    public void ifError(Consumer<ExceptionModel> action){
        error.ifPresent(action);
    }

    public Optional<ExceptionModel> getError() {
        return error;
    }

    public T getModel() {
        return model;
    }

    public boolean isSuccessful() {
        return successful;
    }

}
