package com.main.today.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.main.today.model.biz.Biz;
import com.main.today.model.dto.TodayMember;

@Controller
public class TodayController {
	
	@Autowired
	private Biz biz;
	
	//로그인
	@RequestMapping("/Login")
	public String Login() {
		return "Login";
	}	
	
	//문의 게시판
	@RequestMapping("/CafeBoard")
	public String CafeBoard() {
		return "CafeBoard";
	}
	
	//카페 정보
	@RequestMapping("/PageInfo")
	public String PageInfo() {
		return "PageInfo";
	}
	
	//회원 가입
	@RequestMapping("/UserInfo")
	public String UserInfo() {
		return "UserInfo";
	}
	
	//회원 가입 완료
	@RequestMapping("/UserSuccess")
	public String UserSuccess() {
		return "UserSuccess";
	}
	
	//날짜별 추천
	@RequestMapping("/BoardDaySearch")
	public String BoardDaySearch() {
		return "BoardDaySearch";
	}
	
	//테마별 추천
	@RequestMapping("/BoardDayThema")
	public String BoardDayThema() {
		return "BoardDayThema";
	}

	//지역별 추천
	@RequestMapping("/BoardDayarea")
	public String BoardDayarea() {
		return "BoardDayarea";
	}
	
	
	//ID 중복체크
	@ResponseBody
	@RequestMapping(value = "/checkId", method = RequestMethod.POST)
    public String checkId(TodayMember dto) throws Exception{
		System.out.println("ID중복체크 진입");
        int result = biz.checkId(dto);
        if(result == 1) {
        	return "1";
        }
        return "0";
	} 

//	//회원가입
//	@RequestMapping(value = "/UserSuccess", method=RequestMethod.POST)
//	public Map<String, Boolean> UserSuccess(TodayMember dto) throws Exception{
//		System.out.println("진입!");
//
//		int result = biz.insertUser(dto);
//
//		Map<String, Boolean> map = new HashMap<>();
//		System.out.println("값 ==== " + biz.insertUser(dto));
//        if(result > 0 ) {
//        	map.put("msg", true);
//        }else {
//        	map.put("msg", false);
//        }
//		return map;
//	}
}
