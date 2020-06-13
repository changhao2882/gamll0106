package com.atguigu.gmall.user.controller;

import java.util.Random;

public class RandomController {
    public static void main(String[] args) {
        Random c = new Random();
        Random r = new Random();

        int line = c.nextInt(5)+1;
        int row = r.nextInt(6)+1;
        System.out.println(line + "---" + row);
    }
}
