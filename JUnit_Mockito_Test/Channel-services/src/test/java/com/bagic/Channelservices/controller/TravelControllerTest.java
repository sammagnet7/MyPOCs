package com.bagic.Channelservices.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bagic.Channelservices.extReqRespModel.QuickQuoteExtReq;
import com.bagic.Channelservices.extReqRespModel.QuickQuoteExtResp;
import com.bagic.Channelservices.infrastructure.TravelService;
import com.bagic.Channelservices.reqRespModel.QuickQuoteUiResp;
import com.bagic.Channelservices.reqRespModel.QuikQuoteUiReq;


	@SpringBootTest 
	public class TravelControllerTest {
  
		@MockBean 
		private TravelService tsrv;
  
		@Autowired 
		private TravelController tc;
  
		@Autowired
		private QuikQuoteUiReq quikQuoteUiReqMock;
		
		@Autowired
		private QuickQuoteUiResp quickQuoteUiRespMock;
  
		@Qualifier("quickQuoteExtRespMock")
		@Autowired
		private QuickQuoteExtResp qResp;
	 
		// given
		@BeforeEach
		void init() {	
			when(tsrv.travelRestMethodCall(Mockito.any(QuickQuoteExtReq.class))).thenReturn(qResp);
		}
  
		@Test 
		void test_Quickquote() {
			// when 
			QuickQuoteUiResp resp = tc.quickQuote(quikQuoteUiReqMock);
			// then 
			assertThat(resp).isEqualToComparingFieldByFieldRecursively(quickQuoteUiRespMock);  
		}
  
  }
 