package kr.co.pmgk.sample.sample3.vo;

public class MemberVO {
	private String member_id;
	private String member_name;
	private String member_age;
	private String member_visitdate;
	private String member_etc;
	
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_age() {
		return member_age;
	}
	public void setMember_age(String member_age) {
		this.member_age = member_age;
	}
	public String getMember_visitdate() {
		return member_visitdate;
	}
	public void setMember_visitdate(String member_visitdate) {
		this.member_visitdate = member_visitdate;
	}
	public String getMember_etc() {
		return member_etc;
	}
	public void setMember_etc(String member_etc) {
		this.member_etc = member_etc;
	}
	
	
	@Override
	public String toString() {
		return "MemberVO [member_id=" + member_id + ", member_name="
				+ member_name + ", member_age=" + member_age
				+ ", member_visitdate=" + member_visitdate + ", member_etc="
				+ member_etc + "]";
	}
	
	
	
}
