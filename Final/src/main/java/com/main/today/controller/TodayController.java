package com.main.today.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.main.today.model.biz.Biz;
import com.main.today.model.dto.TodayMember;

@Controller
public class TodayController {
	
	@Autowired
	private Biz biz;
	
	@RequestMapping("/Login")
	public String Login() {
		return "Login";
	}

	@RequestMapping("/Board")
	public String Board() {
		return "Board";
	}
	
	@RequestMapping("/CafeBoard")
	public String CafeBoard() {
		return "CafeBoard";
	}
	
	@RequestMapping("/PageInfo")
	public String PageInfo() {
		return "PageInfo";
	}
	
	@RequestMapping("/UserInfo")
	public String UserInfo() {
		return "UserInfo";
	}
	
	@RequestMapping("/UserSuccess")
	public String UserSuccess() {
		return "UserSuccess";
	}
	
	@RequestMapping("/BoardDaySearch")
	public String BoardDaySearch() {
		return "BoardDaySearch";
	}
	
	@RequestMapping("/BoardDayThema")
	public String BoardDayThema() {
		return "BoardDayThema";
	}
	

	@RequestMapping("/checkId")
	public String checkId(TodayMember dto) {
		String res = biz.checkId(dto);
		return res;
	}
//	
//	@RequestMapping(value="/checkId", method=RequestMethod.POST)
//	@ResponseBody
//	public Map<String, Boolean> checkId(@RequestBody TodayMember dto){
//		
//		boolean check = false;
//		Map<String, Boolean> map = new HashMap<>();
//		
//		TodayMember dto1 = biz.checkId(dto);
//		
//		if(dto1 == null) {
//			check = true;
//			map.put("check", check);
//			return map;
//		}else {
//			map.put("check", check);
//			return map;
//		}
//	}
	
	
	
	
}
