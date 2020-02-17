package com.davina.core.entity;

/**
 * @ClassName Result
 * @Description 封装用户操作结果
 * @Author Davina Chan
 * @Date 2020/2/17 19:34
 * @Version 1.0
 */
public class Result {

    private boolean flag;
    private String message;

    public Result(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public Result() {
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
