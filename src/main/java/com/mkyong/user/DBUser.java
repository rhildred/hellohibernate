package com.mkyong.user;
 
import java.util.Date;
 
/**
 * Dbuser generated by hbm2java
 */
public class DBUser implements java.io.Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -3960396761249882840L;
	private int userId;
	private String username;
	private String createdBy;
	private Date createdDate;
 
	public DBUser() {
	}
 
	public DBUser(int userId, String username, String createdBy,
			Date createdDate) {
		this.userId = userId;
		this.username = username;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}
 
	public int getUserId() {
		return this.userId;
	}
 
	public void setUserId(int userId) {
		this.userId = userId;
	}
 
	public String getUsername() {
		return this.username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	public String getCreatedBy() {
		return this.createdBy;
	}
 
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
 
	public Date getCreatedDate() {
		return this.createdDate;
	}
 
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
 
}