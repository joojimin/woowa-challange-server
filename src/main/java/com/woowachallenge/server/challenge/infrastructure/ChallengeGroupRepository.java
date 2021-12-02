package com.woowachallenge.server.challenge.infrastructure;

import com.woowachallenge.server.challenge.domain.ChallengeGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChallengeGroupRepository extends JpaRepository<ChallengeGroup, Long> {
}
