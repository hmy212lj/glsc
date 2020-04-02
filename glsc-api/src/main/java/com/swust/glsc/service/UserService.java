package com.swust.glsc.service;


import com.swust.glsc.bean.UmsMember;
import com.swust.glsc.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

  List<UmsMember> getAllUser();

  /**
   * 通过ID查找地址
   * @return
   */
  List<UmsMemberReceiveAddress> getumsMemberReceiveAddressesByMusId(String id);
}
