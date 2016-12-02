package spring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import spring.beans.annotation.User;
import spring.beans.annotation.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
//	@Qualifier("userRepositoryImpl2")
	private UserRepository userRepository;
	
	@Override
	public void add(User user) {
		System.out.println("业务层：添加用户" + user);
		
		userRepository.save(user);
	}

}
