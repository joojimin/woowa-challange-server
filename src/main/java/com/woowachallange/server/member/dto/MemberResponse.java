package com.woowachallange.server.member.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class MemberResponse {

    private Long id;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    @Builder
    private MemberResponse(Long id, LocalDateTime createDate, LocalDateTime updateDate) {
        this.id = id;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }
}
