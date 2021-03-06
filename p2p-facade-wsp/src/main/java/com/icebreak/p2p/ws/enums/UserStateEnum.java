package com.icebreak.p2p.ws.enums;

import java.util.ArrayList;
import java.util.List;

public enum UserStateEnum {
	
	FREEZE("freeze", "冻结"),
	
	INACTIVE("inactive", "未激活"),
	
	DISABLE("disable", "禁用"),
	
	NORMAL("normal", "正常");
	
	private final String	code;
	private final String	message;
	
	private UserStateEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}
	
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
	 * @return LogResultEnum
	 */
	public static UserStateEnum getByCode(String code) {
		for (UserStateEnum _enum : values()) {
			if (_enum.getCode().equalsIgnoreCase(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 * 
	 * @return List<LogResultEnum>
	 */
	public List<UserStateEnum> getAllEnum() {
		List<UserStateEnum> list = new ArrayList<UserStateEnum>();
		for (UserStateEnum _enum : values()) {
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
		for (UserStateEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
	
}
