package com.bagic.Channelservices.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bagic.Channelservices.dto.ProposerDTO;
import com.bagic.Channelservices.infrastructure.TravelInfastructure;

@Component
public class ProposerDO {
	
	@Autowired
	private ProposerDTO pdto;
	
	@Autowired
	TravelInfastructure infra;

	
	public String getId() {
		return pdto.getId();
	}
	public void setId(String id) {
		pdto.setId(id);
	}
	public String getName() {
		return pdto.getName();
	}
	public void setName(String name) {
		pdto.setName(name);
	}
	
	public void quickQuote() {
		infra.quickQuote(this.pdto);
	}
	
}
