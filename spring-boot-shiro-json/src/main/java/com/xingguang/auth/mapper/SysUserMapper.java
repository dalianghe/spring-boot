package com.xingguang.auth.mapper;

import com.xingguang.auth.entity.SysUserEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/9/21  10:08
 * @Version v1.0.0
 */
public interface SysUserMapper {

    SysUserEntity findUserByLoginId(String loginId) throws Exception;

}
