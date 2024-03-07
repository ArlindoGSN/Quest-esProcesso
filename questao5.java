import java.util.Scanner;
public class questao5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe uma string: ");
            String input = scanner.nextLine();

            String reversed = invertString(input);
            System.out.println("String invertida: " + reversed);
        }

        public static String invertString(String str) {
            char[] chars = str.toCharArray();
            int start = 0;
            int end = chars.length - 1;

            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;

                start++;
                end--;
            }

            return new String(chars);
        }
    }

