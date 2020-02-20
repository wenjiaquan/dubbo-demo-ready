package com.wjq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wjq.pojo.Article;

/**   
* @Title: ArticleMapper.java 
* @Package com.wjq.dao 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2020年2月20日 下午5:03:32 
* @version V1.0   
*/
public interface ArticleDao {

	List<Article> list(@Param("condition") String condition);

}
