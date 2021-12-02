package com.woowachallenge.server.history.domain;

import com.woowachallenge.server.challenge.domain.ChallengeGroup;
import com.woowachallenge.server.common.type.ChallengeStatus;
import com.woowachallenge.server.member.domain.Members;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class MemberChallengeHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private Members members;

    @OneToOne
    @JoinColumn(name = "CHALLENGE_GROUP_ID")
    private ChallengeGroup challengeGroup;

    @Enumerated(EnumType.STRING)
    private ChallengeStatus status;

    private int collectCount;

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime updateDate;
}
