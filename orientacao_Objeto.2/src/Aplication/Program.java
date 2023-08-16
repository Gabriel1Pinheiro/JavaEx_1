package Aplication;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println(" Insira os dados do produto:");
        System.out.print("Name:");
        product.name = sc.nextLine();

        System.out.print("preço: ");
        product.price = sc.nextDouble();

        System.out.print("Quantidade: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Informação do produto: " + product);

        System.out.println();
        System.out.println("Informe a quantidade de produtos a serem adicionados ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        System.out.println();
        System.out.println("Informe a quantidade de produtos a serem retirados do estoque:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        sc.close();
    }
}
