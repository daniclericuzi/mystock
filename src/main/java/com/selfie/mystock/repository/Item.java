package com.selfie.mystock.repository;

import java.math.BigDecimal;

public class Item {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal quantity;
    private Measure measure;

    public Item(String name, String brand, BigDecimal price, BigDecimal quantity, Measure measure){
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.measure = measure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }
}
