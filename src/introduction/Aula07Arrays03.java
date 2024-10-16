package introduction;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int numeros01[] = new int[5];
        int numeros02[] = {1, 2, 3, 4, 5};
        int numeros03[] = new int[]{5, 4, 3, 2, 1};

//        for (int i = 0; i < numeros02.length; i++) {
//            System.out.println(numeros02[i]);
//        }

        for(int num : numeros03) {
            System.out.println(num);
        }
    }
}
