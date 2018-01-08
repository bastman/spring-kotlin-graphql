package com.example.api.ping

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

@RestController
class PingApiController {

    @PostMapping("/api/ping")
    fun ping(@RequestBody req:PingRequest) = PingResponse(message = req.message, now = Instant.now())
}

data class PingRequest(val message:String)
data class PingResponse(val message:String, val now:Instant)