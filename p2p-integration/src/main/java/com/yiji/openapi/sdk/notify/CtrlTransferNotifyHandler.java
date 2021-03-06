package com.yiji.openapi.sdk.notify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yiji.openapi.sdk.message.yzz.CtrlTransferNotify;

import com.yiji.openapi.sdk.message.BaseNotify;

public class CtrlTransferNotifyHandler implements NotifyHandler {
	
	private static Logger logger = LoggerFactory.getLogger(CtrlTransferNotifyHandler.class);
	
	@Override
	public void handleNotify(BaseNotify notify) {
		logger.info("通知默认处理[打印]：" + notify);
		
		CtrlTransferNotify nty = (CtrlTransferNotify) notify;
		
		if ("EXECUTE_SUCCESS".equals(nty)) {
			
		}
		
	}
	
}
