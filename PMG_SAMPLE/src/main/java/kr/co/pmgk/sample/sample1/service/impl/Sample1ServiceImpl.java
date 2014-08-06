package kr.co.pmgk.sample.sample1.service.impl;

import kr.co.pmgk.base.service.TServiceImpl;
import kr.co.pmgk.sample.sample1.service.Sample1Service;

import org.springframework.stereotype.Service;

/**
 * <pre>
 * Sample Service 구현체
 * </pre>
 * @author Administrator
 *
 */
@Service("sample1Service")
public class Sample1ServiceImpl extends TServiceImpl implements Sample1Service {
	
	public String sample(){
		return "sample";
	}
}
