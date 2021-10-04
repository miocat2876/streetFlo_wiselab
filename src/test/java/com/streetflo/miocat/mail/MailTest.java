package com.streetflo.miocat.mail;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("메일 테스트")
@Log4j2
public class MailTest {

	@DisplayName("메일 테스트2")
	@Test
	public void mail(){
		System.out.println("테스트");
		log.debug("test log");
		assertEquals("1","2");
	}
	
}
