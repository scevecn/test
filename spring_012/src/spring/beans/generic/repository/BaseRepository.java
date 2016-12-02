package spring.beans.generic.repository;

public interface BaseRepository<T> {

	public void save(T t);
}
