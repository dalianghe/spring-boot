package com.xingguang.user.service;

import com.xingguang.user.entity.SysUserEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/9/21  10:12
 * @Version v1.0.0
 */
public interface ISysUserService {

    public SysUserEntity findUserByLoginId(String loginId) throws Exception;

}
