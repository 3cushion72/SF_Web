package kr.co.pmgk.sample.common.wrapper.collection;

import java.util.HashMap;

/**
 * <pre>
 * requestParameter의 데이터 조작을 톻한 데이터를 담음
 * 현재는 단순히 HashMap의 상속만으로 적용이 되었지만
 * 업무상 필요한 부분이 발생이 되면 구현 및 override를 통한 데이터 조작 가능
 * Controller의 파라미터 인자로 requestParameter 및 조작된 데이터를 담는다.(CustomHandlerMethodArgumentResolver.class)
 * </pre>
 * @author Administrator
 *
 */
public class CMap extends HashMap<Object, Object> {

	/**
	 *  serialVersionUID
	 */
	private static final long serialVersionUID = 7888842493401985845L;

}
