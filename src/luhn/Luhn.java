
package luhn;


public class Luhn {
    //Algoritmo de luhn para tarjetas con 16 dígitos
    public static void main(String[] args) {
        int valores[] = {4,1,3,7,8,9,4,7,1,1,7,5,5,9,0,4};
        System.out.println(luhn(valores));
    }
    public static String luhn(int[] valores) {
        int total = 0;
        for (int i = 0; i < valores.length; i++) {
            if (i % 2 == 0) {
                valores[i] *= 2;
            }
            if (valores[i] > 9) {
                valores[i] = valores[i] - 9;
            }
            total += valores[i];
        }
        return (total % 10 == 0) ? "Valido" : "Invalido";
    }

}
