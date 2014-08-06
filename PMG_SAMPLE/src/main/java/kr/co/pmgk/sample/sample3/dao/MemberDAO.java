package kr.co.pmgk.sample.sample3.dao;

import java.util.List;

import kr.co.pmgk.sample.sample3.vo.MemberVO;

public interface MemberDAO {
	public List<MemberVO> memberSelect(MemberVO vo) throws Exception;
	public Object memberInsert(MemberVO vo) throws Exception;
	public int memberUpdate(MemberVO vo) throws Exception;
	public int memberDelete(MemberVO vo) throws Exception;
}
