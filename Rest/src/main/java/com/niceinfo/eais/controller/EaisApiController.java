package com.niceinfo.eais.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.niceinfo.eais.common.Constant;
import com.niceinfo.eais.dto.DataVO;
import com.niceinfo.eais.exception.BadRequestException;
import com.niceinfo.eais.service.EaisService;

@RestController
@RequestMapping("/api/*")
public class EaisApiController {

	@Autowired
	EaisService eaisService;

	@RequestMapping(value = "data", method = RequestMethod.POST)
	public ResponseEntity<?> insertData(@RequestBody String body) throws JsonParseException, JsonMappingException, IOException {
		DataVO data = null;
		try {
			ObjectMapper mapper = new ObjectMapper().configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
			data = mapper.readValue(body, DataVO.class);
		} catch (Exception e) {
			throw new BadRequestException(Constant.JSON_PARSE_ERROR);
		}
		int insertedNum = eaisService.insertData(data);
		String jsonForm = "{\"row\":" + insertedNum+ "}";

		return ResponseEntity.ok(jsonForm);
	}

	@RequestMapping(value = "data-set", method = RequestMethod.POST)
	public ResponseEntity<?> createDataSet(@RequestBody String body) {
		List<DataVO> data = null;
		try {
			JsonParser jp = new JsonParser();
			JsonObject jo = (JsonObject) jp.parse(body);
			ObjectMapper mapper = new ObjectMapper().configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
			data = mapper.readValue(jo.get("Data").toString(), new TypeReference<List<DataVO>>() {});
		} catch (Exception e) {
			throw new BadRequestException(Constant.JSON_PARSE_ERROR);
		}
		int insertedNum = eaisService.createDataSet(data);
		String jsonForm = "{\"row\":" + insertedNum+ "}";

		return ResponseEntity.ok(jsonForm);
	}

	@RequestMapping(value = "data-set", method = RequestMethod.GET)
	public List<DataVO> listData() {
		return eaisService.getAllData();
	}

	@RequestMapping(value = "data/{key}", method = RequestMethod.GET)
	public List<DataVO> getData(@PathVariable("key") String MGM_BLDRGST_PK) {
		return eaisService.getData(MGM_BLDRGST_PK);
	}
}
