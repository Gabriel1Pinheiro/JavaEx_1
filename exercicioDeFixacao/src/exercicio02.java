import Entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retificar = new Retangulo();

        System.out.println("informe a largura do retângulo: ");
        retificar.altura = sc.nextDouble();

        System.out.println("Agora informe a altura do retângulo: ");
        retificar.largura = sc.nextDouble();

        System.out.printf("A soma da área é %.2f%n", retificar.somaDaArea());

        System.out.printf("A soma do perímetro é %.2f%n", retificar.somaDoPerimetro());

        System.out.printf("A soma da diagonal é %.2f%n", retificar.somaDaDiagonal());

        sc.close();
    }

}