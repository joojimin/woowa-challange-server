package com.woowachallange.server.member.infrastructure;

import com.woowachallange.server.member.domain.Members;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersJpaRepository extends JpaRepository<Members, Long> {

}
