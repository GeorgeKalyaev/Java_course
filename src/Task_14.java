import java.util.Scanner;

public class Task_14 {
    public void Task_14_myFancyMethod() {
        Scanner name_scaner = new Scanner(System.in);
        System.out.println("Введите число");
        String S = name_scaner.nextLine();
        System.out.println(S);
        int X = Integer.parseInt(S);
        System.out.println(X);
        double Y = X;
        System.out.println(Y);
    }
}