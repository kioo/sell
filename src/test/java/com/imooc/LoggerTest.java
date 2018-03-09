package com.imooc;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * test unit
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

  //  private final Logger logger = LoggerFactory.getLogger(LoggerTest.class); //使用lombok就可以不用写这个,直接注入用log进行调用,目前不行
     private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){
      String name = "imooc";
      log.info("info...{}",name); // 日志使用占位符展示
      log.debug("debug...");
      log.error("error...");
    }

}
