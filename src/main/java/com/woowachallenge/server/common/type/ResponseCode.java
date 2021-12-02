package com.woowachallenge.server.common.type;

import lombok.Getter;

@Getter
public enum ResponseCode {
    OK("000"),
    INTERNAL_SERVER_ERROR("100", "서버 오류입니다. 고객센터로 문의해주세요."),
    NOT_FOUND_MEMBER("200", "고객 정보를 찾을 수 없습니다. 고객센터로 문의해주세요.")
    ;


    private final String code;
    private final String description;


    ResponseCode(String code) {
        this.code = code;
        this.description = "성공";
    }

    ResponseCode(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
