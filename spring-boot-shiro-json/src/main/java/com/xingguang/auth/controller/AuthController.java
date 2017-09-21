package com.xingguang.auth.controller;

import com.xingguang.auth.entity.SysUserEntity;
import com.xingguang.auth.service.IAuthService;
import com.xingguang.common.AuthBean;
import com.xingguang.common.ResultBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/9/21  16:17
 * @Version v1.0.0
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IAuthService authService;

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public void test(){
        System.out.println("================");
    }

    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public ResultBean login(@RequestBody AuthBean authBean) throws Exception{

        ResultBean<?> resultBean = null;

        String loginId = authBean.getLoginId();
        String password = authBean.getPassword();

        UsernamePasswordToken token = new UsernamePasswordToken(loginId , password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            SysUserEntity sysUserEntity = (SysUserEntity) subject.getPrincipal();
            resultBean = new ResultBean<>(sysUserEntity);
        } catch ( UnknownAccountException uae ) {
            System.out.println("=============UnknownAccountException");
        } catch ( IncorrectCredentialsException ice ) {
            System.out.println("=============IncorrectCredentialsException");
        } catch ( LockedAccountException lae ) {
            System.out.println("=============LockedAccountException");
        } catch ( AuthenticationException ae ) {
            System.out.println("=============AuthenticationException");
        }
        return resultBean;
    }
}
