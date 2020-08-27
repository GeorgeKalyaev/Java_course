import java.util.Scanner;

public class Task_12 {
    public void Task_12_myFancyMethod() {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String b = name.replaceAll(" ", "");
        System.out.println(b);

    }
}