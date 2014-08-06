package kr.co.pmgk.sample.common.service;

import java.util.ArrayList;
import java.util.HashMap;

import kr.co.pmgk.sample.sample3.vo.CodeVO;

public interface CodeService {
    public HashMap<String, ArrayList<CodeVO>> codeList() throws Exception;
}
