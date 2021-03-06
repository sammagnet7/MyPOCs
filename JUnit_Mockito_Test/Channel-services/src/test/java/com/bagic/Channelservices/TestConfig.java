package com.bagic.Channelservices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bagic.Channelservices.extReqRespModel.QuickQuoteExtResp;
import com.bagic.Channelservices.reqRespModel.QuickQuoteUiResp;
import com.bagic.Channelservices.reqRespModel.QuikQuoteUiReq;
import com.fasterxml.jackson.databind.ObjectMapper;

  @Configuration 
  public class TestConfig {
	  
	  @Bean
	  public QuikQuoteUiReq quikQuoteUiReqMock() throws IOException {
		  QuikQuoteUiReq qReq= new QuikQuoteUiReq(); 
		  ObjectMapper objm= new ObjectMapper();
		  String b= new String(Files.readAllBytes(Paths.get("src/test/resources/"+"QuikQuoteUiReqMock.json")));
		  qReq= objm.readValue(b, QuikQuoteUiReq.class);
		  return qReq; 
	  }
	  
	  @Bean
	  public QuickQuoteUiResp quickQuoteUiRespMock() throws IOException {
		  QuickQuoteUiResp qRes= new QuickQuoteUiResp(); 
		  ObjectMapper objm= new ObjectMapper();
		  String b= new String(Files.readAllBytes(Paths.get("src/test/resources/"+"QuickQuoteUiRespMock.json")));
		  qRes= objm.readValue(b, QuickQuoteUiResp.class);
		  return qRes; 
	  	  }
	  
	  @Bean(name="quickQuoteExtRespMock") 
	  public QuickQuoteExtResp quickQuoteExtResp() throws IOException {
		  QuickQuoteExtResp qRes= new QuickQuoteExtResp(); 
		  ObjectMapper objm= new ObjectMapper();
		  String b= new String(Files.readAllBytes(Paths.get("src/test/resources/"+"QuickQuoteExtRespMock.json")));
		  qRes= objm.readValue(b, QuickQuoteExtResp.class);
		  return qRes; 
	  }  
	 
  
  }
 