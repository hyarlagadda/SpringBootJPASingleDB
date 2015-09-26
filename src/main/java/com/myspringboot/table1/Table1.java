package com.myspringboot.table1;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Table1 {
	
	 protected Table1() {}
	 
	 public Table1(String serialPin, String maximoLCStatus,String maximoFinStatus,Date TermDt, Date LastSnDt) {
	        this.serialPin = serialPin;
	        this.maximoLCStatus = maximoLCStatus;
	        this.maximoFinStatus = maximoFinStatus;
	        this.TermDt = TermDt;
	    }
	
	@Column(name = "SER_PIN_NO")
	private String serialPin;  
	
	@Column(name = "ATTST")
	private String maximoLCStatus;
    
	@Id
	@Column(name = "EVENT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int EventId;
    
	@Column(name = "RESP_CD")
	private String maximoFinStatus ;
    
    
	@Column(name = "TERMN_DT")
	private Date TermDt;
	


	public String getSerialPin() {
		return serialPin;
	}
	public void setSerialPin(String serialPin) {
		this.serialPin = serialPin;
	}
	public String getMaximoLCStatus() {
		return maximoLCStatus;
	}
	public void setMaximoLCStatus(String maximoLCStatus) {
		this.maximoLCStatus = maximoLCStatus;
	}
	public int getEventId() {
		return EventId;
	}
	public void setEventId(int eventId) {
		EventId = eventId;
	}
	public String getMaximoFinStatus() {
		return maximoFinStatus;
	}
	public void setMaximoFinStatus(String maximoFinStatus) {
		this.maximoFinStatus = maximoFinStatus;
	}

	public Date getTermDt() {
		return TermDt;
	}
	public void setTermDt(Date termDt) {
		TermDt = termDt;
	}

	   @Override
	    public String toString() {
	        return String.format(
	                "Customer[EventId=%d, serialPin='%s', maximoLCStatus='%s',maximoFinStatus='%s',TermDt='%s']",
	                EventId,serialPin, maximoLCStatus, maximoFinStatus,TermDt);	    
	        }
}
