package com.ten.acceleratedev.domain.mysql

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : JpaRepository<Member, Long> {
  fun findById(id: String): Member?
}
