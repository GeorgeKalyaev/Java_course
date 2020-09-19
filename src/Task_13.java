import java.util.Scanner;

public class Task_13 {
    public void Task_13_myFancyMethod() {



        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        int lenS = stroka.length();

        String stroka2 = scanner.nextLine();
        int lenA = stroka2.length();

        if (lenS == lenA){
            System.out.println( "Длина строк равна! Первая введеная строка = " + lenS + " символ. Вторая введеная строка = " + lenA + " символ");
        }else if (lenS > lenA){
            System.out.println( "Первая введеная строка длиннее смотри: " + lenS + " символ.");
        }else if (lenA > lenS){
            System.out.println( "Вторая введеная строка длиннее смотри: " + lenA + " символ.");
        }
    }
}