package spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

import spring.beans.annotation.User;

@Repository
//@Repository("userRepository")
public class UserRepositoryImpl2 implements UserRepository {

	@Override
	public void save(User user ) {
		System.out.println("�־ò�2������������ing" + user);
	}
}
