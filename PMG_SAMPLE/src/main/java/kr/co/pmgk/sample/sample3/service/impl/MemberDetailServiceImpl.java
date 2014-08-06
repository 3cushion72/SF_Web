package kr.co.pmgk.sample.sample3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.co.pmgk.sample.sample3.dao.MemberDetailDAO;
import kr.co.pmgk.sample.sample3.service.MemberDetailService;
import kr.co.pmgk.sample.sample3.vo.MemberDetailVO;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("memberDetailService")
public class MemberDetailServiceImpl implements MemberDetailService{
	
	@Resource(name="memberDetailDAO")
	private MemberDetailDAO memberDetailDAO; 
	
	public List<MemberDetailVO> memberDetailSelect(MemberDetailVO vo) throws Exception{
		System.out.println("MemberDetailServiceImpl : memberDetailSelect Start");
		List<MemberDetailVO> memberDetailList = memberDetailDAO.memberDetailSelect(vo);
		System.out.println("MemberDetailServiceImpl : memberDetailSelect End");
		return memberDetailList;
	}
	
	public Object memberDetailInsert(MemberDetailVO vo) throws Exception{
		System.out.println("MemberDetailServiceImpl : memberDetailInsert Start");
		return memberDetailDAO.memberDetailInsert(vo);
	}
	
	public int memberDetailUpdate(MemberDetailVO vo) throws Exception{
		System.out.println("MemberDetailServiceImpl : memberDetailUpdate Start");
		return memberDetailDAO.memberDetailUpdate(vo);
	}
	
	public int memberDetailDelete(MemberDetailVO vo) throws Exception{
		System.out.println("MemberDetailServiceImpl : memberDetailDelete Start");
		return memberDetailDAO.memberDetailDelete(vo);
	}
	
	@Transactional
	public int memberDetailUpdateInsert(MemberDetailVO vo1, MemberDetailVO vo2) throws Exception{
		System.out.println("MemberDetailServiceImpl : memberDetailUpdateDelete Start");
		int result = 0;
		int result1 = 0;
		Object result2 = 0;
		
		result1 = memberDetailDAO.memberDetailUpdate(vo1);
		result2 = memberDetailDAO.memberDetailInsert(vo2);
		if(result1 == 1 && result2 == null) result = 1;
		return result;
	}
}
