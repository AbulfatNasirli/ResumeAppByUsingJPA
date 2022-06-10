/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import com.company.entity.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface UserDaoInter {
public List<User> getAll();

	public User findByEmailAndPassword(String email, String password);

	public User findByEmail(String email);

	public List<User> getAll(String name,String surname);
	
	public User getById(int id);
	
	public boolean addUser(User u);
	
	public boolean updateUser(User u);
	
	public boolean removeUser(int id);
}
