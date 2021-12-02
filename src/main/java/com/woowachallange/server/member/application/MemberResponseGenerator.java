package com.woowachallange.server.member.application;

import com.woowachallange.server.member.domain.Members;
import com.woowachallange.server.member.dto.MemberResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberResponseGenerator {

    public static MemberResponse makeMemberResponse(final Members members) {
        return MemberResponse.builder()
                .memberId(members.getMemberId())
                .createDate(members.getCreateDate())
                .updateDate(members.getUpdateDate())
                .build();
    }
}
