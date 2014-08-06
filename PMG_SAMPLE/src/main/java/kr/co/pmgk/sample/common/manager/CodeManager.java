package kr.co.pmgk.sample.common.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import kr.co.pmgk.base.service.TInitServiceImpl;
import kr.co.pmgk.sample.TestSampleService;
import kr.co.pmgk.sample.common.service.CodeManagerService;
import kr.co.pmgk.sample.sample3.vo.CodeVO;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ch.qos.logback.classic.Logger;

public class CodeManager extends TInitServiceImpl {
	
	public static Logger log = (Logger) LoggerFactory.getLogger(TestSampleService.class);

	@Autowired
    private CodeManagerService codeManagerService;
		
	public static CodeManager instance;
	
	public static CodeManager getInstance() {
        return instance;
    }
	
	public LinkedHashMap<String, ArrayList<CodeVO>> getCodeMap() throws Exception {
		return (LinkedHashMap<String, ArrayList<CodeVO>>)initData();
	}
	
	public ArrayList<CodeVO> getCodeList(String codeKey) throws Exception {
		return codeManagerService.getCodeList(codeKey);
	}

	public String getCodeId(String codeKey, String codeId) throws Exception {
		return codeManagerService.getCodeId(codeKey, codeId);
	}
	
	public String getCodeName(String codeKey, String codeId) throws Exception {
		return codeManagerService.getCodeName(codeKey, codeId);
	}

	/**
     * 코드 리스트 서비스 호출
     */
    private HashMap<String, ArrayList<CodeVO>> initData() throws Exception {
        return codeManagerService.getCodeMap();
    }
	
	@Override
	public void service() throws Exception {
		instance = this;
	}
}
