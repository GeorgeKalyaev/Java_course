import java.util.Scanner;

public class Task_4 {
    public void Task_4_myFancyMethod() {
        Scanner name_scaner = new Scanner(System.in);
        System.out.println("Введите бинарное число: например 10001 ");
        String bin = name_scaner.nextLine(); // введное число сохр в bin
        int decade = Integer.parseInt(bin, 2);
        System.out.println("В десятичном формате это: " + decade);
    }
}



