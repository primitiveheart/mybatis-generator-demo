package com.zgb.service;

import com.zgb.common.AbstractTestObject;
import com.zgb.model.test.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2019/11/2 10:15 上午
 * @Created By guanbao.zhou
 */

public class UserServiceTest extends AbstractTestObject {

  @Autowired
  private UserService userService;

  @Test
  public void getUserById() {
    User userById = userService.getUserById(1);
    System.out.println(userById);
  }

  @Test
  public void insert() {
    User user = new User();
    user.setAge(22);
    user.setMobile("13767225247");
    user.setName("甜甜");
    user.setNickname("美丽的女孩");
    boolean insert = userService.insert(user);
    System.out.println(insert);
  }
}