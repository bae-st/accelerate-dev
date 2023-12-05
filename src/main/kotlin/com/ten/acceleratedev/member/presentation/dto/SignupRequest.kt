package com.ten.acceleratedev.member.presentation.dto

import org.jetbrains.annotations.NotNull

data class SignupRequest(
  @field:NotNull()
  val id: String,

  @field:NotNull()
  val password: String,

  @field:NotNull()
  val name: String,
)
