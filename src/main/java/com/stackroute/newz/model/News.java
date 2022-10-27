package com.stackroute.newz.model;

import java.time.LocalDateTime;

/* 
 * Annotate the class with @Component annotation. 
 * @Component annotation is used to crete singleton instance of of the class
 *
 */


/*
 * The class "News" will be acting as the data model for the News data in the ArrayList.
 */
@Component
public class News {
	
	/*
	 * This class should have five fields (newsId, title, author,
	 * description, content and publishedAt). This class should also contain the getters and
	 * setters for the fields. The value of publishedAt should not be accepted from
	 * the user but should be always initialized with the system date
	 */
    
	private Integer newsid;
	private String title;
	private String author;
	private String description;
	private String content;
	private LocalDateTime publishedAt = LocalDateTime.now();
	   
    public News(Integer newsid, String title, String author, String description, String content,
			LocalDateTime publishedAt) {
		super();
		this.newsid = newsid;
		this.title = title;
		this.author = author;
		this.description = description;
		this.content = content;
		this.publishedAt = publishedAt;
	}

	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNewsid() {
		return newsid;
	}

	public void setNewsid(Integer newsid) {
		this.newsid = newsid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(LocalDateTime publishedAt) {
		this.publishedAt = publishedAt;
	}

	@Override
	public String toString() {
		return "News [newsid=" + newsid + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", content=" + content + ", publishedAt=" + publishedAt + "]";
	}
     	
	
	  }
