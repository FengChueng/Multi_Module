package com.zyl.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.zyl.core.pojo.User;
import com.zyl.core.repository.UserRepository;


public class AppTest extends AbsTest {

    @Resource
    private UserRepository userRepository;
    
    @Test
    public void baseTest() throws Exception {
        User user = new User();
        user.setUserName("zyl");
        user.setUserAge(22);
        user.setUserSex(1);
        userRepository.save(user);
//        userRepository.delete(user);
//        userRepository.findOne(1);
    }
}
