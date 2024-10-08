package BehavioralPatterns.IteratorPattern;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        productList.addProduct(new Product("Laptop"));
        productList.addProduct(new Product("Smartphone"));
        productList.addProduct(new Product("Tablet"));

        Iterator<Product> iterator = productList.createIterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println("Product: " + product.getName());
        }
    }
}
