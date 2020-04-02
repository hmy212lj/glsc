package com.swust.glsc.user.controller;

import com.swust.glsc.bean.UmsMember;
import com.swust.glsc.bean.UmsMemberReceiveAddress;
import com.swust.glsc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

  @Autowired
  private UserService userService;


  @RequestMapping("/getAllUser")
  @ResponseBody
  public List<UmsMember> getAllUser(){
    List<UmsMember> userMember=userService.getAllUser();
    return userMember;
  }


  @RequestMapping("/index")
  @ResponseBody
  public String Index(){
    return "hello";
  }


  @RequestMapping("/getAddress")
  @ResponseBody
  public List<UmsMemberReceiveAddress> getAddress(@RequestParam("id") String id){
    List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=userService.getumsMemberReceiveAddressesByMusId(id);
    return umsMemberReceiveAddresses;
  }

}
