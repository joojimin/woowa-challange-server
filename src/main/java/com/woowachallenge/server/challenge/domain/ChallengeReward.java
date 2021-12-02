package com.woowachallenge.server.challenge.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChallengeReward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
