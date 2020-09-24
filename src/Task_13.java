import java.util.Scanner;

public class Task_13 {
    public void Task_13_myFancyMethod() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Первая строка ");
       String LineOne = scanner.nextLine();
       int LengthLineOne = LineOne.length();

       System.out.println("Вторая строка ");
       String LineTwo = scanner.nextLine();
       int LengthLineTwo = LineTwo.length();

       if (LengthLineOne == LengthLineTwo){System.out.println( "Длина строк равна! Первая введеная строка = " + LengthLineOne + " символ. Вторая введеная строка = " + LengthLineTwo + " символ");}
       else if (LengthLineOne > LengthLineTwo){System.out.println("Первая строка длиннее: " + LengthLineOne + " символ.");}
       else {System.out.println("Вторая строка длиннее: " + LengthLineTwo + " символ.");}
    }
}