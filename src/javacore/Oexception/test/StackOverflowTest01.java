package javacore.Oexception.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursvidade();
    }

    public static void recursvidade() {
        recursvidade();
    }
}
