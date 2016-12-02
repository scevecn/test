package spring.beans.generic.service;

import org.springframework.stereotype.Service;

@Service("BaseSerivce")
public class UserService<T> extends BaseServiceImpl<T> {

}
