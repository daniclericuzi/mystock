package com.selfie.mystock.service;

import com.selfie.mystock.repository.Item;
import com.selfie.mystock.repository.Measure;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ItemService {
    public Item findByName(String name){
        Item item = new Item("ketchup","heinz", new BigDecimal(10.50), new BigDecimal(2), new Measure("unidade"));

        return item;
    }
}
