package kr.co.pmgk.core.common.exception;

import java.util.Locale;

import kr.co.pmgk.base.exception.TException;

import org.springframework.context.MessageSource;

/**
 * <pre>
 * Core 모듈의 기본 비즈니스 로직 Exception
 * </pre>
 * @author Administrator
 *
 */
public class CoreBizException extends TException {
	private static final long serialVersionUID = 1L;

	public CoreBizException(){
		super();
	}
	
	public CoreBizException(String defaultMessage) {
		super(defaultMessage);
	}

	public CoreBizException(MessageSource messageSource, String messageKey) {
		super(messageSource, messageKey);
	}

	public CoreBizException(MessageSource messageSource, String messageKey, Object[] messageParameters) {
		super(messageSource, messageKey, messageParameters, null);
	}

	public CoreBizException(MessageSource messageSource, String messageKey, Object[] messageParameters, String defaultMessage) {
		super(messageSource, messageKey, messageParameters, defaultMessage, null);
	}

	public CoreBizException(MessageSource messageSource, String messageKey, Object[] messageParameters, Locale locale, Throwable wrappedException) {
		super(messageSource, messageKey, messageParameters, locale, wrappedException);
	}

	public CoreBizException(MessageSource messageSource, String messageKey, Object[] messageParameters, String defaultMessage, Locale locale, Throwable wrappedException) {
		super(messageSource, messageKey, messageParameters, defaultMessage, locale, wrappedException);
	}

}
