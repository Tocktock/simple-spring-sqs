package com.example.aws.SQS.consumer

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener
import org.springframework.messaging.handler.annotation.Header
import org.springframework.web.bind.annotation.RestController

@RestController
class SQSListener {
    @SqsListener("\${cloud.aws.sqs.queue.url}")
    fun receive(message: String, @Header("SenderId") senderId: String) {
        println("$message and $senderId")
    }
}