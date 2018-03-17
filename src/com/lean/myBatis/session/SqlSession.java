package com.lean.myBatis.session;

import java.lang.reflect.Proxy;

import com.lean.myBatis.binding.MapperProxy;
import com.lean.myBatis.executor.Executor;
import com.lean.myBatis.executor.SimpleExecutor;
/***
 * 
 * Title:SqlSession
 * Description: 实际调用
 * Company: 
 * @author MrWang
 * @date 2018年3月17日 下午5:18:23
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
