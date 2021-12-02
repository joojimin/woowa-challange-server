package com.woowachallenge.server.challenge.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ChallengeGroupReward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUP_ID")
    private ChallengeGroup group;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REWARD_ID")
    private ChallengeReward reward;
}
