package com.itheima.dao;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2020/12/31
 */
public class DaoTest {

    @Test
    public void testDao(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
        ItemsDao itemsDao = app.getBean(ItemsDao.class);
        System.out.println(itemsDao.findAll());
    }
}
