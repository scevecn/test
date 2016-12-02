package spring.beans.generic.service;

import org.springframework.beans.factory.annotation.Autowired;

import spring.beans.generic.repository.BaseRepository;

public class BaseServiceImpl<T> implements BaseService<T> {
	
	//��������ע�� 
	@Autowired
	private BaseRepository<T> baseRepository;
	
	@Override
	public void add(T t) {
		System.out.println("ҵ��㣬��Ӷ���" + t);
		baseRepository.save(t);
	}

}
