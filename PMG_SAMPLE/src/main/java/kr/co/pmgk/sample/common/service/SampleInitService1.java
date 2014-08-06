package kr.co.pmgk.sample.common.service;

import kr.co.pmgk.base.service.TInitServiceImpl;

public class SampleInitService1 extends TInitServiceImpl {
	
	@Override
	public void service() throws Exception {
		if(log.isDebugEnabled()) log.debug("SampleInitService1.service called...");
	}
	
}
