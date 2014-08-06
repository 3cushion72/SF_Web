package kr.co.pmgk.core.factory;

import java.util.ArrayList;
import java.util.List;

import kr.co.pmgk.base.service.TInitService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

public class DefaultContextInitTask implements InitializingBean {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	private List<TInitService> initTaskList = new ArrayList<TInitService>();
	
	public void afterPropertiesSet() throws Exception {

		int initTaskLen = this.initTaskList.size();
		if(log.isDebugEnabled()) log.debug("taskList len=[{}]", initTaskLen);
		
		if( initTaskLen == 0 ) throw new Exception("init task list size is 0.");
		
		for (TInitService initTaskService : this.initTaskList) {
			initTaskService.service();
		}
		
	}

	public List<TInitService> getInitTaskList() {
		return initTaskList;
	}

	public void setInitTaskList(List<TInitService> initTaskList) {
		this.initTaskList = initTaskList;
	}
	
	
}
