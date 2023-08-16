package Entities;

public class Funcionario {
    public String nome;
    public double salario_bruto;
     public double imposto;

     public double salarioLiquido(){
         return  salario_bruto - imposto;
     }

     public void aumentar_salrio(double porcentagem){
         salario_bruto += salario_bruto * porcentagem / 100.0;
     }

     public String toString(){
         return nome
                 +", R$"
                 + salarioLiquido()
                 +" reais";
     }

}
