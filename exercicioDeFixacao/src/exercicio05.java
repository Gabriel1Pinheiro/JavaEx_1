import Entities.ConversorDeMoedas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ConversorDeMoedas con = new ConversorDeMoedas();

        System.out.println("qual é o preço do dólar");
        double preco = sc.nextDouble();

        System.out.println("quantos dólares serão comprados");
        double quantia = sc.nextDouble();

        double resultado = ConversorDeMoedas.dolarPraReal(preco, quantia);
        System.out.printf("Valor a ser pago em reais:  R$%.2f%n", resultado);


        sc.close();
    }
}
