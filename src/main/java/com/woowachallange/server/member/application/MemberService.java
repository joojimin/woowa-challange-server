package com.woowachallange.server.member.application;

import com.woowachallange.server.common.exception.NotFoundMemberException;
import com.woowachallange.server.member.domain.Members;
import com.woowachallange.server.member.dto.EnterResponse;
import com.woowachallange.server.member.infrastructure.MembersRepository;
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
