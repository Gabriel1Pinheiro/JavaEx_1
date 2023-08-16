package Entities;

public class Alunos {
    public String nome;
    public double notaSemestre;
    public double notaBimestre;
    public double notaTrimestral;

    public double notaFinal() {
        return  notaSemestre + notaBimestre + notaTrimestral;
    }

    public double confirmandoNota(){
        if (notaFinal() < 60){
            return 60.00 - notaFinal();
        }else{
            return 0.0;
        }
    }


}
