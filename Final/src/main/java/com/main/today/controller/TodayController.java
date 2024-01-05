package com.main.today.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@ResponseBody
	@RequestMapping(value = "/checkId", method = RequestMethod.POST)
    public String checkId(TodayMember id) throws Exception{
		System.out.println("넘어오나요...");
        int result = biz.checkId(id);

		System.out.println("id값 === " + id.getUser_id());
		
        if(result == 1) {
        	System.out.println(result + " =------- result값");
        	return "1";
        }
        return "0";
	} 
	
	
//	@RequestMapping(value="/checkId", method=RequestMethod.POST)
//	@ResponseBody
//	public Map<String, Boolean> checkId(@RequestBody TodayMember dto){
//		
//		boolean check = false;
//		Map<String, Boolean> map = new HashMap<>();
//		
//		String dto1 = biz.checkId(dto);
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
