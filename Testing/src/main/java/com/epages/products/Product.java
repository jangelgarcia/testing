package com.epages.products;

public class Product {

    private long id;
    private String name;
    private double price;
    private int stock;

    public Product() {}

    public Product(long id, String name, int stock, double price) {
        this.id = id;
        this.stock = stock;
        this.name = name;
        this.price = price;
    };

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price
                + ", stock=" + stock + "]";
    }
}
