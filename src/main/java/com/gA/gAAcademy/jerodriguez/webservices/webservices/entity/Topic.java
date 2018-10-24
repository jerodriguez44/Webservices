package com.gA.gAAcademy.jerodriguez.webservices.webservices.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic {

	//id
	@Id
	@GeneratedValue
	private int id;
	//title
	@Column(name="title")
	private String title;
	
	//datepost
	@Column(name="datePost")
	private Date datePost;
	
	//description
	@Column(name="description")
	private String description;

	//author
	@Column(name="author")
	private int author;
	
	public Topic () {}
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getDatePost() {
		return datePost;
	}


	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getAuthor() {
		return author;
	}


	public void setAuthor(int author) {
		this.author = author;
	}


	public int getId() {
		return id;
	}


	public Topic(String title, Date datePost, String description) {
		super();
		this.title = title;
		this.datePost = datePost;
		this.description = description;
	}
	
	
	
}
