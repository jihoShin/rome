package com.rometools.rome.feed.synd;

import java.io.Serializable;

import com.rometools.rome.feed.impl.ObjectBean;

public class SyndMediaImpl implements Cloneable, Serializable, SyndMedia{
	
	private static final long serialVersionUID = 1L;
	
    private final ObjectBean objBean;
    
    public SyndMediaImpl() {
        objBean = new ObjectBean(this.getClass(), this);
    }

    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof SyndLinkImpl)) {
            return false;
        }
        return objBean.equals(other);
    }

    @Override
    public int hashCode() {
        return objBean.hashCode();
    }

    @Override
    public String toString() {
        return objBean.toString();
    }

    
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
