package com.woowachallenge.server.member.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EnterResponse {

    private MemberResponse member;

    @Builder
    private EnterResponse(MemberResponse member) {
        this.member = member;
    }
}
