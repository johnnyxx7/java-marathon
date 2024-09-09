package javacore.introducaoclassesA.test;

import javacore.introducaoclassesA.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ferrari";
        carro1.modelo = "467";
        carro1.ano = 2020;

        carro2.nome = "Mercedes-Benz";
        carro2.modelo = "CLA-250";
        carro2.ano = 2022;

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro1.nome + " | Modelo: " + carro1.modelo + " | Ano: " + carro1.ano);

        System.out.println("----------------------");

        System.out.println("Carro 2");
        System.out.println("Nome: " + carro2.nome + " | Modelo: " + carro2.modelo + " | Ano: " + carro2.ano);
    }
}
