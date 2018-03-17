package com.lean.myBatis.executor;
/****
 * 
 * Title:Executor
 * Description: 查询接口
 * Company: 
 * @author MrWang
 * @date 2018年3月17日 下午5:17:52
 */
public interface Executor {
	
	<T> T query(String statement,Object parameter);
}
