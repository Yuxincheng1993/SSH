package com.company.action;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;
import com.company.service.iservice.ILoginService;
import com.opensymphony.xwork2.ActionSupport;

@Controller("loginAction")
@RequestMapping("loginmvc")
public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	@Autowired
	@Qualifier("loginService")
	private ILoginService loginService;

	//显示登录页面
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@ModelAttribute Login user, HttpSession session) {
		String msg = loginService.login(user);
		System.out.println(msg);
		if ("success".equals(msg)) {
			session.setAttribute("username", user.getUsername());
		}
		return "redirect:/productmvc/findall";
	}

	//显示注册页面
	@RequestMapping(value = "showRegistry", method = RequestMethod.GET)
	public String initLogin() {
		return "registry";
	}
	
	//实现注册功能
	@RequestMapping(value = "registry", method = RequestMethod.POST)
	public String registry(@ModelAttribute Login login, @ModelAttribute Detail detail) {
		String msg = loginService.registry(login, detail);
		System.out.println("registry :"+login.getUsername());
		return "success".equals(msg) ? "redirect:/index.jsp" : "redirect:error";
	}
}
