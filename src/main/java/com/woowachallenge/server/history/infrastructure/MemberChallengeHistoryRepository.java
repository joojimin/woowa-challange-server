package com.woowachallenge.server.history.infrastructure;

import com.woowachallenge.server.history.domain.MemberChallengeHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberChallengeHistoryRepository extends JpaRepository<MemberChallengeHistory, Long> {
}
