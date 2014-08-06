package kr.co.pmgk.sample.sample3.service;

import java.util.List;

import kr.co.pmgk.sample.sample3.vo.MemberDetailVO;
import kr.co.pmgk.sample.sample3.vo.MemberVO;

public interface MemberService {
	// ibatis test
	public List<MemberVO> memberSelect(MemberVO vo) throws Exception;
	public Object memberInsert(MemberVO vo) throws Exception;
	public int memberUpdate(MemberVO vo) throws Exception;
	public int memberDelete(MemberVO vo) throws Exception;
	public int memberUpdateInsert(MemberVO vo1, MemberVO vo2) throws Exception;
	public int transactionTest2(MemberVO vo1, MemberDetailVO vo2) throws Exception;

	// mybatis test
	public List<MemberVO> memberMybatisSelect(MemberVO vo) throws Exception;
	public Object memberMybatisInsert(MemberVO vo) throws Exception;
	public int memberMybatisUpdate(MemberVO vo) throws Exception;
	public int memberMybatisDelete(MemberVO vo) throws Exception;

}
