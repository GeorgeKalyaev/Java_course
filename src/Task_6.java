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
        System.out.println(average + "это average");

        double split = (double)average / 2;

        System.out.println(split + "это split");

        DecimalFormat decimalFormat = new DecimalFormat("#");
        String splitResult = decimalFormat.format(split);
        System.out.println((splitResult + " последний вариант"));

        int qwerty = Integer.parseInt(splitResult);

        if (qwerty >= 3){
            System.out.println("Программа выполнена корректно");
        }else {}

    }
}