package com.lean.myBatis.binding;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.lean.myBatis.entity.UserMapperXml;
import com.lean.myBatis.session.SqlSession;
/****
 * 
 * Title:MapperProxy
 * Description: ����
 * Company: 
 * @author MrWang
 * @date 2018��3��17�� ����5:16:44
 * @param <T>
 */
public class MapperProxy<T> implements InvocationHandler{

	private SqlSession sqlSession;
	
	public MapperProxy(SqlSession sqlSession) {
		// TODO Auto-generated constructor stub
		this.sqlSession = sqlSession;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		if(method.getDeclaringClass().getName().equals(UserMapperXml.namespace)) {
			String sql = UserMapperXml.map.get(method.getName());
			return sqlSession.selectOne(sql, args[0]);
		}
		return null;
	}

}
