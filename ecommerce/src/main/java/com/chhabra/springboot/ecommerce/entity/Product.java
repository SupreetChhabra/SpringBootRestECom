package com.chhabra.springboot.ecommerce.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Product {

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Product(Integer id, String name, String description, String price, String rating, String category,
			String stock, String numOfReviews, String user, String createdAt, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.rating = rating;
		this.category = category;
		this.stock = stock;
		this.numOfReviews = numOfReviews;
		this.user = user;
		this.createdAt = createdAt;
		this.birthDate = birthDate;
	}



	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String description;
	private String price;
	private String rating;
	private String category;
	private String stock;
	private String numOfReviews;
	private String user;
	private String createdAt;
	public Product(Integer id, String name, String description, String price, String rating, String category,
			String stock, String numOfReviews, String user, String createdAt, Date birthDate, List<Images> images) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.rating = rating;
		this.category = category;
		this.stock = stock;
		this.numOfReviews = numOfReviews;
		this.user = user;
		this.createdAt = createdAt;
		this.birthDate = birthDate;
		this.images = images;
	}



	public List<Images> getImages() {
		return images;
	}



	public void setImages(List<Images> images) {
		this.images = images;
	}



	private Date birthDate;
	
	@OneToMany(targetEntity=Images.class, cascade = CascadeType.ALL)
	@JoinColumn(name="pid", referencedColumnName = "id" )
	private List<Images> images; 



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



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getRating() {
		return rating;
	}



	public void setRating(String rating) {
		this.rating = rating;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getStock() {
		return stock;
	}



	public void setStock(String stock) {
		this.stock = stock;
	}



	public String getNumOfReviews() {
		return numOfReviews;
	}



	public void setNumOfReviews(String numOfReviews) {
		this.numOfReviews = numOfReviews;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}



	public String getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}



	public Date getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", rating=" + rating + ", category=" + category + ", stock=" + stock + ", numOfReviews="
				+ numOfReviews + ", user=" + user + ", createdAt=" + createdAt + ", birthDate=" + birthDate + "]";
	}


}
