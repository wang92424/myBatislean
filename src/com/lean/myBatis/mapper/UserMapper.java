package com.lean.myBatis.mapper;

import com.lean.myBatis.entity.User;
/***
 * 
 * Title:UserMapper
 * Description: sql�ӿ�
 * Company: 
 * @author MrWang
 * @date 2018��3��17�� ����5:14:19
 */
public interface UserMapper {

	User selectUserById(int id);
	
}
