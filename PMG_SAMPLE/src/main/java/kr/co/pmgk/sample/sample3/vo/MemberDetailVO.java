package kr.co.pmgk.sample.sample3.vo;

public class MemberDetailVO {
	private String member_id;
	private String member_email;
	private String member_phone;
	
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	
	
	@Override
	public String toString() {
		return "MemberDetailVO [member_id=" + member_id + ", member_email="
				+ member_email + ", member_phone=" + member_phone + "]";
	}
	
	
	
}
