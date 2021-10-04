package com.streetflo.miocat.service.rest;

import javax.mail.internet.MimeMessage;

public interface EmailService {
	void sendSimpleMessage(String to)throws Exception;
}
