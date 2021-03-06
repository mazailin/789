package com.icebreak.p2p.ws.order;

import java.util.List;
import java.util.Map;

public class SendMailOrder {
	/** 发送地址 */
	private List<String> to;
	
	/** 邮件主题 */
	private String subject;
	
	/** 邮件消息 */
	private String content;
	
	/** 模板id */
	private long templateId;
	
	/** 模板参数 */
	private Map<String, String> templateParameter;
	
	/** 使用客户端名称，用于统计 */
	private String clientName;
	
	/** 邮件附件 servletPath + "/WEB-INF/doc/ppt/销售策略.ppt" */
	private String[] attachs;
	
	public SendMailOrder() {
		
	}
	
	public SendMailOrder(List<String> to, String subject, String content, long templateId,
							Map<String, String> templateParameter, String clientName) {
		this.to = to;
		this.subject = subject;
		this.content = content;
		this.templateId = templateId;
		this.templateParameter = templateParameter;
		this.clientName = clientName;
	}
	
	public List<String> getTo() {
		return to;
	}
	
	public void setTo(List<String> to) {
		this.to = to;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public long getTemplateId() {
		return templateId;
	}
	
	public void setTemplateId(long templateId) {
		this.templateId = templateId;
	}
	
	public Map<String, String> getTemplateParameter() {
		return templateParameter;
	}
	
	public void setTemplateParameter(Map<String, String> templateParameter) {
		this.templateParameter = templateParameter;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public String[] getAttachs() {
		return this.attachs;
	}
	
	public void setAttachs(String[] attachs) {
		this.attachs = attachs;
	}
	
}
