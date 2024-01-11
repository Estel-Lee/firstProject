package com.main.today.model.biz;


import com.main.today.model.dto.TodayMember;

public interface Biz {

	public int checkId(TodayMember dto) throws Exception;
	public int insertUser(TodayMember dto) throws Exception;
}
