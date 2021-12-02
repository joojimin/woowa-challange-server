package com.woowachallenge.server.member.infrastructure;

import com.woowachallenge.server.member.domain.Members;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersRepository extends JpaRepository<Members, Long> {

}
