package com.woowachallenge.server.member.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class MemberResponse {

    private Long memberId;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    @Builder
    private MemberResponse(Long memberId, LocalDateTime createDate, LocalDateTime updateDate) {
        this.memberId = memberId;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }
}
