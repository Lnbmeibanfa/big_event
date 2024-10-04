package com.itheima.big_event.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private int status;
    private String message;
    private Object data;
    public static Result success() {
        return new Result(0, "success", null);
    }
    public static Result success(Object data) {
        return new Result(0, "success", data);
    }
    public static Result error() {
        return new Result(0, "error", null);
    }
}
