package Entities;

public class Retangulo {

    public double largura;
    public double altura;

    public double somaDaArea() {
        return largura * altura;
    }
    public double somaDoPerimetro() {
        return  2 * (largura + altura);
    }

    public double somaDaDiagonal(){
        return Math.sqrt(largura * largura + altura * altura);
    }
}

