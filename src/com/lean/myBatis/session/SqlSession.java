package com.lean.myBatis.session;

import java.lang.reflect.Proxy;

import com.lean.myBatis.binding.MapperProxy;
import com.lean.myBatis.executor.Executor;
import com.lean.myBatis.executor.SimpleExecutor;
/***
 * 
 * Title:SqlSession
 * Description: ʵ�ʵ���
 * Company: 
 * @author MrWang
 * @date 2018��3��17�� ����5:18:23
 */
public class SqlSession {

	
	private Executor executor = new SimpleExecutor();
	
	public <T>T selectOne(String statement,Object parameter){
		return executor.query(statement, parameter);
	}
	
	public <T> T getMapper(Class<T> clazz) {
		return (T) Proxy.newProxyInstance(clazz.getClassLoader(),new Class[] {clazz},new MapperProxy<T>(this));
	}
	
}
