package kr.co.pmgk.sample.sample3.dao.ibatisImpl;

import java.util.List;

import kr.co.pmgk.core.common.dataaccess.AbstractDAO;
import kr.co.pmgk.sample.sample3.dao.MemberDetailDAO;
import kr.co.pmgk.sample.sample3.vo.MemberDetailVO;

import org.springframework.stereotype.Repository;

@Repository("memberDetailDAO")
public class MemberDetailDAOImpl extends AbstractDAO implements MemberDetailDAO{
	public List<MemberDetailVO> memberDetailSelect(MemberDetailVO vo) throws Exception{
		System.out.println("MemberDetailDAO : memberDetailSelect Start");
		return list("MemberDetailDAO.memberDetailSelect", vo);
	}
	
	public Object memberDetailInsert(MemberDetailVO vo) throws Exception{
		System.out.println("MemberDetailDAO : memberDetailInsert Start");
		return insert("MemberDetailDAO.memberDetailInsert", vo);
	}
	
	public int memberDetailUpdate(MemberDetailVO vo) throws Exception{
		System.out.println("MemberDetailDAO : memberDetailUpdate Start");
		return update("MemberDetailDAO.memberDetailUpdate", vo);
	}
	
	public int memberDetailDelete(MemberDetailVO vo) throws Exception{
		System.out.println("MemberDetailDAO : memberDetailDelete Start");
		return delete("MemberDetailDAO.memberDetailDelete", vo);
	}

}
