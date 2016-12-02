package spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

import spring.beans.annotation.User;

@Repository
//@Repository("userRepository")
public class UserRepositoryImpl2 implements UserRepository {

	@Override
	public void save(User user ) {
		System.out.println("³Ö¾Ã²ã2¡ª¡ª¡ª¡ª±£´æing" + user);
	}
}
