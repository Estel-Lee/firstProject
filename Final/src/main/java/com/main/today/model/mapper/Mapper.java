package com.main.today.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.main.today.model.dto.TodayMember;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

	
	@Insert(" INSERT INTO ENJOINGJEJU_USER VALUES (#{user_id}, '#{user_pw}', '#{user_pw_detail}', '#{user_name}', '#{user_email}', '#{user_email_detail}', '#{user_post_code}', '#{user_addr}', '#{user_detail_addr}', '#{user_extr_aaddr}' )")
			public String insertUser(TodayMember dto);

	@Select(" SELECT * FROM ENJOINGJEJU_USER WHERE user_id = #{user_id}")
			public String checkId(TodayMember dto);
			
}
