package kr.co.pmgk.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import kr.co.pmgk.core.common.manager.GeneralResourceManager;
import kr.co.pmgk.core.common.service.PropertiesService;
import kr.co.pmgk.sample.common.manager.CodeManager;
import kr.co.pmgk.sample.common.service.CodeManagerService;
import kr.co.pmgk.sample.common.util.CodeManagerUtil;
import kr.co.pmgk.sample.sample3.service.MemberService;
import kr.co.pmgk.sample.sample3.vo.CodeVO;
import kr.co.pmgk.sample.sample3.vo.MemberVO;
import kr.co.pmgk.utils.PropertiesUtil;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch.qos.logback.classic.Logger;

public class TestSampleService {
	
	
	private static ApplicationContext ctx;
	
	public static void main(String[] args) throws Exception {

		Logger log = (Logger) LoggerFactory.getLogger(TestSampleService.class);
		
		/*
		 * web.xml 의 프로파일링 설정 세팅
		 */
		System.setProperty("spring.profiles.active", "local");
		
		/*
		 * applicationContext 설정
		 */
		ctx = new ClassPathXmlApplicationContext("classpath*:*spring/*.xml");
		
		/*
		 * core test
		 */		
		// test : core message
		String core_message = ctx.getMessage("CORE.ERROR.FILE.NOTFOUND", new String[]{"hello.jpg"}, Locale.getDefault());
		log.debug("core message - core_message=[{}]", core_message );
		
		String message = ctx.getMessage("ERROR.FILE.NOTFOUND", new String[]{"hello.jpg"}, Locale.getDefault());
		log.debug("web message - messge=[{}]", message );

		// test : web base일 경우 테스트 해보자
//		String message = MessageUtil.getMessage("CORE.ERROR.FILE.NOTFOUND", new String[]{"hello.jpg"}, Locale.getDefault());
//		log.debug("messge=[" + message + "]" );


//		 test : properties 사용
		
		// core properties
		String core_project_name = PropertiesUtil.getString("CORE.PROJECT.NAME");
		boolean core_isreal = PropertiesUtil.getBoolean("CORE.ISREAL");																																											
		int core_sample_int = PropertiesUtil.getInt("CORE.SAMPLE.INT");
		long core_sample_long = PropertiesUtil.getLong("CORE.SAMPLE.LONG");

		// sample properties
		String project_name = PropertiesUtil.getString("PROJECT.NAME");			
		
		if(log.isDebugEnabled()) log.debug("core property - core_project_name=[{}]", core_project_name );
		if(log.isDebugEnabled()) log.debug("core property - core_isreal=[{}]", core_isreal );
		if(log.isDebugEnabled()) log.debug("core property - core_sample_int=[{}]", core_sample_int );
		if(log.isDebugEnabled()) log.debug("core property - core_sample_long=[{}]", core_sample_long );
		
		if(log.isDebugEnabled()) log.debug("web property - project_name=[{}]", project_name );
		
		
		/*
		 * DB 테스트
		 */
		MemberVO memberVO = new MemberVO();
		List<MemberVO> memberList;
		
		MemberService memberService = (MemberService)ctx.getBean("memberService");

		//----------------------------------------------
		// ibatis 테스트
		//----------------------------------------------
		memberList = memberService.memberSelect(memberVO);
		int memberSize = memberList.size();
		for(int i = 0; i < memberSize; i++){
			if(log.isDebugEnabled()) log.debug("memberList[{}][{}]", i, memberList.get(i));
		}
		
		//----------------------------------------------
		// mybatis 테스트
		//----------------------------------------------
		memberList = memberService.memberMybatisSelect(memberVO);
		memberSize = memberList.size();
		for(int i = 0; i < memberSize; i++){
			if(log.isDebugEnabled()) log.debug("memberList[{}][{}]", i, memberList.get(i));
		}
		
		/*
		 * ehcache에 담은 코드를 가지고 오기
		 * ehcache 호출 : 처음 호출만 되고 이후는 cache에 저장이 되므로 호출이 안된다.
		 */
		// 1. 첫번째 호출
		ArrayList<CodeVO> codes = CodeManagerUtil.getCodeList("CODE_GROUP_1");	// 인스턴스를 통한 호출
		
		for(CodeVO code : codes){
			if(log.isDebugEnabled())	log.debug("ehcache code=[{}][{}][{}][{}]", code.getCode_group_id(), code.getCode_group_name(), code.getCode_id(), code.getCode_name());
		}
		
		// 2. 두번째 호출 : 호출이 안되어야 한다.(cache에 담겨진 코드를 가지고 와야 한다.)
		ArrayList<CodeVO> codes_1 = CodeManagerUtil.getCodeList("CODE_GROUP_2");	// 인스턴스를 통한 호출
		for(CodeVO code : codes_1){
			if(log.isDebugEnabled())	log.debug("ehcache code=[{}][{}][{}][{}]", code.getCode_group_id(), code.getCode_group_name(), code.getCode_id(), code.getCode_name());
		}

		String codeName = "";
		codeName = CodeManagerUtil.getCodeName("CODE_GROUP_2", "CODE_2_2");
		if(log.isDebugEnabled()) log.debug("codeName[{}]", codeName);

		// web에서 테스트를 해보자
		codeName = CodeManagerUtil.getCodeName("CODE_GROUP_2", "CODE_2_1");
		if(log.isDebugEnabled()) log.debug("codeName[{}]", codeName);
		
	}

}
