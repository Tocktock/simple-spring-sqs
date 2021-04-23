package com.example.aws.SQS

import com.amazonaws.services.sqs.model.SendMessageResult

interface AmazonSQSApiCaller {
   fun sendMessage(message : String) : SendMessageResult
}