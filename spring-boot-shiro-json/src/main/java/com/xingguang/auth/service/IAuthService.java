package com.xingguang.auth.service;

import com.xingguang.auth.entity.SysUserEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/9/21  11:19
 * @Version v1.0.0
 */
public interface IAuthService {

    public SysUserEntity findUserByLoginId(String loginId) throws Exception;
}
