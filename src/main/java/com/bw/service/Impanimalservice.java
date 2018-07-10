package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.bean.Animal;
import com.bw.dao.animaldao;
import com.bw.util.PageUtil;
@Service("animalservice")
public class Impanimalservice implements animalservice{
	@Resource
	animaldao animaldao;

	public int count() {
		// TODO Auto-generated method stub
		return animaldao.count();
	}

	public List<Animal> list(PageUtil pageUtil) {
		// TODO Auto-generated method stub
		return animaldao.list(pageUtil);
	}

	@Override
	public int insert(Animal animal) {
		// TODO Auto-generated method stub
		return animaldao.insert(animal);
	}

	@Override
	public int plsc(String ids) {
		// TODO Auto-generated method stub
		return animaldao.plsc(ids);
	}

	@Override
	public Animal look(String aid) {
		// TODO Auto-generated method stub
		return animaldao.look(aid);
	}

	@Override
	public List<Animal> rlist() {
		// TODO Auto-generated method stub
		return animaldao.rlist();
	}

}
