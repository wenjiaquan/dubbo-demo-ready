package com.wjq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjq.pojo.Article;
import com.wjq.service.ArticleService;

/**   
* @Title: ArticleController.java 
* @Package com.wjq.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2020年2月20日 下午5:03:59 
* @version V1.0   
*/
@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("list")
	public String list(Model model,String condition) {
		System.out.println("-------------------------------------");
		List<Article> articleList = articleService.list(condition);
		
		model.addAttribute("condition", condition);
		model.addAttribute("articleList", articleList);
		return "list";
	}
}
