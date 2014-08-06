package kr.co.pmgk.sample.common.service;

import kr.co.pmgk.base.service.TInitServiceImpl;

public class SampleInitService3  extends TInitServiceImpl {
	
	@Override
	public void service() throws Exception {
		if(log.isDebugEnabled()) log.debug("SampleInitService3.service called...");
		
	}
	
}
