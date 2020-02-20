package com.wjq.service;

import java.util.List;

import com.wjq.pojo.Article;

/**   
* @Title: ArticleService.java 
* @Package com.wjq.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2020年2月20日 下午5:04:52 
* @version V1.0   
*/
public interface ArticleService {

	List<Article> list(String condition);

}
