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

  //  private final Logger logger = LoggerFactory.getLogger(LoggerTest.class); //使用lombok就可以不用写这,直接用log进行调用
    @Test
    public void test1(){
      String name = "imooc";
      log.info("info...{}",name); // 日志使用占位符展示
      log.debug("debug...");
      log.error("error...");
    }

}
