package kr.co.pmgk.core.common.manager;

import kr.co.pmgk.base.service.TInitService;
import kr.co.pmgk.core.common.service.PropertiesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class GeneralResourceManager implements TInitService {

	@Autowired
	private PropertiesService propertiesService;

	@Autowired
	private  MessageSource messageSource;
	
	private static GeneralResourceManager instance;
	
	public static GeneralResourceManager getInstance(){
		return instance;
	}
	
	public PropertiesService getPropertiesService() {
	    return propertiesService;
	}

	public MessageSource getMessageSource() {
	    return messageSource;
	}

	public void service() throws Exception {
		instance = this;
	}

}
