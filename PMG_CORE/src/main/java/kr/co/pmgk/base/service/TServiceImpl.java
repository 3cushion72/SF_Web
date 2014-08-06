package kr.co.pmgk.base.service;

import javax.annotation.Resource;

import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;

import ch.qos.logback.classic.Logger;

public class TServiceImpl implements TService {
	protected Logger log = (Logger)LoggerFactory.getLogger(this.getClass());

	@Resource(name = "messageSource")
	protected MessageSource messageSource;

}
