package com.icebreak.p2p.ws.base.info;

import com.icebreak.util.lang.util.money.Money;

public class BankConfigInfo {
	/** 银行编码*/
	private String	bankCode;
	
	/** 银行名称*/
	private String	bankName;
	
	/** 代扣额度*/
	private Money	withholdingAmount	= Money.zero();
	
	/**提现额度*/
	private Money	withdrawAmount		= Money.zero();
	
	/**签约方式*/
	private String	signedWay;
	
	/**图片url*/
	private String	logoUrl;
	
	/**银行状态*/
	private String	isStop;
	
	/**银行备注*/
	private String	memo;
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public Money getWithholdingAmount() {
		return withholdingAmount;
	}
	
	public void setWithholdingAmount(Money withholdingAmount) {
		this.withholdingAmount = withholdingAmount;
	}
	
	public Money getWithdrawAmount() {
		return withdrawAmount;
	}
	
	public void setWithdrawAmount(Money withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	
	public String getSignedWay() {
		return signedWay;
	}
	
	public void setSignedWay(String signedWay) {
		this.signedWay = signedWay;
	}
	
	public String getLogoUrl() {
		return logoUrl;
	}
	
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	
	public String getIsStop() {
		return isStop;
	}
	
	public void setIsStop(String isStop) {
		this.isStop = isStop;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankConfigInfo [bankCode=");
		builder.append(bankCode);
		builder.append(", bankName=");
		builder.append(bankName);
		builder.append(", withholdingAmount=");
		builder.append(withholdingAmount);
		builder.append(", withdrawAmount=");
		builder.append(withdrawAmount);
		builder.append(", signedWay=");
		builder.append(signedWay);
		builder.append(", logoUrl=");
		builder.append(logoUrl);
		builder.append(", isStop=");
		builder.append(isStop);
		builder.append(", memo=");
		builder.append(memo);
		builder.append("]");
		return builder.toString();
	}
	
}
