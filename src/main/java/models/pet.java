package models;

import java.util.Date;

public class pet {

	private Long id;
	private String ad;
	private Date dogum;
	
	private owner own;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Date getDogum() {
		return dogum;
	}

	public void setDogum(Date dogum) {
		this.dogum = dogum;
	}

	public owner getOwn() {
		return own;
	}

	public void setOwn(owner own) {
		this.own = own;
	}
	
	
	
}
