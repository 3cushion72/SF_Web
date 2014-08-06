package kr.co.pmgk.sample.sample3.dao;

import java.util.List;

import kr.co.pmgk.sample.sample3.vo.MemberDetailVO;

public interface MemberDetailDAO {
	public List<MemberDetailVO> memberDetailSelect(MemberDetailVO vo) throws Exception;
	public Object memberDetailInsert(MemberDetailVO vo) throws Exception;
	public int memberDetailUpdate(MemberDetailVO vo) throws Exception;
	public int memberDetailDelete(MemberDetailVO vo) throws Exception;
}
