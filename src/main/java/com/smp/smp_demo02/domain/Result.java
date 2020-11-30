package com.smp.smp_demo02.domain;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String msg;
    private Object data;

    /*public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }*/

    public static Result init(int code, String msg, Object data) {
        Result result=new Result();
        result.code=code;
        result.msg=msg;
        result.data=data;
        return result;
    }
}
