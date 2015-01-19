package com.icebreak.p2p.charge.impl;

import com.icebreak.p2p.charge.TradeChargeService;
import com.icebreak.p2p.dataobject.Trade;
import com.icebreak.p2p.dataobject.TradeDetail;

public class TradeChargeServiceImpl implements TradeChargeService {

	@Override
	public long getAmount(Trade trade) {
		return 0;
	}

	@Override
	public long getAmount(TradeDetail tradeDetail) {
		return tradeDetail.getAmount();
	}
}
