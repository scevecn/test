package spring.beans.generic.repository;

import org.springframework.stereotype.Repository;

@Repository("BaseRepository")
public class UserRepositoryImpl<T>  extends BaseRepositoryIml<T>{

}
