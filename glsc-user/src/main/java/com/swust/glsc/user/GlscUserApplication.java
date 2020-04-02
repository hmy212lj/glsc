package com.swust.glsc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages ="com.swust.glsc.user.mapper")
public class GlscUserApplication {

  public static void main(String[] args) {
    SpringApplication.run(GlscUserApplication.class, args);
  }


}
