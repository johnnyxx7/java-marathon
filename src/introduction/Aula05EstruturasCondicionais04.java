package introduction;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // utilizando switch, dado os valores de 1 a 7, imprima se é dia útil ou fim de semana.
        // considere 1 como domingo.

        byte dia = 5;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
        }
    }
}
