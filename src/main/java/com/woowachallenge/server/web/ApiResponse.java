package com.woowachallenge.server.web;

import com.woowachallenge.server.common.type.ResponseCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ApiResponse<T> {

    private String code;
    private String message;
    private T result;

    private ApiResponse(String code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public static <T> ApiResponse<T> ok(T result) {
        return new ApiResponse<>(ResponseCode.OK.getCode(),
                ResponseCode.OK.getDescription(),
                result);
    }

    public static ApiResponse<Void> failed(ResponseCode responseCode) {
        return new ApiResponse<>(responseCode.getCode(),
                responseCode.getDescription(),
                null);
    }
}
