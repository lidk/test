/**
 * 
 */
package com.test.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.test.dao.UserDao;
import com.test.entity.User;
import com.test.untils.MyBatisUtils;

/**
 * @author 李大坤
 *
 */
public class UserDaoImpl implements UserDao {

	

	@Override
	public List<User> selectAllUsers() {
		SqlSession session  =  MyBatisUtils.sqlSession();
		UserDao userDao = session.getMapper(UserDao.class);
		List<User> list;
		try {
			list = userDao.selectAllUsers();
		} finally{
			// TODO Auto-generated catch block
			session.close();
		}
		return list;
	}

	
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		SqlSession session  =  MyBatisUtils.sqlSession();
		UserDao userDao = session.getMapper(UserDao.class);
		int i = userDao.addUser(user);
		session.commit();
		session.close();
		return i;
	}

}
