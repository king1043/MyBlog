package com.pojo;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article implements java.io.Serializable {

	// Fields

	private Integer articleId;
	private Integer userId;
	private String title;
	private String content;
	private String abstract_;
	private String imgPath;
	private String date;
	private Integer readedCount;

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** minimal constructor */
	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}

	/** full constructor */
	public Article(Integer userId, String title, String content,
			String abstract_, String imgPath, String date, Integer readedCount) {
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.abstract_ = abstract_;
		this.imgPath = imgPath;
		this.date = date;
		this.readedCount = readedCount;
	}

	// Property accessors

	public Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getReadedCount() {
		return this.readedCount;
	}

	public void setReadedCount(Integer readedCount) {
		this.readedCount = readedCount;
	}

}