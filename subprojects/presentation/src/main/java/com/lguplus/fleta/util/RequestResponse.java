package com.lguplus.fleta.util;

import com.google.gson.Gson;
import jdk.nashorn.internal.runtime.options.Option;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class RequestResponse {
    private int codeNum;
    private String status;
    private String data;
    private String message;

    public RequestResponse(int codeNum, String status, List<Object> data, String message) {
        this.codeNum = codeNum;
        this.status = status;
        String json = new Gson().toJson(data);
        this.data = json;
        this.message = message;
    }

    public RequestResponse(int codeNum, String status, Object obj, String message) {
        this.codeNum = codeNum;
        this.status = status;
        String json = new Gson().toJson(obj);
        this.data = json;
        this.message = message;
    }
}
