package com.example.ContactAppBack;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

@SpringBootTest
class LisBackApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void sendSms() throws JsonProcessingException, ParseException, UnsupportedEncodingException, URISyntaxException, NoSuchAlgorithmException, InvalidKeyException {
		SmsService.sendSms("제목입니다","01046766654","성공?");
	}

}
