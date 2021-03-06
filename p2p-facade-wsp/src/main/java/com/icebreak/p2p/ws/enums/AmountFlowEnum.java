package com.icebreak.p2p.ws.enums;

import java.util.ArrayList;
import java.util.List;

public enum AmountFlowEnum {
	
	/** 投资 */
	AMOUNT_FLOW_INVEST("invest", "投资"),
	/** 还款*/
	AMOUNT_FLOW_REPAY("repay", "还款"),
	/** 收费*/
	AMOUNT_FLOW_CHARGE("charge", "收费"),
	/** 充值*/
	AMOUNT_FLOW_RECHARGE("recharge", "充值"),
	/**分润*/
	AMOUNT_FLOW_DIVISION("division", "分润"),
	/**提现*/
	AMOUNT_FLOW_WITHDRAW("withdraw", "提现"),
	/**交易流水*/
	AMOUNT_FLOW_TYPE_NORMAL("交易流水", "交易流水"),
	/** 分润流水 */
	AMOUNT_FLOW_TYPE_DIVISION("分润流水", "分润流水");
	
	/** 枚举值 */
	private final String	code;
	
	/** 枚举描述 */
	private final String	message;
	
	/**
	 * 构造一个<code>AmountFlowEnum</code>枚举对象
	 *
	 * @param code
	 * @param message
	 */
	private AmountFlowEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String code() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String message() {
		return message;
	}
	
	/**
	 * 通过枚举<code>code</code>获得枚举
	 *
	 * @param code
	 * @return AmountFlowEnum
	 */
	public static AmountFlowEnum getByCode(String code) {
		for (AmountFlowEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 * 
	 * @return List<AmountFlowEnum>
	 */
	public List<AmountFlowEnum> getAllEnum() {
		List<AmountFlowEnum> list = new ArrayList<AmountFlowEnum>();
		for (AmountFlowEnum _enum : values()) {
			list.add(_enum);
		}
		return list;
	}
	
	/**
	 * 获取全部枚举值
	 * 
	 * @return List<String>
	 */
	public List<String> getAllEnumCode() {
		List<String> list = new ArrayList<String>();
		for (AmountFlowEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
}
