package com.xingguang.config;

import com.xingguang.auth.entity.SysUserEntity;
import com.xingguang.auth.service.IAuthService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description 自定义Realm，完成自定义认证策略
 * @Author hedaliang
 * @Date 2017/9/21  11:02
 * @Version v1.0.0
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private IAuthService authService;

    /**
     * 登录认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String loginId = token.getUsername();
        SysUserEntity user = null;
        try {
            user = authService.findUserByLoginId(loginId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(user != null){
            return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
        }
        return null;
    }

    /**
     * 权限认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }
}
