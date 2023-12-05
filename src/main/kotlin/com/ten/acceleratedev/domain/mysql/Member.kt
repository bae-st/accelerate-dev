package com.ten.acceleratedev.domain.mysql

import jakarta.persistence.*

@Entity
class Member(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val memberId: Long? = null,

  @Column
  val id: String,

  @Column
  val password: String,

  @Column
  val name: String,

)
