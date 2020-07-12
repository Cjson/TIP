package com.platform.tip.util;

public enum ResponseCode {
    SUCCESS("200","请求成功"),
    ERROR("400","请求失败"),
    PARAM_ERROR("402","参数错误"),
    PARAM_NULL("405","参数不能为空"),
    PARAM_EXIT("406","数据已存在"),
    PARAM_NOT_EXIT("406","数据已存在");

    private String code;
    private String msg;

    ResponseCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }
}
