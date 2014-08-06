package kr.co.pmgk.utils;

import kr.co.pmgk.core.common.manager.GeneralResourceManager;
import kr.co.pmgk.core.common.service.PropertiesService;

/**
 * <pre>
 * 프로퍼티 관련 util
 * </pre>
 * @author Administrator
 *
 */
public class PropertiesUtil {
	
	public static PropertiesService getServiceInstance() throws Exception {
		return GeneralResourceManager.getInstance().getPropertiesService();
	}
	
	public static String getString(String name) throws Exception {
		return PropertiesUtil.getServiceInstance().getString(name);
	}

	public static String getString(String name, String def) throws Exception {
		return PropertiesUtil.getServiceInstance().getString(name, def);
	}

	public static boolean getBoolean(String name) throws Exception {
		return PropertiesUtil.getServiceInstance().getBoolean(name);
	}
	
	public static boolean getBoolean(String name, boolean def) throws Exception {
		return PropertiesUtil.getServiceInstance().getBoolean(name, def);
	}

	public static int getInt(String name) throws Exception {
		return PropertiesUtil.getServiceInstance().getInt(name);
	}

	public static int getInt(String name, int def) throws Exception {
		return PropertiesUtil.getServiceInstance().getInt(name, def);
	}

	public static long getLong(String name) throws Exception {
		return PropertiesUtil.getServiceInstance().getLong(name);
	}

	public static long getLong(String name, long def) throws Exception {
		return PropertiesUtil.getServiceInstance().getLong(name, def);
	}

}

