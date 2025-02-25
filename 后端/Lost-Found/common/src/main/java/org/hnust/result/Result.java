package org.hnust.result;

import lombok.Data;
import org.hnust.enums.AppCode;

import java.io.Serializable;

@Data
// TODO：为什么要序列化？为什么要加T？这个语法是什么？
public class Result<T> implements Serializable {

    private Integer code; // 编码：1成功，0和其它数字为失败
    private String msg; // 错误信息
    private T data; // 数据

    // TODO：为什么是static方法？为什么要两个T？
    public static <T> Result<T> success() {
        Result<T> result = new Result<T>();
        result.code = 200;
        return result;
    }

    public static <T> Result<T> success(String msg) {
        Result<T> result = new Result<T>();
        result.code = 200;
        result.msg = msg;
        return result;
    }

    public static <T> Result<T> success(T object) {
        Result<T> result = new Result<T>();
        result.data = object;
        result.code = 200;
        return result;
    }

    public static <T> Result<T> success(T object, String msg) {
        Result<T> result = new Result<T>();
        result.data = object;
        result.code = 200;
        result.msg = msg;
        return result;
    }

    public static <T> Result<T> error(AppCode appCode) {
        Result<T> result = new Result<T>();
        result.msg = appCode.getMsg();
        result.code = appCode.getCode();
        return result;
    }

    public static <T> Result<T> error(String msg) {
        Result<T> result = new Result<T>();
        result.code = 0;
        result.msg = msg;
        return result;
    }
}
