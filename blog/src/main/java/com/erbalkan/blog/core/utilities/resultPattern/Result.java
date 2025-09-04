package com.erbalkan.blog.core.utilities.resultPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Result<T> {

    private boolean success;
    private String message;
    private T data;

    public static <T> Result<T> success(T data, String message){
        return new Result<>(true, message, data);
    }

    public static <T> Result<T> success(String message){
        return new Result<>(true, message, null);
    }

    public static <T> Result<T> failure(String message){
        return new Result<>(false, message, null);
    }
    
}
