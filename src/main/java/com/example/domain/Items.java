package com.example.domain;

import lombok.Data;

@Data
public class Items {

	private Integer id;
	private String name;
	private String description;
	private Integer priceM;
	private Integer priceL;
	private String imagePath;
	private Boolean deleted;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Integer getPriceM() {
		return priceM;
	}



	public void setPriceM(Integer priceM) {
		this.priceM = priceM;
	}



	public Integer getPriceL() {
		return priceL;
	}



	public void setPriceL(Integer priceL) {
		this.priceL = priceL;
	}



	public String getImagePath() {
		return imagePath;
	}



	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}



	public Boolean getDeleted() {
		return deleted;
	}



	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}



	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", description=" + description + ", priceM=" + priceM
				+ ", priceL=" + priceL + ", imagePath=" + imagePath + ", deleted=" + deleted + "]";
	}
	
	
}
