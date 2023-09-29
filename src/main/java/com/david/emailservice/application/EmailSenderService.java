package com.david.emailservice.application;

import org.springframework.stereotype.Service;

import com.david.emailservice.adapters.EmailSenderGateway;
import com.david.emailservice.core.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    public EmailSenderService(EmailSenderGateway emailSenderGateway) {

        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {

        this.emailSenderGateway.sendEmail(to, subject, body);
    }

}
