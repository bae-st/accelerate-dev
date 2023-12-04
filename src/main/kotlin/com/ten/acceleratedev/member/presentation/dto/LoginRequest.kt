package com.ten.acceleratedev.member.presentation.dto

import jakarta.validation.constraints.NotNull

data class LoginRequest(
  @field:NotNull(message = "id는 필수 입력값입니다.")
  val id: String,

  @field:NotNull(message = "password는 필수 입력값입니다.")
  val password: String
)
