package com.lean.myBatis.executor;
/****
 * 
 * Title:Executor
 * Description: ��ѯ�ӿ�
 * Company: 
 * @author MrWang
 * @date 2018��3��17�� ����5:17:52
 */
public interface Executor {
	
	<T> T query(String statement,Object parameter);
}
