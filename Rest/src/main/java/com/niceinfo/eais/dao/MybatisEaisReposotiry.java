package com.niceinfo.eais.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niceinfo.eais.common.Constant;
import com.niceinfo.eais.dto.DataVO;
import com.niceinfo.eais.exception.InernalServerErrorException;

@Repository
public class MybatisEaisReposotiry implements EaisRepository {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertData(DataVO data) {
		try {
			return sqlSession.insert("EAIS.insertData", data);
		} catch (Exception e) {
			throw new InernalServerErrorException(Constant.DB_INSERT_ERROR);
		}
	}

	@Transactional
	@Override
	public int insertDataSet(List<DataVO> data) {
		try {
			return sqlSession.insert("EAIS.insertDataSet", data);
		} catch (Exception e) {
			throw new InernalServerErrorException(Constant.DB_INSERT_ERROR + e);
		}
	}

	@Override
	public List<DataVO> selectDataSet() {
		try {
			return sqlSession.selectList("EAIS.selectDataSet");
		} catch (Exception e) {
			throw new InernalServerErrorException(Constant.DB_SELECT_ERROR);
		}
	}

	@Override
	public List<DataVO> selectData(String MGM_BLDRGST_PK) {
		try {
			return sqlSession.selectList("EAIS.selectData", MGM_BLDRGST_PK);
		} catch (Exception e) {
			throw new InernalServerErrorException(Constant.DB_SELECT_ERROR);
		}
	}
}
