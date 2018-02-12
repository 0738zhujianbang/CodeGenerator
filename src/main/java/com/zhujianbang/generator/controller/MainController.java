package com.zhujianbang.generator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 主程序控制器
 * 
 * @author 朱建邦
 * @version 创建时间：2018年2月11日 上午10:22:14
 */
@Controller
public class MainController
{
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String index(ModelMap model)
	{
		model.addAttribute("test", "测试内容");

		return "index";
	}

}
