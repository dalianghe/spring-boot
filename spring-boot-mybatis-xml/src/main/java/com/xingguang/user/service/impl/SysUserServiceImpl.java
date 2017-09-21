package com.xingguang.user.service.impl;

import com.xingguang.user.entity.SysUserEntity;
import com.xingguang.user.mapper.SysUserMapper;
import com.xingguang.user.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/9/21  10:12
 * @Version v1.0.0
 */
@Service
public class SysUserServiceImpl implements ISysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUserEntity findUserByLoginId(String loginId) throws Exception {
        return sysUserMapper.findUserByLoginId(loginId);
    }
}
