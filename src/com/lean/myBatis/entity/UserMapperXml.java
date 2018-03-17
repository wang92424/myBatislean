package com.lean.myBatis.entity;

import java.util.HashMap;
import java.util.Map;
/****
 * 
 * Title:UserMapperXml
 * Description: 模拟从xml中读取出sql
 * Company: 
 * @author MrWang
 * @date 2018年3月17日 下午5:17:10
 */
public class UserMapperXml {
	public static final String namespace="com.lean.myBatis.mapper.UserMapper";
	
	public static Map<String,String> map = new HashMap<>();
	
	static {
		map.put("selectUserById", "SELECT ID,NAME,AGE FROM USER WHERE ID=?");
	}
}
