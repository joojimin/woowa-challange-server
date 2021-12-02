package com.woowachallenge.server.member.application;

import com.woowachallenge.server.common.exception.NotFoundMemberException;
import com.woowachallenge.server.member.domain.Members;
import com.woowachallenge.server.member.dto.EnterResponse;
import com.woowachallenge.server.member.infrastructure.MembersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class MemberService {

    private final MembersRepository membersRepository;

    public EnterResponse saveMembers() {
        Members members = membersRepository.save(new Members());
        return MemberResponseGenerator.makeEnterResponse(members);
    }

    @Transactional(readOnly = true)
    public EnterResponse findMembers(final Long memberId) {
        Members members = membersRepository.findById(memberId)
                .orElseThrow(() -> new NotFoundMemberException(memberId));
        return MemberResponseGenerator.makeEnterResponse(members);
    }
}
