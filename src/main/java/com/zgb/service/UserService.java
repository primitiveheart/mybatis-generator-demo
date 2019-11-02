package com.zgb.service;

import com.zgb.dao.test.UserMapper;
import com.zgb.model.test.User;
import com.zgb.model.test.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2019/11/2 10:08 上午
 * @Created By guanbao.zhou
 */
@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public User getUserById(Integer id){
    UserExample userExample = new UserExample();
    userExample.createCriteria().andIdEqualTo(id);
    List<User> users = userMapper.selectByExample(userExample);
    if (CollectionUtils.isEmpty(users)) {
      return null;
    }
    return users.get(0);
  }

  public boolean insert(User user) {
    int insert = userMapper.insert(user);
    return insert > 0;
  }
}
