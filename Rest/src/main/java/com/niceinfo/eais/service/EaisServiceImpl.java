package com.niceinfo.eais.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niceinfo.eais.dao.EaisRepository;
import com.niceinfo.eais.dto.DataVO;

@Service
public class EaisServiceImpl implements EaisService {

	@Autowired
	EaisRepository eaisRepository;

	@Override
	public int insertData(DataVO data) {
		return eaisRepository.insertData(data);
	}

	@Override
	public int createDataSet(List<DataVO> data) {
		return eaisRepository.insertDataSet(data);
	}

	@Override
	public List<DataVO> getAllData() {
		return eaisRepository.selectDataSet();
	}

	@Override
	public List<DataVO> getData(String MGM_BLDRGST_PK) {
		return eaisRepository.selectData(MGM_BLDRGST_PK);
	}
}
