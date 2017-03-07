package com.ghgcn.mb.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ghgcn.mb.domain.User;

@Mapper
public interface UserMapper {
	@Select("SELECT * FROM USER WHERE NAME = #{name}")
	public User findByName(@Param("name") String name);

	@Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
	public int insert(@Param("name") String name, @Param("age") Integer age);
	@Select("select * from user where id = #{id}")
	public User findUserById(@Param("id") long id);
}
