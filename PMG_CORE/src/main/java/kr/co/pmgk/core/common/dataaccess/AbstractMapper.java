package kr.co.pmgk.core.common.dataaccess;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

public class AbstractMapper extends EgovAbstractMapper{
	/**
     * EgovAbstractDAO 는 base class 로만 사용되며 해당 인스턴스를 직접
     * 생성할 수 없도록 protected constructor 로 선언하였음.
     */
    protected AbstractMapper() {
        // PMD abstract Rule - If the class is intended
        // to be used as a base class only (not to be
        // instantiated
        // directly)
        // a protected constructor can be provided
        // prevent direct instantiation
    }

    /**
     * Annotation 형식으로 sqlSession(SqlSessionFactoryBean)을 받아와 
     * 이를 super(SqlSessionDaoSupport)의 setSqlSessionFactory 메서드를 호출하여 설정해 준다.
     * <p>
     * SqlSessionTemplate이 지정된 경우된 경우 이 SqlSessionFactory가 무시된다. (Batch 처리를 위해서는 SqlSessionTemplate가 필요)
     * 
     * 
     * @param sqlSession SqlSessionFactory로 MyBatis와의 연계를 위한 기본 클래스
     */
    @Resource(name = "sqlSession")
    public void setSqlSessionFactory(SqlSessionFactory sqlSession) {
    	super.setSqlSessionFactory(sqlSession);
    }
}
