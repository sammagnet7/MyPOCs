package com.bagic.Channelservices.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bagic.Channelservices.domain.PolicyDO;
import com.bagic.Channelservices.domain.ProposerDO;
import com.bagic.Channelservices.dto.ProposerDTO;
import com.bagic.Channelservices.extReqRespModel.QuickQuoteExtReq;
import com.bagic.Channelservices.extReqRespModel.QuickQuoteExtResp;
import com.bagic.Channelservices.reqRespModel.Proposer;

@Component
public class TravelInfrastructureImpl implements TravelInfastructure {

	@Autowired
	TravelService tsrv;
	
	@Autowired
	PolicyDO polDO;
	
	@Autowired
	ProposerDO propDO;

	


	@Override
	public void quickQuote(ProposerDTO propDTO) {
		Proposer p =new Proposer();
		QuickQuoteExtReq qext= new QuickQuoteExtReq();
		qext.setProp(p);
		this.extReqstHelper(qext, propDTO);
		QuickQuoteExtResp resp = tsrv.travelRestMethodCall(qext);
		this.extRespHelper(resp);	
	}
	
	
	
	private void extReqstHelper(QuickQuoteExtReq q, ProposerDTO p) {
		q.getProp().setId(p.getId());
		q.getProp().setName(p.getName());
	}
	
	private void extRespHelper(QuickQuoteExtResp q) {
		polDO.setPolicyName(q.getQ().getPolicyName());
		polDO.setQuoteId(q.getQ().getQuoteId());
		propDO.setId(q.getProp().getId());
		propDO.setName(q.getProp().getName());
		
	}


}
