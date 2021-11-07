package com.streetflo.miocat.service.rest.impl;

import com.streetflo.miocat.dao.rest.AcademyMapper;
import com.streetflo.miocat.dao.rest.CommonCodeMapper;
import com.streetflo.miocat.dto.rest.AcademyLIstDto;
import com.streetflo.miocat.dto.table.AcademyDto;
import com.streetflo.miocat.dto.table.CommonCodeDto;
import com.streetflo.miocat.service.rest.AcademyService;
import com.streetflo.miocat.service.rest.CommonCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommonCodeServiceImpl implements CommonCodeService {

	@Autowired
	private CommonCodeMapper commonCodeMapper;

	@Override
	public Map<String,List<String>> CommonCodeFind(CommonCodeDto dto) {

		List<CommonCodeDto> resultList = commonCodeMapper.commonCodeFind(dto);

		String check = "";
		List<String> nodeList = new ArrayList<String>();
		Map<String,List<String>> map = new HashMap<>();
		for (CommonCodeDto codeReulst : resultList) {

			if(!check.equals(codeReulst.getCodeGroup())){
				nodeList = new ArrayList<String>();
				map.put(codeReulst.getCodeGroup(),nodeList);
			}
			nodeList.add(codeReulst.getCodeName());//제이슨으로 넣어야됨.
			check = codeReulst.getCodeGroup();
		}

		System.out.println(map);

		return map;
	}
}
