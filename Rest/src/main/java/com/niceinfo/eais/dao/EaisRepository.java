package com.niceinfo.eais.dao;

import java.util.List;

import com.niceinfo.eais.dto.DataVO;

public interface EaisRepository {

	public int insertData(DataVO data);

	public int insertDataSet(List<DataVO> data);

	public List<DataVO> selectDataSet();

	public List<DataVO> selectData(String MGM_BLDRGST_PK);

}
