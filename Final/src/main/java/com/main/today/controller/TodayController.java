package com.main.today.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodayController {
	
//	@Autowired
//	private Biz biz;
	
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
	
	
//	@RequestMapping("/regist")
//	public String regist(TodayMember dto) {
//		int res = biz.insertRegist(dto);
//		
//		return "success";
//	}
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
