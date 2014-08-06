package kr.co.pmgk.sample.sample1.dao;

import java.util.List;

import kr.co.pmgk.core.common.dataaccess.AbstractMapper;
import kr.co.pmgk.sample.sample1.vo.Sample1VO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * <pre>
 * 단위 업무 설명
 * </pre>
 * @author Administrator
 *
 */
@Repository("sample1DAO")
public class Sample1DAO extends AbstractMapper {
	
	//private SqlSession sqlSession;
	
	
	/**
	 * <pre>
	 * pk를 이용한 단건 처리
	 * </pre>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<?> Sample1_selectByPk(Sample1VO vo) throws Exception {
		return (List<Sample1VO>)super.selectByPk("Sample1.selectByPk", vo);
	}

	/**
	 * <pre>
	 * 리스트 처리
	 * </pre>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<?> Sample1_list(Sample1VO vo) throws Exception {
		return (List<Sample1VO>)super.list("Sample1.list", vo);
	}

	/**
	 * <pre>
	 * 리스트 페이징 처리
	 * </pre>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<?> Sample1_select(Sample1VO vo) throws Exception {
		return (List<Sample1VO>)super.listWithPaging("Sample1.list", vo, vo.getPageIndex(), vo.getPageSize());
	}

	/**
	 * <pre>
	 * insert
	 * </pre>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int Sample1_insert(Sample1VO vo) throws Exception {
		return super.insert("Sample1.insert", vo);
	}

	/**
	 * <pre>
	 * update
	 * </pre>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int Sample1_update(Sample1VO vo) throws Exception {
		return super.update("Sample1.update", vo);
	}

	/**
	 * <pre>
	 * delete
	 * </pre>
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public int Sample1_delete(Sample1VO vo) throws Exception {
		return super.delete("Sample1.delete", vo);
	}
}
