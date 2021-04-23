package com.example.aws

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping()
class HelloController {

    @GetMapping("/")
    fun home(): String {
        return "s3-sns-sqs-s3 testing server"
    }

}