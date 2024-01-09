package com.main.today.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.main.today.model.dto.TodayMember;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

	//회원가입
	@Insert(" INSERT INTO ENJOINGJEJU_USER VALUES (#{user_id}, #{user_pw}, #{user_pw_detail}, #{user_name}, #{user_email}, #{user_email_detail}, #{user_phone}, #{user_post_code}, #{user_addr}, #{user_detail_addr}, #{user_extr_addr} )")
			public int insertUser(TodayMember dto);

	//id 중복 체크 
	@Select(" SELECT COUNT(*) FROM ENJOINGJEJU_USER WHERE user_id = #{user_id}")
			public int checkId(TodayMember dto);
			
}
