package com.bw.controller;


import com.bw.bean.Animal;
import com.bw.service.animalservice;
import com.bw.util.PageUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Scope("prototype")
public class animalcontroller {
	@Resource
	private animalservice animalservice;
	@RequestMapping("list")
	public String list(String page,HttpServletRequest request) {

    	//总记录
    	int count=animalservice.count();
      PageUtil pageUtil=new PageUtil(page, 2, count);
	    List<Animal> list=animalservice.list(pageUtil);
	    request.setAttribute("list", list);
	    request.setAttribute("pageUtil", pageUtil);
	    return "lis";
		
	}
	@RequestMapping("toinsert")
	private String toinsert(HttpServletRequest request) { 
		List<Animal> rlist=animalservice.rlist();
		request.setAttribute("rlist", rlist);
		return "insert";
	}
	@RequestMapping("insert")
	private boolean insert(Animal animal) { 
		int i=animalservice.insert(animal);
		if (i>0) {
			return true;
		} else {
			return false;
		}

	}

	@RequestMapping("plsc")
	@ResponseBody
	private boolean plsc(String ids) { 
		int i=animalservice.plsc(ids);
		if (i>0) {
			return true;
		} else {
			return false;
		}
	}
	@RequestMapping("tolook")
	private String tolook(String aid) { 
		return "insert";
	}
}
