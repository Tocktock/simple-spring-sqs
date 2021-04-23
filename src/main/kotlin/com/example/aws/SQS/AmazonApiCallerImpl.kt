package com.example.aws.SQS

import com.amazonaws.services.sqs.AmazonSQS
import com.amazonaws.services.sqs.model.SendMessageResult
import org.springframework.stereotype.Component

@Component
class AmazonApiCallerImpl(
    private val amazonSQS: AmazonSQS,
    private val awsSQSComponent: AWSSQSComponent
) : AmazonSQSApiCaller {
    override fun sendMessage(message: String): SendMessageResult {
        return amazonSQS.sendMessage(awsSQSComponent.url, message)
    }
}