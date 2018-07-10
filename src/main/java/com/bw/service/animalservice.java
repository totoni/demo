package com.bw.service;

import java.util.List;


import com.bw.bean.Animal;
import com.bw.util.PageUtil;


public interface animalservice {
	
	int count();
	
	List<Animal> list(PageUtil pageUtil);
	
	int insert(Animal animal);
	
	int plsc(String ids);
	
	Animal look(String aid);
	
	List<Animal> rlist();
}
