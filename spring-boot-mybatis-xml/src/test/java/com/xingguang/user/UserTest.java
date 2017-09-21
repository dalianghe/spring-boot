package com.xingguang.user;

import com.xingguang.user.entity.SysUserEntity;
import com.xingguang.user.service.ISysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/9/21  10:15
 * @Version v1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private ISysUserService userService;

    @Test
    public void testService() throws Exception{
        SysUserEntity user = userService.findUserByLoginId("spring");
        System.out.println(user.getUserName());
    }
}
