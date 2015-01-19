package com.icebreak.p2p.ws.enums;

import java.util.ArrayList;
import java.util.List;

public enum ReturnEnum {
	/** 处理成功 */
	EXECUTE_SUCCESS("EXECUTE_SUCCESS", "处理成功"),
	/** 处理失败 */
	EXECUTE_FAILURE("EXECUTE_FAILURE", "处理失败"),
	/** 未知异常 */
	UN_KNOWN_EXCEPTION("UN_KNOWN_EXCEPTION", "未知异常"),
	/** 数据库异常 */
	DATA_ACCESS_EXCEPTION("DATA_ACCESS_EXCEPTION", "数据库异常");
	
	private final String code;
	private final String message;

	private ReturnEnum(String code, String message) {
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
	public static ReturnEnum getByCode(String code) {
		for (ReturnEnum _enum : values()) {
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
	public List<ReturnEnum> getAllEnum() {
		List<ReturnEnum> list = new ArrayList<ReturnEnum>();
		for (ReturnEnum _enum : values()) {
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
		for (ReturnEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}

}
