package com.example.aws.SQS

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "cloud.aws.sqs.queue")
class AWSSQSComponent(
) {
    lateinit var url: String
}