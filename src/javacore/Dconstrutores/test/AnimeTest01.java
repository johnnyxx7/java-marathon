package javacore.Dconstrutores.test;

import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("No Game No Life", "Ação", 12, "Isekai");
        anime.imprime();

        Anime anime2 = new Anime();
        anime2.imprime();
    }
}