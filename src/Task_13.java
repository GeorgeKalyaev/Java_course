import java.util.Scanner;

public class Task_13 {
    public void Task_13_myFancyMethod() {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        int lenS = stroka.length();

        String stroka2 = scanner.nextLine();
        int lenA = stroka2.length();

        if (lenS == lenA){
            System.out.println( "Длина строк равна! Ты посмотри!: " + lenS + " символ. А здесь " + lenA );
        }else if (lenS > lenA){
            System.out.println( "Эта строчки длиннее смотри: " + lenS + " символ.");
        }else if (lenA > lenS){

        }
    }
}