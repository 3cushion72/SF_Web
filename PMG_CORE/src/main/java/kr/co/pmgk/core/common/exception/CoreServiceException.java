package kr.co.pmgk.core.common.exception;

import java.util.Locale;

import kr.co.pmgk.base.exception.TException;

import org.springframework.context.MessageSource;

/**
 * <pre>
 * Core 모듈의 기본 Service Exception
 * </pre>
 * @author Administrator
 *
 */
public class CoreServiceException extends TException {
	private static final long serialVersionUID = 1L;

	public CoreServiceException(){
		super();
	}
	
	public CoreServiceException(String defaultMessage) {
		super(defaultMessage);
	}

	public CoreServiceException(MessageSource messageSource, String messageKey) {
		super(messageSource, messageKey);
	}

	public CoreServiceException(MessageSource messageSource, String messageKey, Object[] messageParameters) {
		super(messageSource, messageKey, messageParameters, null);
	}

	public CoreServiceException(MessageSource messageSource, String messageKey, Object[] messageParameters, String defaultMessage) {
		super(messageSource, messageKey, messageParameters, defaultMessage, null);
	}

	public CoreServiceException(MessageSource messageSource, String messageKey, Object[] messageParameters, Locale locale, Throwable wrappedException) {
		super(messageSource, messageKey, messageParameters, locale, wrappedException);
	}

	public CoreServiceException(MessageSource messageSource, String messageKey, Object[] messageParameters, String defaultMessage, Locale locale, Throwable wrappedException) {
		super(messageSource, messageKey, messageParameters, defaultMessage, locale, wrappedException);
	}

}
