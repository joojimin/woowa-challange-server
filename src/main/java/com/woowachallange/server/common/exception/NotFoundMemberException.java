package com.woowachallange.server.common.exception;

public class NotFoundMemberException extends RuntimeException {

    private static final String ERROR_MESSAGE = "멤버를 찾을 수 없습니다. memberId=%d";

    public NotFoundMemberException(final Long memberId) {
        super(String.format(ERROR_MESSAGE, memberId));
    }
}
