package com.swust.glsc.user.controller;

import java.util.Random;

public class RandomPeople {

  public static void main(String[] args) {
    Random row=new Random();
    Random col=new Random();
    int lie = col.nextInt(4) + 1;
    int hang=row.nextInt(8)+1;
    System.out.println("有请第"+lie+"列第"+hang+"行的同学回答问题");
  }


}
