import Entities.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Alunos aluno = new Alunos();

        System.out.println("Nome do aluno:");
        aluno.nome = sc.nextLine();

        System.out.println("Média do semestral do aluno:");
        aluno.notaSemestre = sc.nextDouble();

        System.out.println("Média do bimestre do aluno:");
        aluno.notaBimestre = sc.nextDouble();

        System.out.println("Média do trimestre do aluno:");
        aluno.notaTrimestral = sc.nextDouble();

        System.out.printf("Nota Final: %.2f%n", aluno.notaFinal());
        if (aluno.notaFinal() < 60.0) {
            System.out.println("REPROVADO");
            System.out.printf("Faltam %.2f Pontos%n", aluno.confirmandoNota());
        }
        else {
            System.out.println("APROVADO");
        }

                sc.close();
    }
}
