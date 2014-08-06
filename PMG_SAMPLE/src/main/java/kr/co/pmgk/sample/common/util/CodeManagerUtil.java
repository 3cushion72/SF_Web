package kr.co.pmgk.sample.common.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import kr.co.pmgk.sample.common.manager.CodeManager;
import kr.co.pmgk.sample.sample3.vo.CodeVO;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <pre>
 * 프로퍼티 관련 util
 * </pre>
 * @author Administrator
 *
 */
public class CodeManagerUtil {

	@Autowired
    private CodeManager codeManager;
	
	public static CodeManager getServiceInstance() throws Exception {
		return CodeManager.getInstance();
	}
	
	public static LinkedHashMap<String, ArrayList<CodeVO>> getCodeMap() throws Exception {
		return CodeManagerUtil.getServiceInstance().getCodeMap();
	}
	
	public static ArrayList<CodeVO> getCodeList(String codeKey) throws Exception {
		return CodeManagerUtil.getServiceInstance().getCodeList(codeKey);
	}

	public static String getCodeId(String codeKey, String codeId) throws Exception {
		return CodeManagerUtil.getServiceInstance().getCodeId(codeKey, codeId);
	}
	
	public static String getCodeName(String codeKey, String codeId) throws Exception {
		return CodeManagerUtil.getServiceInstance().getCodeName(codeKey, codeId);
	}
 
	

}

