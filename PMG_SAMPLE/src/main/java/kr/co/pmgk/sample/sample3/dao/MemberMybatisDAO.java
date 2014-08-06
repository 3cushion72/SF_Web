package kr.co.pmgk.sample.sample3.dao;

import java.util.List;

import kr.co.pmgk.sample.sample3.vo.MemberVO;

public interface MemberMybatisDAO {
	public List<MemberVO> memberMybatisSelect(MemberVO vo) throws Exception;
	public Object memberMybatisInsert(MemberVO vo) throws Exception;
	public int memberMybatisUpdate(MemberVO vo) throws Exception;
	public int memberMybatisDelete(MemberVO vo) throws Exception;
}
