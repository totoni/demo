package com.bw.dao;

import com.bw.bean.Animal;
import com.bw.util.PageUtil;

import java.util.List;


public interface animaldao {

	int count();
	
	List<Animal> list(PageUtil pageUtil);
	
	int insert(Animal animal);
	
	int plsc(String ids);
	
	Animal look(String aid);
	
	List<Animal> rlist();
}
