package com.main.today.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.main.today.model.dto.TodayMember;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {
//
//	@Insert(" INSERT INTO TODAYMEMBER VALUES(NULL, #{m_id}, #{m_pw}, #{m_name}, #{m_height}, #{m_weight}) ")
//	public int insertRegist(TodayMember dto);
//	
//	@Select(" SELECT * FROM TODAYMEMBER WHERE M_ID = #{m_id} ")
//	public TodayMember checkId(TodayMember dto);
}
