package com.arcsoft.studyOnline.controller;

import com.arcsoft.studyOnline.service.AdminstratorService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * Created by Focus on 2017/5/23.
 */
@RequestMapping("/shiro")
@Controller
public class AdminstratorController {

    @Autowired
    private AdminstratorService adminstratorService;

    @RequestMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes model, HttpSession session) {
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);
            try {
                currentUser.login(token);
            }catch (AuthenticationException e){
                System.out.println("登录失败:"+e.getMessage());
            }
        }
        return "redirect:/home";



//
//        long count = adminstratorService.userNameIfNull(username);
//        if (count == 1) {
//            boolean result = adminstratorService.checkLogin(username, password);
//            if (result) {
//                session.setAttribute("username", username);
//                return "home";
//            }
//        }
//        model.addFlashAttribute("msg", 1);
//        return "index";
    }




}