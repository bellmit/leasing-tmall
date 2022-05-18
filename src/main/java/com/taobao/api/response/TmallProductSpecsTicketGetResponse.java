package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Ticket;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: tmall.product.specs.ticket.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductSpecsTicketGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4793429923636774157L;

	/** 
	 * 产品规格审核单信息
	 */
	@ApiListField("tickets")
	@ApiField("ticket")
	private List<Ticket> tickets;


	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	public List<Ticket> getTickets( ) {
		return this.tickets;
	}
	


}
