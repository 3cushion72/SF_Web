package kr.co.pmgk.sample.common.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import kr.co.pmgk.sample.common.service.CodeManagerService;
import kr.co.pmgk.sample.common.service.CodeService;
import kr.co.pmgk.sample.sample3.vo.CodeVO;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service("codeManagerService")
public class CodeManagerServiceImpl implements CodeManagerService {
	private Logger log = (Logger)LoggerFactory.getLogger(this.getClass());

	@Resource(name = "codeService")
    private CodeService codeService;
	
	/**
	 * code 목록을 가지고 와서 Map에 담음 
	 */
    public HashMap<String, ArrayList<CodeVO>> getCodeMap() throws Exception {
        return codeService.codeList();
    }

    /**
     * Map에 담긴 코드목록을 이용하여 단위그룹의 코드 리스트를 가져온다.
     * @param codeKey
     * @return
     * @throws Exception
     */
    public ArrayList<CodeVO> getCodeList(String codeKey) throws Exception {
		
		ArrayList<CodeVO> codeList = this.getCodeMap().get(codeKey);
		
		if( codeList == null ){
			codeList = new ArrayList<CodeVO>();
		}
		
		return codeList;
	}

    /**
     * 해당 코드그룹의 KEY에 해당하는 코드의 ID를 반환
     * @param codeKey
     * @param codeId
     * @return
     * @throws Exception
     */
	public String getCodeId(String codeKey, String codeId) throws Exception {
		ArrayList<CodeVO> codeList = this.getCodeList(codeKey);
		String retCodeId = "";
		
		for(CodeVO codeVO : codeList){
			if(codeId.equals(codeVO.getCode_id())){
				retCodeId = codeId;
				break;
			}
		}
		
		return retCodeId;
	}
	
	/**
	 * 해당 코드그룹의 KEY에 해당하는 코드명을 반환
	 * @param codeKey
	 * @param codeId
	 * @return
	 * @throws Exception
	 */
	public String getCodeName(String codeKey, String codeId) throws Exception {
		ArrayList<CodeVO> codeList = this.getCodeList(codeKey);
		String retCodeName = "";
		
		for(CodeVO codeVO : codeList){
			if(codeId.equals(codeVO.getCode_id())){
				retCodeName = codeVO.getCode_name();
				break;
			}
		}
		
		return retCodeName;
	}
	
}
