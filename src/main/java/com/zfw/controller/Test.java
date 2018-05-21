package com.zfw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {

	@RequestMapping("/test1.do")
	public @ResponseBody String test(HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("session", "123451");
		Session session2 = SecurityUtils.getSubject().getSession();
		session2.setAttribute("session1", "session1");
		return "fsdsfsf";
	}

	
	@RequestMapping("/test2.do")
	public @ResponseBody String test1(HttpServletRequest request) {
		Object attribute = request.getSession().getAttribute("session");
		return attribute.toString()+"---"+SecurityUtils.getSubject().getSession().getAttribute("session1");
	}

	@RequestMapping("/shiroLogin.do")
	public String login(String username, String password) {
		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			token.setRememberMe(true);
			try {
				currentUser.login(token);
			} catch (AuthenticationException e) {
				System.out.println("用户不存在");
			}
		}
		return "redirect:/index.jsp";
	}
}
