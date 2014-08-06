package kr.co.pmgk.sample.common.service;

import java.util.ArrayList;
import java.util.HashMap;

import kr.co.pmgk.sample.sample3.vo.CodeVO;

public interface CodeManagerService {
    public HashMap<String, ArrayList<CodeVO>> getCodeMap() throws Exception;
    public ArrayList<CodeVO> getCodeList(String codeKey) throws Exception;
    public String getCodeId(String codeKey, String codeId) throws Exception;
    public String getCodeName(String codeKey, String codeId) throws Exception;
}
