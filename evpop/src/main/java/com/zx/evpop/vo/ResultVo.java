package com.zx.evpop.vo;


/**
 * Created by jiangmenglin.
 *
 * @author jiangmenglin
 * description:
 * date: 2018/10/31 13:11
 */
public class ResultVo<T> {

    boolean isSuccess = true;

    String message = "成功";

    T data;

    public ResultVo() {

    }

    public ResultVo(String message) {
        this.message = message;
    }

    public ResultVo(T data) {
        this.data = data;
    }

    public ResultVo(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }

    public ResultVo(boolean isSuccess, String message, T data) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
