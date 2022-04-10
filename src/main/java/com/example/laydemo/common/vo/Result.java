package com.example.laydemo.common.vo;


import lombok.Data;

@Data
public class Result<T> {

    private Result() {
    }

    private Result(Integer code, String message, T data, Long count) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.count = count;
    }

    private Integer code;
    private String message;
    private T data;
    private Long count;


    public static Result<Object> success(){
        return new Result(0, "message", null, null);
    }

    public static Result<Object> fail(){
        return new Result(-1, "fail", null, null);
    }

    public static Result<Object> fail(String message){
        return new Result(-1, message, null, null);
    }
}
