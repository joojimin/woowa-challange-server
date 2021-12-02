package com.woowachallange.server.member.application;

import com.woowachallange.server.member.domain.Members;
import com.woowachallange.server.member.dto.EnterResponse;
import com.woowachallange.server.member.dto.MemberResponse;
import com.woowachallange.server.member.infrastructure.MembersJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class MemberService {

    private final MembersJpaRepository membersJpaRepository;

    public EnterResponse saveMembers() {
        Members members = membersJpaRepository.save(new Members());
        MemberResponse memberResponse = MemberResponseGenerator.makeMemberResponse(members);
        return EnterResponse.builder()
                .member(memberResponse)
                .build();
    }

    @Transactional(readOnly = true)
    public EnterResponse findMembers(final Long memberId) {
        Members members = membersJpaRepository.findById(memberId)
                .orElseThrow(() -> new RuntimeException("ERROR"));
        MemberResponse memberResponse = MemberResponseGenerator.makeMemberResponse(members);
        return EnterResponse.builder()
                .member(memberResponse)
                .build();
    }
}
