package kr.co.pmgk.sample.sample3.service;

import java.util.List;

import kr.co.pmgk.sample.sample3.vo.MemberDetailVO;

public interface MemberDetailService {
	public List<MemberDetailVO> memberDetailSelect(MemberDetailVO vo) throws Exception;
	public Object memberDetailInsert(MemberDetailVO vo) throws Exception;
	public int memberDetailUpdate(MemberDetailVO vo) throws Exception;
	public int memberDetailDelete(MemberDetailVO vo) throws Exception;
	public int memberDetailUpdateInsert(MemberDetailVO vo1, MemberDetailVO vo2) throws Exception;
}
