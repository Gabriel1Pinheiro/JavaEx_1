package Entities;

public class ConversorDeMoedas {

    public static double IOF = 0.06;
    public static double dolarPraReal(double preco, double quantia){
        return preco * quantia * (1.0 + IOF);
    }

}
