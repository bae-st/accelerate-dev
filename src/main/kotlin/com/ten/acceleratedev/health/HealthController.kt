package com.ten.acceleratedev.health

import com.ten.acceleratedev.common.ApiResponse
import com.ten.acceleratedev.common.createApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController() {
  @GetMapping("/health")
  fun health(): ApiResponse {
    return createApiResponse(data = "good")
  }
}
