package kr.co.pmgk.sample.sample3.dao;

import java.util.List;

import kr.co.pmgk.core.common.dataaccess.AbstractDAO;
import kr.co.pmgk.sample.sample3.vo.CodeVO;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Logger;

@Repository("codeDAO")
public class CodeDAO extends AbstractDAO {
	private Logger log = (Logger)LoggerFactory.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	public List<CodeVO> codeSelect(CodeVO vo) throws Exception {
		if(log.isDebugEnabled())	log.debug("CodeDAO.codeSelect called...");
		return list("CodeDAO_codeSelect", vo);
	}

}
