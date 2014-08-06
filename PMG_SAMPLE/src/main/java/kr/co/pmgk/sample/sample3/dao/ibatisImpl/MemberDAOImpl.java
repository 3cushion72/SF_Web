package kr.co.pmgk.sample.sample3.dao.ibatisImpl;

import java.util.List;

import kr.co.pmgk.core.common.dataaccess.AbstractDAO;
import kr.co.pmgk.sample.sample3.dao.MemberDAO;
import kr.co.pmgk.sample.sample3.vo.MemberVO;

import org.springframework.stereotype.Repository;

@Repository("memberDAO")
public class MemberDAOImpl extends AbstractDAO implements MemberDAO{

	public List<MemberVO> memberSelect(MemberVO vo) throws Exception{
		System.out.println("memberDAO : memberSelect Start");
		return list("MemberDAO.memberSelect", vo);
	}
	
	public Object memberInsert(MemberVO vo) throws Exception{
		System.out.println("memberDAO : memberInsert Start");
		return insert("MemberDAO.memberInsert", vo);
	}
	
	public int memberUpdate(MemberVO vo) throws Exception{
		System.out.println("memberDAO : memberUpdate Start");
		return update("MemberDAO.memberUpdate", vo);
	}
	
	public int memberDelete(MemberVO vo) throws Exception{
		System.out.println("memberDAO : memberDelete Start");
		return delete("MemberDAO.memberDelete", vo);
	}

}
