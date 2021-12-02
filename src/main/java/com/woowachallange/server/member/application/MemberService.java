package com.woowachallange.server.member.application;

import com.woowachallange.server.member.domain.Members;
import com.woowachallange.server.member.dto.MemberResponse;
import com.woowachallange.server.member.infrastructure.MembersJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class MemberService {

    private final MembersJpaRepository membersJpaRepository;


    public MemberResponse saveMembers() {
        Members members = membersJpaRepository.save(new Members());
        return MemberResponse.builder()
                .id(members.getMemberId())
                .createDate(members.getCreateDate())
                .updateDate(members.getUpdateDate())
                .build();
    }
}
