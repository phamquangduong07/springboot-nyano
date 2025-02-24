package com.example.springbootnyano.service;

import com.example.springbootnyano.entity.email.EmailEntity;

public interface EmailService {
    String sendTextEmail(EmailEntity email);
    String sendHtmlEmail(EmailEntity email);
    String sendMailAttachment(EmailEntity email);

}
