package com.rometools.rome.feed.synd;


public interface SyndMedia{

	public String getTitle();

	public String getContentUrl();
	
	public String getThumbnailUrl();

	public String getDescription();

	public void setTitle(String title);

	public void setContentUrl(String contentUrl);

	public void setThumbnailUrl(String thumbnailUrl);

	public void setDescription(String description);
	

}
