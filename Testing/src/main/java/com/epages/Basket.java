package com.epages;

import java.util.ArrayList;
import java.util.List;

import com.epages.exception.NoProductsInBasketException;
import com.epages.exception.NoStockException;
import com.epages.products.Product;

public class Basket {

    private List<ProductItem> products;

    public Basket() {
        products = new ArrayList<ProductItem>();
    }

    public List<ProductItem> getProducts() {
        return products;
    }

    public List<ProductItem> addProduct(Product product, int quantity) throws NoStockException {
        int stock = product.getStock();
        if (stock >= quantity) {
            ProductItem productItem = new ProductItem();
            product.setStock(stock - quantity);
            productItem.setProduct(product);
            productItem.setQuantity(quantity);
            products.add(productItem);
        }
        else {
            throw new NoStockException("We ran out of stock!");
        }

        return products;
    }

    public double doCheckout() throws NoProductsInBasketException {
        double price = 0;
        if (products.size() == 0) {
            throw new NoProductsInBasketException("Basket is empty :(");
        }

        for (ProductItem productItem : products) {
            Product product = productItem.getProduct();
            price += product.getPrice() * productItem.getQuantity();
        }

        products.clear();

        return price;
    }

}