package com.bagic.Channelservices.reqRespModel;

public class Quote {

	private String QuoteId;
	
	private String policyName;

	public Quote() {
		super();
	}

	public String getQuoteId() {
		return QuoteId;
	}

	public void setQuoteId(String quoteId) {
		QuoteId = quoteId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

}
