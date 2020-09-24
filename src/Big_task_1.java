import java.util.Scanner;

public class Big_task_1 {
    public void Big_task_1_myFancyMethod() {
        int result = 0;
        int mult = 0;

       Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String bin = scanner.nextLine();

        int oneCount = 0;
        boolean validBinaryNum = true;

        for (int i = 0; i < bin.length() && validBinaryNum; i++) {
            char currentChar = bin.charAt(i);
            if (currentChar == '1') oneCount++;
            else if (currentChar != '0') {
                validBinaryNum = false;
            }
        }

        if (validBinaryNum && bin.length() != 0) {
            char[] symbols = bin.toCharArray();
            for (int i = symbols.length - 1; i >= 0; i--){
                int temp = 0;
                int a = Character.getNumericValue(symbols[i]);
                temp = a * pow(2, mult);
                mult++;
                result = result + temp;
            }
            System.out.println("Число в десятичном виде: " + result + " Число в двоичном виде "+ bin);
        } else {
            System.out.println("Число не является двоичным");
        }
    }

    public int pow(int a, int b) {
        int c = 1;
        for (int i = 0; i < b; i++) {
            c = c * a;
        }
        return c;
    }

}