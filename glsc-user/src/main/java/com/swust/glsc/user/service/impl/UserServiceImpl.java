package com.swust.glsc.user.service.impl;


import com.swust.glsc.bean.UmsMember;
import com.swust.glsc.bean.UmsMemberReceiveAddress;
import com.swust.glsc.service.UserService;
import com.swust.glsc.user.mapper.NumsMemberAddressMapper;
import com.swust.glsc.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Autowired
  private NumsMemberAddressMapper numsMemberAddressMapper;
  @Override
  public List<UmsMember> getAllUser() {
    return userMapper.getAllUser();
  }

  @Override
  public List<UmsMemberReceiveAddress> getumsMemberReceiveAddressesByMusId(String id) {
    Example e=new Example(UmsMemberReceiveAddress.class);
    e.createCriteria().andEqualTo("memberId",id);
    List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = numsMemberAddressMapper.selectByExample(e);
    return umsMemberReceiveAddresses;
  }
}
