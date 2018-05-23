/**
 * 
 */
package com.test.dao;

import java.util.List;

import com.test.entity.User;

/**
 * @author 李大坤
 *
 */
public interface UserDao {
	
	public List<User> selectAllUsers();
	
	public int addUser(User user);
}
