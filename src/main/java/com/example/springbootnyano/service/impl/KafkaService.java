package com.example.springbootnyano.service.impl;


import com.example.springbootnyano.entity.email.EmailEntity;
import com.example.springbootnyano.service.EmailService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaService {
//    @Autowired
//    private EmailService emailService;
//
//    private final ObjectMapper objectMapper = new ObjectMapper();
//
//    @KafkaListener(topics="opt-auth-topic",groupId="opt-group-id")
//    public void listenOTP(String message){
//        try{
//            JsonNode jsonNode = objectMapper.readTree(message);
//
//            String email = jsonNode.get("email").asText();
//            String otp = jsonNode.get("otp").asText();
//            log.info("otp is {}, email is {}",otp,email);
//            EmailEntity emailEntity = new EmailEntity();
//            emailEntity.setToEmail(email);
//        emailEntity.setSubject("SEND OTP FROM KAFKA GO");
//        emailEntity.setMessageBody("OTP IS "+ otp);
//        String result = emailService.sendTextEmail(emailEntity);
//        log.info("result is {}, email is {}, otpis {}", result,email,otp);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}
