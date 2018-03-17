package com.lean.myBatis.entity;

import java.util.HashMap;
import java.util.Map;
/****
 * 
 * Title:UserMapperXml
 * Description: ģ���xml�ж�ȡ��sql
 * Company: 
 * @author MrWang
 * @date 2018��3��17�� ����5:17:10
 */
public class UserMapperXml {
	public static final String namespace="com.lean.myBatis.mapper.UserMapper";
	
	public static Map<String,String> map = new HashMap<>();
	
	static {
		map.put("selectUserById", "SELECT ID,NAME,AGE FROM USER WHERE ID=?");
	}
}
