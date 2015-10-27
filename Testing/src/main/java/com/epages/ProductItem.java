package com.epages;

import com.epages.products.Product;

public class ProductItem {

    private Product product;
    private int quantity;

    public ProductItem(){}

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}