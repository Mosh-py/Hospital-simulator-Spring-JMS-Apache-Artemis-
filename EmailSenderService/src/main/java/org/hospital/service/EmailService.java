package org.hospital.service;

import org.hospital.model.EmailDetails;

public interface EmailService {

	String sendSimpleMail(EmailDetails details);

	String sendMailWithAttachment(EmailDetails details);
}
