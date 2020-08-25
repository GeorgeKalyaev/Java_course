import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_7 {
    public void Task_7_myFancyMethod() {

        Scanner name_scaner = new Scanner(System.in);
        System.out.println("Введите  число");
        int number = name_scaner.nextInt();

        int X = 55;
        int Y = 34;
        int Z = 4;

        if(number == X || number == Y || number == Z) {
            System.out.println("Данное значение имеется в константах");
        }else
            System.out.println("Такой константы нет!");
    }
}