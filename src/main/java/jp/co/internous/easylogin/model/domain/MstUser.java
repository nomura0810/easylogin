package jp.co.internous.easylogin.model.domain;

public class MstUser {
	
	// SpringBootが自動的にデータ型に合ったデータを入れてくれる
	// set/getを記載しておく必要がある。setだけでも可
	private int id;
	private String userName;
	private String password;
	private String fullName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
