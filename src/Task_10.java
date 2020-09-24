import java.util.Scanner;

public class Task_10 {
    public void Task_10_myFancyMethod() {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность строки матрицы: ");
        int OneArray = scanner.nextInt();
        System.out.println("Введите размерность столбца матрицы: ");
        int TwoArray = scanner.nextInt();
        int array[][] = new int[TwoArray][OneArray];

        System.out.println("Введите массив:");
        for (int i = 0; i < TwoArray; i++) {
            for (int j = 0; j < OneArray; j++) {
                System.out.print("Заполняем строку " + i + " столбец: " + j + " : ");
                array[i][j] = scanner.nextInt();
            }
            System.out.println(); // Enter между заполнения строк
        }
        System.out.print ("Вывод первой строки * 3:");
        for (int j = 0; j < OneArray; j++) {
            System.out.print (" " + array[0][j]*3);
        }
    }
}
