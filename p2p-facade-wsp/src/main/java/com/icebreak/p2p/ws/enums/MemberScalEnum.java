package com.icebreak.p2p.ws.enums;

import java.util.ArrayList;
import java.util.List;

public enum MemberScalEnum {
	
	/** 机构人员规模默认 */
	DEFAULT("5", 5, "机构人员规模默认"),
	
	/**机构人员规模高级*/
	VIP("8", 8, "机构人员规模高级");
	
	/** 枚举值 */
	private final String	code;
	
	/** 枚举描述 */
	private final String	message;
	
	private final int		value;
	
	/**
	 * 构造一个<code>MemberScal</code>枚举对象
	 *
	 * @param code
	 * @param message
	 */
	private MemberScalEnum(String code, int value, String message) {
		this.code = code;
		this.message = message;
		this.value = value;
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
	
	public int getValue() {
		return value;
	}
	
	/**
	 * 通过枚举<code>code</code>获得枚举
	 *
	 * @param code
	 * @return MemberScal
	 */
	public static MemberScalEnum getByCode(String code) {
		for (MemberScalEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 * 
	 * @return List<MemberScal>
	 */
	public List<MemberScalEnum> getAllEnum() {
		List<MemberScalEnum> list = new ArrayList<MemberScalEnum>();
		for (MemberScalEnum _enum : values()) {
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
		for (MemberScalEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
}
