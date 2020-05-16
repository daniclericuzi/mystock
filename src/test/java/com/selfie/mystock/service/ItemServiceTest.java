package com.selfie.mystock.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ComponentScan("com.selfie.mystock")
@EnableAutoConfiguration
public class ItemServiceTest {
    @Autowired
    ItemService itemService;

    @Test
    public void testCheckQuantityReturnTrue(){
        int quantity = 3;
        boolean result = itemService.checkQuantity(quantity);

        Assert.assertTrue(result);
    }

    @Test
    public void testCheckQuantityReturnFalse(){
        int quantity = -1;
        boolean result = itemService.checkQuantity(quantity);

        Assert.assertFalse(result);
    }
}


