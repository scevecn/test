package spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

import spring.beans.annotation.User;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@Override
	public void save(User user ) {
		System.out.println("�־ò㡪����������ing" + user);
	}
}
