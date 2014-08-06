package kr.co.pmgk.utils;

import java.util.Locale;

import kr.co.pmgk.core.common.manager.GeneralResourceManager;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;

/**
 * <pre>
 * 다국어 메시지 관련 util
 * </pre>
 * @author Administrator
 *
 */
public class MessageUtil {
	
	public static MessageSource getServiceInstance() throws Exception {
		return GeneralResourceManager.getInstance().getMessageSource();
	}
	
	public static String getMessage(MessageSourceResolvable resolvable, Locale locale) throws Exception {
		return MessageUtil.getServiceInstance().getMessage(resolvable, locale);
	}

	public static String getMessage(String code, String[] args, Locale locale) throws Exception {
		return MessageUtil.getServiceInstance().getMessage(code, args, locale);
	}
	
	public static String getMessage(String code, String[] args, String defaultMessage, Locale locale) throws Exception {
		return MessageUtil.getServiceInstance().getMessage(code, args, defaultMessage, locale);
	}

}

