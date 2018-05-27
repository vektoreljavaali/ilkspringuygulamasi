package models;

import java.util.HashSet;
import java.util.Set;

public class owner {

	private Long id;
	private String ad;
	private String soyad;
	
	private Set<pet> pets = new HashSet<>();
	
	
	public Set<pet> getPets() {
		return pets;
	}
	public void setPets(Set<pet> pets) {
		this.pets = pets;
	}
	@Override
	public String toString() {
		return "owner [id=" + id + ", ad=" + ad + ", soyad=" + soyad + "]";
	}
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
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	
	
}
