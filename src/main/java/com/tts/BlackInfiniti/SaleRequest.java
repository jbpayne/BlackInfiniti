package com.tts.BlackInfiniti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class SaleRequest {

	@SequenceGenerator(name = "SR_SEQ", sequenceName = "sr_sequence")

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQ")
	private Long ticketID;
	private Long id;
	private String typeOfSale;
	private Long stockNumber;

	SaleRequest() {
		
	}
	
	SaleRequest(Long id, String typeOfSale, Long stockNumber) {
		this.setId(id);
		this.setTypeOfSale(typeOfSale);
		this.setStockNumber(stockNumber);
	}

	public Long getTicketID() {
		return ticketID;
	}

	public void setTicketID(Long ticketID) {
		this.ticketID = ticketID;
	}

	public String getTypeOfSale() {
		return typeOfSale;
	}

	public void setTypeOfSale(String typeOfSale) {
		this.typeOfSale = typeOfSale;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(Long stockNumber) {
		this.stockNumber = stockNumber;
	}

}
