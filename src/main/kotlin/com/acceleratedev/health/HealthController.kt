package com.acceleratedev.health

import com.acceleratedev.common.ApiResponse
import com.acceleratedev.common.createApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController() {
    @GetMapping("/health")
    suspend fun health(): ApiResponse {
        return createApiResponse(data = "good")
    }
}
