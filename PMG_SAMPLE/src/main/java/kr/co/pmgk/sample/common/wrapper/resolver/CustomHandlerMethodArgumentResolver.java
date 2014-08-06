package kr.co.pmgk.sample.common.wrapper.resolver;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import kr.co.pmgk.sample.common.wrapper.collection.CMap;

import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import ch.qos.logback.classic.Logger;

/**
 * <pre>
 * 업무상 requestParameter의 조작이 필요한 경우 업무에 맞게 구현한다.
 * </pre>
 * @author Administrator
 *
 */
public class CustomHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
	private Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

	/**
	 * 구현 메소드(원하는 collection 객체(커스텀 객체))의 지원여부 세팅
	 */
    public boolean supportsParameter(MethodParameter parameter) {
        return CMap.class.isAssignableFrom (parameter.getParameterType ());
    }

    /**
     * 구현 메소드
     * request 및 기타 reqeustParameter의 요소를 핸들링 하는 로직 구현
     * CMap은 custom 생성 Map으로 Controller의 인자로 사용이 가능한다.
     * 현재는 단순히 HashMap을 상속 받아 처리 - 향후 필요한 부분을 처리할 것
     * 사용용도는 requetParammeter의 조작 데이터
     *     - 클라이언트 보안된 암호화의 복호화된 데이터를 담음
     *     - CMap에 필요한 method의 override로 업무상 필요한 메소드 구현을 통한 데이터 조작
     */
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
    	CMap map = new CMap();
    	
        HttpServletRequest request = (HttpServletRequest) webRequest.getNativeRequest();
        Enumeration<?> enumeration = request.getParameterNames();
        do {
            if (!enumeration.hasMoreElements())	break;
            String key = (String) enumeration.nextElement();
            String values[] = request.getParameterValues(key);
            if (values != null)
                map.put(key, values.length <= 1 ? ((Object) (values[0])) : ((Object) (values)));
        } while (true);

        return map;
    }
}
