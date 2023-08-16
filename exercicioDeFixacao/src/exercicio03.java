import Entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.println("Nome: ");
        func.nome = sc.nextLine();

        System.out.println("Salário bruto:");
        func.salario_bruto = sc.nextDouble();

        System.out.println("Imposto");
        func.imposto = sc.nextDouble();

        System.out.println("Funcionario " + func);

        System.out.println("Infome o percentual do aumento de salário");
        double porcentagem = sc.nextDouble();
        func.aumentar_salrio(porcentagem);
        System.out.println("Atualizaçao dos dados: " + func);

          sc.close();
    }
}
