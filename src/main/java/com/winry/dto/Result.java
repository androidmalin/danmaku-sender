package com.winry.dto;

import java.util.List;

/**
 * Created by cong on 2016/3/23.
 */
public class Result {

    private String code;

    private String msg;

    private List data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
