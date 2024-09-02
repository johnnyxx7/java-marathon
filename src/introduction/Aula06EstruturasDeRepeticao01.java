package introduction;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do-while, for
        int count = 1;
        while (count <= 10) {
            System.out.println("número atual WHILE = " + count);
            count++;
        }

        count = 1;

        do {
            System.out.println("número atual DO-WHILE = " + count);
            count++;
        } while(count <= 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println("número atual FOR = " + i);
        }
    }
}
