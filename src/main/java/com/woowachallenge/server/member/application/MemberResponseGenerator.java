package com.woowachallenge.server.member.application;

import com.woowachallenge.server.member.domain.Members;
import com.woowachallenge.server.member.dto.EnterResponse;
import com.woowachallenge.server.member.dto.MemberResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberResponseGenerator {

    public static EnterResponse makeEnterResponse(final Members members) {
        MemberResponse memberResponse = getMemberResponse(members);
        return EnterResponse.builder()
                .member(memberResponse)
                .build();
    }

    private static MemberResponse getMemberResponse(Members members) {
        return MemberResponse.builder()
                .memberId(members.getMemberId())
                .createDate(members.getCreateDate())
                .updateDate(members.getUpdateDate())
                .build();
    }
}
