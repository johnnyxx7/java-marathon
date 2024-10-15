package javacore.Jmodificadorfinal.test;

import javacore.Jmodificadorfinal.dominio.Carro;
import javacore.Jmodificadorfinal.dominio.Lamborghini;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Johnny");
        System.out.println(carro.COMPRADOR);
        Lamborghini lamborghini = new Lamborghini();
        lamborghini.setNome("Veneno");
        lamborghini.imprime();
    }
}
