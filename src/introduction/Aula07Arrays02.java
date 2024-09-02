package introduction;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte. short, int, long, float e double = 0
        // char = 'u\0000' ' '
        // String = null

        String nomes[] = new String[3];

        nomes[0] = "John";
        nomes[1] = "Maysa";
        nomes[2] = "Sofia";

        for (int i = -0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}