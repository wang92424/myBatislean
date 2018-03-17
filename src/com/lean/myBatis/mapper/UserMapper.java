package com.lean.myBatis.mapper;

import com.lean.myBatis.entity.User;
/***
 * 
 * Title:UserMapper
 * Description: sql接口
 * Company: 
 * @author MrWang
 * @date 2018年3月17日 下午5:14:19
 */
public interface UserMapper {

	User selectUserById(int id);
	
}
