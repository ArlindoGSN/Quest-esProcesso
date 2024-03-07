import java.util.Scanner;
public class questao2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();

            if (isFibonacci(numero)) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não pertence à sequência de Fibonacci.");
            }
        }

        public static boolean isFibonacci(int num) {
            int a = 0, b = 1, soma;

            while (a <= num) {
                if (a == num) {
                    return true;
                }
                soma = a + b;
                a = b;
                b = soma;
            }

            return false;
        }


}
