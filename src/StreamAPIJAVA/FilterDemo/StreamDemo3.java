package StreamAPIJAVA.FilterDemo;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    double price;

    public Product(int id,String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }}
public class StreamDemo3 {
    public static void main(String[] args) {
        List<Product> productList= new ArrayList<Product>();
        productList.add(new Product(1,"Laptop",50000));
        productList.add(new Product(2,"Mobile",20000));
        productList.add(new Product(3,"Tablet",15000));
        productList.add(new Product(4,"Smart Watch",10000));
        productList.add(new Product(5,"Headphones",3000));
        productList.add(new Product(6,"Camera",25000));
        productList.add(new Product(7,"Speaker",5000));
        productList.add(new Product(8,"Printer",15000));
        productList.add(new Product(9,"Monitor",20000));
        productList.add(new Product(10,"Keyboard",2000));
        filterProductsByPrice(productList, 15000);
        filterDuplicatePrices(productList);
    }
//    Filter according to the given price threshold
    public static void filterProductsByPrice(List<Product> productList, double priceThreshold) {
        List<Product> filteredProducts = productList.stream()
                .filter(product -> product.price < priceThreshold)
                .toList();
        filteredProducts.forEach(product -> System.out.println("Product ID: " + product.id + ", Name: " + product.name + ", Price: " + product.price));
    }
//    Find Duplicate prices
    public static void filterDuplicatePrices(List<Product> productList) {
        List<Double> duplicatePrices = productList.stream()
                .map(product -> product.price)
                .filter(price -> productList.stream().filter(p -> p.price == price).count() > 1)
                .distinct()
                .toList();
        System.out.println("Duplicate Prices: " + duplicatePrices);
    }
}
