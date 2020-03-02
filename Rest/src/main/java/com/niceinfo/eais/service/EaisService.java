package com.niceinfo.eais.service;

import java.util.List;

import com.niceinfo.eais.dto.DataVO;

public interface EaisService {

	public int insertData(DataVO data);

	public int createDataSet(List<DataVO> data);

	public List<DataVO> getAllData();

	public List<DataVO> getData(String MGM_BLDRGST_PK);
	
}
