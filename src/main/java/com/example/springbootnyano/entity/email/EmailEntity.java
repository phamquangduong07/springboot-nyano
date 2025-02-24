package com.example.springbootnyano.entity.email;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class EmailEntity {
    private String toEmail;

    private String subject;

    private String messageBody;

    private String attachment;


}
