package com.bagic.Channelservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bagic.Channelservices.bl.TravelBL;
import com.bagic.Channelservices.reqRespModel.QuickQuoteUiResp;
import com.bagic.Channelservices.reqRespModel.QuikQuoteUiReq;

@RestController
@RequestMapping("/Channel-services")
public class TravelController {
	
	@Autowired
	TravelBL tbl;
	

	
	@PostMapping("/quickQuote")
	public QuickQuoteUiResp quickQuote(@RequestBody QuikQuoteUiReq q) {
		return tbl.quickquote(q);
	}

	public String demoMethod(String demo) {
		System.out.println("Hi this line is to check Sonarway rule java:S106");
		return tbl.demoMethod(demo) ;
	}

}
