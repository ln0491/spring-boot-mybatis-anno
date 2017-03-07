package com.ghgcn.mb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ghgcn.mb.domain.Author;

@Mapper
public interface AuthorMapper {
	
	@Insert("INSERT INTO author(author_username,author_password,author_email,author_bio)VALUES(#{authorUsername},#{authorPassword},#{authorEmail},#{authorBio})")
	public int add(Author author);
	
	@Update("UPDATE author SET author_username= #{authorUsername},author_password=#{authorPassword} ,author_email=#{authorEmail} ,author_bio=#{authorBio},register_time=#{registerTime} WHERE author_id=#{authorId}")
	public int update(Author author);
	
	@Delete("DELETE FROM author WHERE author_id= #{id}")
	public int delete(@Param("id")int id);
	
	@Select("SELECT a.`author_id` authorId, a.`author_username` authorUsername ,a.`author_password` authorPassword ,a.`author_email` authorEmail ,a.`author_bio` authorBio ,a.`register_time` regitstTime FROM author a where author_id = #{id}")
	public Author findAuthor(@Param("id")int id);
	
	@Select("SELECT a.`author_id` authorId, a.`author_username` authorUsername ,a.`author_password` authorPassword ,a.`author_email` authorEmail ,a.`author_bio` authorBio ,a.`register_time` regitstTime FROM author a ")
	public List<Author> findAuthorList();
}
