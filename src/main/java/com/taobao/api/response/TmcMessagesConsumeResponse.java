package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TmcMessage;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.tmc.messages.consume response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcMessagesConsumeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3386625778327547981L;

	/** 
	 * 消息列表
	 */
	@ApiListField("messages")
	@ApiField("tmc_message")
	private List<TmcMessage> messages;


	public void setMessages(List<TmcMessage> messages) {
		this.messages = messages;
	}
	public List<TmcMessage> getMessages( ) {
		return this.messages;
	}
	


}
