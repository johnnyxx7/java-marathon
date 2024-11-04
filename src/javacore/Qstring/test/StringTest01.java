package javacore.Qstring.test;

public class StringTest01 {
   public static void main(String[] args) {
       String nome = "Johnny"; // String constant pool
       String nome2 = "Johnny";
       nome = nome.concat(" Araujo");
       System.out.println(nome);
       System.out.println(nome == nome2);
       String nome3 = new String("Johnny"); // 1. uma variavel de referencia 2. objeto do tipo string 3. uma string no pool
       System.out.println(nome2 == nome3);
       System.out.println(nome2 == nome3.intern());
   }
}
