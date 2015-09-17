package com.vino.scaffold.shiro.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.mockito.cglib.transform.MethodVisitorTee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vino.scaffold.controller.base.BaseController;

@Controller
public class LoginController extends BaseController{
	//�����ظ���¼
	
	  @RequestMapping(value = "/login")
	    public String showLoginForm(HttpServletRequest req, Model model) {
	        String exceptionClassName = (String)req.getAttribute("shiroLoginFailure");
	       
	        String error = null;
	        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
	            error = "�û���/�������";
	        } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
	            error = "�û���/�������";
	        } else if(exceptionClassName != null) {
	            error = "��������" + exceptionClassName;
	        }
	        model.addAttribute("error", error);
	        return "login";
	    }

}