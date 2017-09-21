package com.xingguang.user.controller;

import com.xingguang.user.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/9/21  10:19
 * @Version v1.0.0
 */
@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private ISysUserService sysUserService;

}
