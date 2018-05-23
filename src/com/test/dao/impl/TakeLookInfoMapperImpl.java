/**
 * 
 */
package com.test.dao.impl;


import org.apache.ibatis.session.SqlSession;

import com.test.dao.TakelookinfoMapper;
import com.test.entity.Takelookinfo;
import com.test.untils.MyBatisUtils;

/**
 * @author 李大坤
 *
 */
public class TakeLookInfoMapperImpl implements TakelookinfoMapper {

	@Override
	public Takelookinfo selectTakeLook(String empName) {
		SqlSession session  =  MyBatisUtils.sqlSession();
		TakelookinfoMapper t = session.getMapper(TakelookinfoMapper.class);
		Takelookinfo info = t.selectTakeLook(empName);
		return info;
	}

}
