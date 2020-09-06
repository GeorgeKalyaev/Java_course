import java.util.Scanner;

public class Task_10 {
    public void Task_10_myFancyMethod() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Задайте размерность массиву: ");
            int a = scanner.nextInt();
            int[][] array = new int[a][a];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print("Заполняем строку " + i + " столбец: " + j + " : ");
                    array[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array.length; j++){
                    array[i][j] = (j + 1) * 3;
                }
            }
            System.out.println("Выводим первую строку матрицы, умноженную на 3: ");
            for (int i = 0; i < array.length; i++, System.out.println()){
                if (i == 1)break;
                for (int j = 0; j < array.length; j++){
                    System.out.print(array[i][j]+" ");
                }
            }
        }
    }

