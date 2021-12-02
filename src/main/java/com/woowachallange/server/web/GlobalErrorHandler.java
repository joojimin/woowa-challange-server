package com.woowachallange.server.web;

import com.woowachallange.server.common.exception.NotFoundMemberException;
import com.woowachallange.server.common.type.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalErrorHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundMemberException.class)
    public ApiResponse<Void> notFoundMemberExceptionHandler(NotFoundMemberException ex) {
        log.error(ex.getMessage(), ex);
        return ApiResponse.failed(ResponseCode.NOT_FOUND_MEMBER);
    }


    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ApiResponse<Void> internalServerErrorHandler(Exception ex) {
        log.error(ex.getMessage(), ex);
        return ApiResponse.failed(ResponseCode.INTERNAL_SERVER_ERROR);
    }
}
