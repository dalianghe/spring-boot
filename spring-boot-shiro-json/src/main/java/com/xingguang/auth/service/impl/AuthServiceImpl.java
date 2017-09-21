package com.xingguang.auth.service.impl;

import com.xingguang.auth.entity.SysUserEntity;
import com.xingguang.auth.mapper.SysUserMapper;
import com.xingguang.auth.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/9/21  11:20
 * @Version v1.0.0
 */
@Service
public class AuthServiceImpl implements IAuthService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUserEntity findUserByLoginId(String loginId) throws Exception {
        return sysUserMapper.findUserByLoginId(loginId);
    }
}
