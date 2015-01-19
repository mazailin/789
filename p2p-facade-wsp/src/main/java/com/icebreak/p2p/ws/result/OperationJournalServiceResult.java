package com.icebreak.p2p.ws.result;

import com.icebreak.p2p.ws.info.OperationJournalInfo;

public class OperationJournalServiceResult extends P2PBaseResult {
	
	/** Comment for <code>serialVersionUID</code> */
	private static final long serialVersionUID = 778793500429870690L;
	
	private OperationJournalInfo operationJournalInfo;
	
	public OperationJournalInfo getOperationJournalInfo() {
		return operationJournalInfo;
	}
	
	public void setOperationJournalInfo(OperationJournalInfo operationJournalInfo) {
		this.operationJournalInfo = operationJournalInfo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OperationJournalServiceResult [operationJournalInfo=");
		builder.append(operationJournalInfo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
