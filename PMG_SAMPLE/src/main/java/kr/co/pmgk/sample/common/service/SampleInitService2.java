package kr.co.pmgk.sample.common.service;

import kr.co.pmgk.base.service.TInitServiceImpl;

public class SampleInitService2  extends TInitServiceImpl {
	
	@Override
	public void service() throws Exception {
		if(log.isDebugEnabled()) log.debug("SampleInitService2.service called...");
		
	}
	
}
