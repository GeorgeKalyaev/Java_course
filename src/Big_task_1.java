import java.util.Scanner;

public class Big_task_1 {
    public void Big_task_1_myFancyMethod() {
        int result = 0;
        int mult = 0;

       Scanner scanner = new Scanner(System.in);
        System.out.print("Число в двоичном формате: ");
        String s = scanner.nextLine();
        char[] symbols = s.toCharArray();

        for (int i = symbols.length - 1; i >= 0; i--){
            int temp = 0;
            int a = Character.getNumericValue(symbols[i]); // 5
            temp = a * pow(2, mult);
            mult++;
            result = result + temp;
        }
        System.out.println("Число в десятичном формате: " + result);
    }

    public static int pow(int a, int b) {
        int c = 1;
        for (int i = 0; i < b; i++) {
            c = c * a;
        }
        return c;
    }
}