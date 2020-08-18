package com.jean.mida.Dao;

import org.springframework.data.repository.CrudRepository;

import com.jean.mida.Entity.User;

public interface UserDao extends CrudRepository<User, Integer>{
	
	public User findByNomAndPassword(String nom, String password ) ;



}
