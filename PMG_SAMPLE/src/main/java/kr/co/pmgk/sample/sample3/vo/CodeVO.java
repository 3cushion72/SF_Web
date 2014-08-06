package kr.co.pmgk.sample.sample3.vo;

public class CodeVO {
	private String code_group_id;
	private String code_group_name;
	private String code_id;
	private String code_name;
	
	public String getCode_group_id() {
		return code_group_id;
	}
	public void setCode_group_id(String code_group_id) {
		this.code_group_id = code_group_id;
	}
	public String getCode_group_name() {
		return code_group_name;
	}
	public void setCode_group_name(String code_group_name) {
		this.code_group_name = code_group_name;
	}
	public String getCode_id() {
		return code_id;
	}
	public void setCode_id(String code_id) {
		this.code_id = code_id;
	}
	public String getCode_name() {
		return code_name;
	}
	public void setCode_name(String code_name) {
		this.code_name = code_name;
	}
	@Override
	public String toString() {
		return "CodeVO [code_group_id=" + code_group_id + ", code_group_name="
				+ code_group_name + ", code_id=" + code_id + ", code_name="
				+ code_name + "]";
	}
	
	
	
}
