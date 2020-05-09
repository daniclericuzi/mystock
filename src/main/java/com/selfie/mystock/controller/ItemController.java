package com.selfie.mystock.controller;

import com.selfie.mystock.repository.Item;
import com.selfie.mystock.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/item")
    public Item getItem(){
        return itemService.findByName("");
    }
}
