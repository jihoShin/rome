package com.rometools.rome.feed.atom;

import java.io.Serializable;

public class Media implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	
	private String title;
	
	private String contentUrl;

	private String thumbnailUrl;

	private String description;

	public String getTitle() {
		return title;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
