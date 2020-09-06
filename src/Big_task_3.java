import java.text.DecimalFormat;
import java.util.Scanner;

public class Big_task_3 {
    public void Big_task_3_myFancyMethod() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        double dollar = scanner.nextDouble();
        System.out.println("Вы ввели такой курс доллара: " + dollar);

        System.out.print("Колличество рублей: ");
        int rub = scanner.nextInt();
        System.out.println("Колличество рублей такое: " + rub);

        double total_dollars = rub/dollar;

        System.out.printf("%.2f", total_dollars);

    }
}