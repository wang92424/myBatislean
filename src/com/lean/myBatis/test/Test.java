package com.lean.myBatis.test;

import com.lean.myBatis.entity.User;
import com.lean.myBatis.mapper.UserMapper;
import com.lean.myBatis.session.SqlSession;
/****
 * 
 * Title:Test
 * Description: 测试类
 * Company: 
 * @author MrWang
 * @date 2018年3月17日 下午5:14:05
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession = new SqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user=userMapper.selectUserById(1);
		System.out.println(user);
	}

}
