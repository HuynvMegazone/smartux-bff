package com.lguplus.fleta.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestResponse {
    private int codeNum;
    private String status;
    private Object data;
    private String message;
}
