package com.org.microservices.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exchange {

	@Id
	private Long id;
	
	private BigDecimal conversionMultiple;
	
	@Column(name = "currency_from")
	private String from;
	
	@Column(name = "currency_to")
	private String to;
	
	private int port;
	
	public Exchange() {
		super();
	}

	public Exchange(Long id, BigDecimal conversionMultiple, String from, String to) {
		super();
		this.id = id;
		this.conversionMultiple = conversionMultiple;
		this.from = from;
		this.to = to;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", conversionMultiple=" + conversionMultiple + ", from=" + from + ", to="
				+ to + ", port=" + port + "]";
	}
}