package com.example.springbootnyano;


import com.example.springbootnyano.util.EmailSenderUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@SpringBootTest
public class SendEmailTest {
    @Autowired
    private EmailSenderUtil emailSenderUtil;

    @Test
    void sendTestEmail(){
        String to = "phamquangduong07@gmail.com";
        String subject = "Test OTP simple";
        String content="This is a test 12341";
        emailSenderUtil.sendTextEmail(to, subject, content);
    }

    @Test
    void sendHTMLEmail() throws IOException {
        String to = "phamquangduong07@gmail.com";
        String subject = "Test OTP HTML";
        String content="OTP is 1234";
        Resource resource = new ClassPathResource("/templates/email/otp-auth.html");

        String htmlContent = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);

        emailSenderUtil.sendHtmlEmail(to, subject, htmlContent);
    }
}
