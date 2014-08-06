package kr.co.pmgk.sample.sample3.dao.mybatisImpl;

import java.util.List;

import kr.co.pmgk.core.common.dataaccess.AbstractMapper;
import kr.co.pmgk.sample.TestSampleService;
import kr.co.pmgk.sample.sample3.dao.MemberMybatisDAO;
import kr.co.pmgk.sample.sample3.vo.MemberVO;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Logger;

@Repository("memberMybatisDAO")
public class MemberMybatisDAOImpl extends AbstractMapper implements MemberMybatisDAO {
	
	private Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

	@SuppressWarnings("unchecked")
	public List<MemberVO> memberMybatisSelect(MemberVO vo) throws Exception{
		if( log.isDebugEnabled() ) log.debug("MemberMybatisDAOImpl.memberMybatisSelect");
		return list("MemberMybatisDAO_memberMybatisSelect", vo);
	}
	
	public Object memberMybatisInsert(MemberVO vo) throws Exception{
		return insert("MemberMybatisDAO_memberMybatisInsert", vo);
	}
	
	public int memberMybatisUpdate(MemberVO vo) throws Exception{
		return update("MemberMybatisDAO_memberMybatisUpdate", vo);
	}
	
	public int memberMybatisDelete(MemberVO vo) throws Exception{
		return delete("MemberMybatisDAO_memberMybatisDelete", vo);
	}

}

