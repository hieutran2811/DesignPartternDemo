package BehavioralPatterns.IteratorPattern;

import java.util.List;

public class ProductIterator implements Iterator<Product> {
    private List<Product> products;
    private int currentIndex = 0;

    public ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < products.size();
    }

    @Override
    public Product next() {
        return products.get(currentIndex++);
    }
}
