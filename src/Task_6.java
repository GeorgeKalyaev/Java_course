import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_6 {
    public void Task_6_FancyMethod() {

        Scanner name_scaner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int X = name_scaner.nextInt();
        //int X = Integer.parseInt(one);

        System.out.println("Введите второе число");
        int Y = name_scaner.nextInt();
        //int Y = Integer.parseInt(one);

        System.out.println("Введите третье число");
        int Z = name_scaner.nextInt();
        //int Z = Integer.parseInt(one);

        double average = (X + Y + Z) / 3;
        //System.out.print(average);

        double split = (double)average / 2;

        /*DecimalFormat decimalFormat = new DecimalFormat("#"); // рабочий вариант
        String splitResult = decimalFormat.format(split);
        System.out.println((splitResult));*/

        String splitResult = String.format("%.0f", split);
        //System.out.println((splitResult));

        int qwerty = Integer.parseInt(splitResult);

        if (qwerty > 3){
            System.out.println("Программа выполнена корректно");
        }

    }
}