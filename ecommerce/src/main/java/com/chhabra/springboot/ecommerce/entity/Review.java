package com.chhabra.springboot.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
	
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(Integer id, String userId, String productId, String userName, String rating, String comment) {
		super();
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.userName = userName;
		this.rating = rating;
		this.comment = comment;
	}
	@Id
	@GeneratedValue
	private Integer id;
	private String userId;
	private String productId;
	private String userName;
	private String rating;
	private String comment;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", userId=" + userId + ", userName=" + userName + ", rating=" + rating
				+ ", comment=" + comment + "]";
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	

}
