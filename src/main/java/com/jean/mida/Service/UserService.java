package com.jean.mida.Service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.jean.mida.Dao.UserDao;
import com.jean.mida.Entity.User;

@Service
@Transactional
public class UserService {
	
private final UserDao dao;
	
	public UserService(UserDao dao) {
		this.dao = dao;
		
	}
	
	public void saveMyUser(User user) {
		dao.save(user);
	}
	public User findByNomAndPassword(String nom, String password ) {
		return dao.findByNomAndPassword(nom, password);
	}


}
