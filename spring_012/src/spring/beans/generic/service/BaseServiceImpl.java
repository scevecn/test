package spring.beans.generic.service;

import org.springframework.beans.factory.annotation.Autowired;

import spring.beans.generic.repository.BaseRepository;

public class BaseServiceImpl<T> implements BaseService<T> {
	
	//泛型依赖注入 
	@Autowired
	private BaseRepository<T> baseRepository;
	
	@Override
	public void add(T t) {
		System.out.println("业务层，添加对象：" + t);
		baseRepository.save(t);
	}

}
