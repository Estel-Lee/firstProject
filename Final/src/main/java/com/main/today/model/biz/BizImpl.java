package com.main.today.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.today.model.dto.TodayMember;
import com.main.today.model.mapper.Mapper;

@Service
public class BizImpl implements Biz{

	@Autowired
	private Mapper mapper;

	@Override
	public int checkId(TodayMember dto) throws Exception {
		return mapper.checkId(dto);
	}

}
