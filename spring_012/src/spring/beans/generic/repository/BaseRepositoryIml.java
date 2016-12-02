package spring.beans.generic.repository;

public class BaseRepositoryIml<T>  implements BaseRepository<T>{

	@Override
	public void save(T t) {
		System.out.println("持久层，保存对象：" +t);
	}

}
