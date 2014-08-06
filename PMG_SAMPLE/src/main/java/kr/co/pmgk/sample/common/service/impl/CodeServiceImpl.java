package kr.co.pmgk.sample.common.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import kr.co.pmgk.sample.common.service.CodeService;
import kr.co.pmgk.sample.sample3.dao.CodeDAO;
import kr.co.pmgk.sample.sample3.vo.CodeVO;

import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service("codeService")
public class CodeServiceImpl implements CodeService {
	private Logger log = (Logger)LoggerFactory.getLogger(this.getClass());
	
    @Resource(name = "codeDAO")
    private CodeDAO codeDAO;

    public HashMap<String, ArrayList<CodeVO>> storage = new HashMap<String, ArrayList<CodeVO>>();
    
    /**
     * 코드 리스트를 가져와 Map에 담기
     */
    @Cacheable (value="CodeCache")
    public HashMap<String, ArrayList<CodeVO>> codeList() throws Exception {

        if (log.isDebugEnabled())	log.debug("debug_message : CodeManagerService.codeList");
        
        List<CodeVO> codeList = codeDAO.codeSelect(new CodeVO());

        String key = "";
        ArrayList<CodeVO> data = null;
        
        String code_group_id;
        
        for(CodeVO codeVO : codeList){
        	code_group_id = codeVO.getCode_group_id();
        	
        	if( !code_group_id.equals(key) ){
        		if( data != null ) {
        			storage.put(key, data);
        		}
        		data = new ArrayList<CodeVO>();
        		key = code_group_id;
        	}
        	data.add(codeVO);
        }
        
        if( data != null )	storage.put(key, data);
        
        return storage;
        
    }

}
