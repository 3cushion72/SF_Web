package kr.co.pmgk.core.common.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OthersExceptionHandler implements egovframework.rte.fdl.cmmn.exception.handler.ExceptionHandler {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void occur(Exception arg0, String arg1) {
		// TODO Auto-generated method stub
		if(log.isDebugEnabled()) log.debug(arg0.toString());
		if(log.isDebugEnabled()) log.debug(arg1);
	}
	
}
