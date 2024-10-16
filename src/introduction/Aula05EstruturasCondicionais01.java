package introduction;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica.");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica.");
        }
    }
}