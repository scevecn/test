package spring.beans.generic.repository;

public class BaseRepositoryIml<T>  implements BaseRepository<T>{

	@Override
	public void save(T t) {
		System.out.println("�־ò㣬�������" +t);
	}

}
