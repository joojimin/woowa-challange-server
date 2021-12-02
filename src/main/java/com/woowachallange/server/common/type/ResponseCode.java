package com.woowachallange.server.common.type;

import lombok.Getter;

@Getter
public enum ResponseCode {
    OK("000");


    private final String code;
    private final String description;


    ResponseCode(String code) {
        this.code = code;
        this.description = "성공";
    }

    private ResponseCode(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
