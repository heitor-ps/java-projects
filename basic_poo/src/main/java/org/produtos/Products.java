package org.produtos;

public class Products {
    public String name;
    public double price;
    public int quantity;


    // Public methods

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public void printProductData() {
        System.out.printf("Product data: %s, R$%.2f, %d units TOTAL: R$%.2f ", name, price, quantity, totalValueInStock());
        System.out.println();
    }
}
