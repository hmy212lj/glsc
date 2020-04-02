package com.swust.glsc.user.mapper;


import com.swust.glsc.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper  extends Mapper<UmsMember> {

  List<UmsMember> getAllUser();
}
