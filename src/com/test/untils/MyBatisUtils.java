/**
 * 
 */
package com.test.untils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author 李大坤
 *
 */
public class MyBatisUtils {  
	
    private static SqlSessionFactory sqlSessionFactory;  
  
    public static SqlSession sqlSession() {  
        try {  
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");  
            if (sqlSessionFactory == null) {  
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); //build()方法会把inputStream关闭掉  
            } else {  
                inputStream.close();  
            }  
            return sqlSessionFactory.openSession();  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        return null;  
    }  
}  
