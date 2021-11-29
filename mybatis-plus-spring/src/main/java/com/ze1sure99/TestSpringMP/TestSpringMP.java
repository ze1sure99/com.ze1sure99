package com.ze1sure99.TestSpringMP;

import com.ze1sure99.mapper.UserMapper;
import com.ze1sure99.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//由spring提供的运行器
@RunWith(SpringJUnit4ClassRunner.class)
//加载配置文件
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSpringMP {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }


    }

}
