package com.woowachallenge.server.challenge.domain;

import com.woowachallenge.server.common.type.ChallengeJoinType;
import com.woowachallenge.server.common.type.ChallengeOpenStatus;
import com.woowachallenge.server.common.type.CollectingType;
import com.woowachallenge.server.common.type.OrderCategory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
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
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
@Entity
public class ChallengeGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;

    @Enumerated(EnumType.STRING)
    private ChallengeJoinType joinType;

    @OneToMany(mappedBy = "group")
    private List<ChallengeItem> items = new ArrayList<>();

    @OneToMany(mappedBy = "group")
    private List<ChallengeGroupServiceType> groupServiceTypes = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private OrderCategory orderCategory;

    private String brandName;

    @Enumerated(EnumType.STRING)
    private CollectingType collectingType;

    @Enumerated(EnumType.STRING)
    private ChallengeOpenStatus openStatus;

    private int pieceCount;
    private int repeatCount;
    private LocalDateTime challengeStartDate;
    private LocalDateTime challengeEndDate;

    @OneToMany(mappedBy = "group")
    private List<ChallengeGroupReward> rewards = new ArrayList<>();

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime updateDate;
}
