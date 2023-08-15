package Application;

import Entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Insira ás médidas do triângulo X: ");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Insira ás médidas do triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.Area();
        double areaY = y.Area();

        System.out.printf("A área do triangulo X é: %.4f%n", areaX);
        System.out.printf("A área do triangulo Y é: %.4f%n", areaY);


        if(areaX > areaY){
            System.out.printf("A area X é a maior ");
        }
        else{
            System.out.printf("A area Y é a maior");
        }

        sc.close();
    }
}
