package org.produtos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Products produto1 = new Products();

        Locale.setDefault(Locale.US);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        produto1.name = input.next();
        System.out.print("Price: ");
        produto1.price = input.nextDouble();
        System.out.print("Quantity in stock: ");
        produto1.quantity = input.nextInt();
        System.out.println();

        produto1.printProductData();

        System.out.print("Enter the number of products to be added in stock: ");
        produto1.addProducts(input.nextInt());

        produto1.printProductData();

        System.out.print("Enter the number of products to be removed from stock: ");
        produto1.removeProducts(input.nextInt());

        produto1.printProductData();

        input.close();
    }
}
