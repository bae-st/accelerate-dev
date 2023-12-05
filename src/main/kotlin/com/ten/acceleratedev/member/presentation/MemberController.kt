package com.ten.acceleratedev.member.presentation

import com.ten.acceleratedev.common.ApiResponse
import com.ten.acceleratedev.member.presentation.dto.NewMemberResponse
import com.ten.acceleratedev.member.presentation.dto.SignupRequest
import com.ten.acceleratedev.common.createApiResponse
import com.ten.acceleratedev.member.application.MemberService
import com.ten.acceleratedev.member.presentation.dto.LoggedResponse
import com.ten.acceleratedev.member.presentation.dto.LoginRequest
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(
  private val memberService: MemberService,
) {
  @PostMapping("/signup")
  fun signup(
    @Valid @RequestBody signupRequest: SignupRequest
  ): ApiResponse {
    memberService.signup(
      id = signupRequest.id,
      name = signupRequest.name,
      password = signupRequest.password
    )
    return createApiResponse(
      data = NewMemberResponse(
        id = signupRequest.id,
        name = signupRequest.name,
      )
    )
  }

  @GetMapping("/login")
  fun login(
    @Valid @RequestBody login: LoginRequest
  ): ApiResponse {
    print(login)
    val token = memberService.login(login.id, login.password)
    return createApiResponse(
      data = LoggedResponse(token = "")
    )
  }
}
