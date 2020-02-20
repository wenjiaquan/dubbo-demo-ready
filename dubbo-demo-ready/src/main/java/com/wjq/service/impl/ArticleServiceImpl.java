package com.wjq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjq.dao.ArticleDao;
import com.wjq.pojo.Article;
import com.wjq.service.ArticleService;

/**   
* @Title: ArticleServiceImpl.java 
* @Package com.wjq.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2020年2月20日 下午5:05:07 
* @version V1.0   
*/
@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired 
	private ArticleDao articleMapper;
	
	@Override
	public List<Article> list(String condition,String created1,String created2) {
		// TODO Auto-generated method stub
		return articleMapper.list(condition,created1,created2);
	}

}
