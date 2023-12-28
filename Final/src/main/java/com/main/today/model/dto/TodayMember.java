package com.main.today.model.dto;

public class TodayMember {

	private String user_id; //유저 아이디
	private String user_pw; //유저 비밀번호
	private String user_pw_detail; // 비밀번호 확인
	private String user_name; // 유저 이름
	private String user_email; //유저 이메일 예)korea
	private String user_email_detail; //유저 이메일 뒷부분 예)naver.com
	private String user_post_code; //우편번호(자동입력)
	private String user_addr; //주소(자동입력)
	private String user_detail_addr; //상세주소(직접입력)
	private String user_extr_aaddr; //자세한주소(자동입력)
	
	public TodayMember() {
		super();
	}

	public TodayMember(String user_id, String user_pw, String user_pw_detail, String user_name, String user_email,
			String user_email_detail, String user_post_code, String user_addr, String user_detail_addr,
			String user_extr_aaddr) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_pw_detail = user_pw_detail;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_email_detail = user_email_detail;
		this.user_post_code = user_post_code;
		this.user_addr = user_addr;
		this.user_detail_addr = user_detail_addr;
		this.user_extr_aaddr = user_extr_aaddr;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_pw_detail() {
		return user_pw_detail;
	}

	public void setUser_pw_detail(String user_pw_detail) {
		this.user_pw_detail = user_pw_detail;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_email_detail() {
		return user_email_detail;
	}

	public void setUser_email_detail(String user_email_detail) {
		this.user_email_detail = user_email_detail;
	}

	public String getUser_post_code() {
		return user_post_code;
	}

	public void setUser_post_code(String user_post_code) {
		this.user_post_code = user_post_code;
	}

	public String getUser_addr() {
		return user_addr;
	}

	public void setUser_addr(String user_addr) {
		this.user_addr = user_addr;
	}

	public String getUser_detail_addr() {
		return user_detail_addr;
	}

	public void setUser_detail_addr(String user_detail_addr) {
		this.user_detail_addr = user_detail_addr;
	}

	public String getUser_extr_aaddr() {
		return user_extr_aaddr;
	}

	public void setUser_extr_aaddr(String user_extr_aaddr) {
		this.user_extr_aaddr = user_extr_aaddr;
	}

	
}
