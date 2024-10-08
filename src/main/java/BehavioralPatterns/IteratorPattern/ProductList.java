package BehavioralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ProductList implements ProductCollection {
    private List<Product> products;

    public ProductList() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Iterator<Product> createIterator() {
        return new ProductIterator(products);
    }
}
