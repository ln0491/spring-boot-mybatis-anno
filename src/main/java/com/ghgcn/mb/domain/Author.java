package com.ghgcn.mb.domain;

import java.util.Date;


public class Author {

	
	private int authorId ;//int(11) unsigned NOT NULL作者ID主键
	private String authorUsername;//varchar(30) NOT NULL作者用户名
	private String authorPassword;//varchar(32) NOT NULL作者密码
	private String authorEmail;//varchar(50) NOT NULL作者邮箱
	private String authorBio;//varchar(1000) NULL作者简介
	private Date  registerTime ;//datetime NULL注册时
	
	
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorUsername() {
		return authorUsername;
	}
	public void setAuthorUsername(String authorUsername) {
		this.authorUsername = authorUsername;
	}
	public String getAuthorPassword() {
		return authorPassword;
	}
	public void setAuthorPassword(String authorPassword) {
		this.authorPassword = authorPassword;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public String getAuthorBio() {
		return authorBio;
	}
	public void setAuthorBio(String authorBio) {
		this.authorBio = authorBio;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorUsername=" + authorUsername + ", authorPassword="
				+ authorPassword + ", authorEmail=" + authorEmail + ", authorBio=" + authorBio + ", registerTime="
				+ registerTime + "]";
	}
	
	
}
