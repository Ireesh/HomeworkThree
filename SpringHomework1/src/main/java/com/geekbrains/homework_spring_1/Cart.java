package com.geekbrains.homework_spring_1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    List<Product> products;

    public Cart() {
        this.products = new ArrayList<Product>();
    };

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProductById(int id) {
        for (Product product : products) {
            int temp = product.getId();
            if (temp == id) {
                products.remove(product);
            }
        }
    }

    public void printAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

