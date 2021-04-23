package com.example.aws.SQS

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(
    val amazonApiCallerImpl: AmazonApiCallerImpl
) {

    @PostMapping("/send")
    fun send(@RequestBody message: String): String {
        println(amazonApiCallerImpl.sendMessage(message))
        return "OK"
    }

}