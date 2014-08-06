package kr.co.pmgk.sample.sample3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.co.pmgk.sample.sample3.dao.MemberDAO;
import kr.co.pmgk.sample.sample3.dao.MemberDetailDAO;
import kr.co.pmgk.sample.sample3.dao.MemberMybatisDAO;
import kr.co.pmgk.sample.sample3.service.MemberService;
import kr.co.pmgk.sample.sample3.vo.MemberDetailVO;
import kr.co.pmgk.sample.sample3.vo.MemberVO;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <pre>
 * ibatis and mybatis 테스트
 * </pre>
 * @author Administrator
 *
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService{
	
	@Resource(name="memberDAO")
	private MemberDAO memberDAO; 

	@Resource(name="memberMybatisDAO")
	private MemberMybatisDAO memberMybatisDAO; 

	@Resource(name="memberDetailDAO")
	private MemberDetailDAO memberDetailDAO; 

	//----------------------------------------------
	// ibatis test
	//----------------------------------------------
	
	/**
	 * select sample
	 */
	public List<MemberVO> memberSelect(MemberVO vo) throws Exception{
		System.out.println("MemberServiceImpl : memberSelect Start");
		List<MemberVO> memberList = memberDAO.memberSelect(vo);
		System.out.println("MemberServiceImpl : memberSelect End");
		return memberList;
	}
	
	/**
	 * insert sample
	 */
	public Object memberInsert(MemberVO vo) throws Exception{
		System.out.println("MemberServiceImpl : memberInsert Start");
		return memberDAO.memberInsert(vo);
	}
	
	/**
	 * update sample
	 */
	public int memberUpdate(MemberVO vo) throws Exception{
		System.out.println("MemberServiceImpl : memberUpdate Start");
		return memberDAO.memberUpdate(vo);
	}
	
	/**
	 * delete sample
	 */
	public int memberDelete(MemberVO vo) throws Exception{
		System.out.println("MemberServiceImpl : memberDelete Start");
		return memberDAO.memberDelete(vo);
	}
	
	/**
	 * transaction test
	 */
	@Transactional
	public int memberUpdateInsert(MemberVO vo1, MemberVO vo2) throws Exception{
		System.out.println("MemberServiceImpl : memberUpdateDelete Start");
		int result = 0;
		int result1 = 0;
		Object result2 = 0;
		
		result1 = memberDAO.memberUpdate(vo1);
		result2 = memberDAO.memberInsert(vo2);
		if(result1 == 1 && result2 == null) result = 1;
		return result;
	}
	
	//@Transactional
	public int transactionTest2(MemberVO vo1, MemberDetailVO vo2) throws Exception{
		System.out.println("MemberServiceImpl : memberUpdateDelete Start");
		int result = 0;
		int result1 = 0;
		Object result2 = 0;
		
		result1 = memberDAO.memberUpdate(vo1);
		result2 = memberDetailDAO.memberDetailInsert(vo2);
		if(result1 == 1 && result2 == null) result = 1;
		return result;
	}

	//----------------------------------------------
	// mybatis test
	//----------------------------------------------
	
	/**
	 * select sample
	 */
	public List<MemberVO> memberMybatisSelect(MemberVO vo) throws Exception{
		List<MemberVO> memberList = memberMybatisDAO.memberMybatisSelect(vo);
		return memberList;
	}
	
	/**
	 * select sample
	 */
	public Object memberMybatisInsert(MemberVO vo) throws Exception{
		return memberMybatisDAO.memberMybatisInsert(vo);
	}
	
	/**
	 * upadte sample
	 */
	public int memberMybatisUpdate(MemberVO vo) throws Exception{
		return memberMybatisDAO.memberMybatisUpdate(vo);
	}
	
	/**
	 * delete sample
	 */
	public int memberMybatisDelete(MemberVO vo) throws Exception{
		return memberMybatisDAO.memberMybatisDelete(vo);
	}

}
