package com.example.demo;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.keystone.TokenRequested;
import com.example.keystone.TokenResponsed;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "Hello, Spring Boot!";
	}
  
	@RequestMapping("/token")
	public HttpEntity<String> post() throws IOException {
		final String uri = "IP";
		
		String id = "ID";
		String password = "PW";
		String domain = "DOMAIN";
		
		TokenRequested json = new TokenRequested();
		
		json.setDomain(domain);
		json.setId(id);
		json.setPassword(password);
		
		// header 설정
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		// body 설정
		HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headers);
		
		// keystone에 post로 요청
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> response = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
		
		// header, body 부분 추출
		headers = response.getHeaders();
		String body = response.getBody();
		
		// keystone으로부터 응답받은 body(json 포맷)를 객체에 매핑
		ObjectMapper mapper = new ObjectMapper();
		TokenResponsed tokenResponsed = mapper.readValue(body, TokenResponsed.class);
		
		entity = new HttpEntity<String>(tokenResponsed.toString() + "\r\n\r\n" + headers.getValuesAsList("X-Subject-Token"), new HttpHeaders());
		
		return entity;
	}
	
	@RequestMapping("/get")
	public @ResponseBody String get() {
		RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        
        return quote.toString();
	}

	@RequestMapping("/post")
	public HttpEntity<String> requestPost(@RequestHeader("string") String string, @RequestBody RequestPostSample requestPostSample) throws JsonProcessingException {
		String json = "";
		
		String temp = requestPostSample.getName();
		
		requestPostSample.setName(requestPostSample.getId());
		requestPostSample.setId(temp);
		
		ObjectMapper mapper = new ObjectMapper();

		json = mapper.writeValueAsString(requestPostSample);
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("response", string + " added!");
			
		HttpEntity<String> entity = new HttpEntity<String>(json, headers);
		
		return entity;
	}
}