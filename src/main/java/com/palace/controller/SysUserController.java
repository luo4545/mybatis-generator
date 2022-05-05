package com.palace.controller;

import com.palace.entity.SysUser;
import com.palace.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.parser.Entity;

@Controller
@RequestMapping("/user")
public class SysUserController {
    @Resource
    private SysUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("userid"));
        System.out.println(userId);
        SysUser user = this.userService.getUserById(userId);
        model.addAttribute("user",user);
        return "showUser";
    }
}
