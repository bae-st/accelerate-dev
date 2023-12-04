package com.ten.acceleratedev.member.application

import com.ten.acceleratedev.common.exception.UnAuthorizedException
import com.ten.acceleratedev.domain.mysql.Member
import com.ten.acceleratedev.domain.mysql.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
  private val memberRepository: MemberRepository,
) {
  fun signup(id: String, password: String, name: String) {
    val member: Member? = memberRepository.findById(id)

    member?.let {
      throw UnAuthorizedException("이미 존재하는 사용자가 있습니다.")
    }

    val newMember = Member(
      id = id,
      password = password,
      name = name
    )
    this.memberRepository.save(newMember)
  }

  fun login(id: String, name: String): Member? {
    return memberRepository.findById(id)
  }
}
