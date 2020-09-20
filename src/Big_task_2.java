import java.util.Arrays;
import java.util.Scanner;

public class Big_task_2 {
    public void Big_task_2_myFancyMethod() {

        System.out.println("Задайте размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] array = new int[size]; // Создаём массив int размером в size

        System.out.println("Заполните массив элементами: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        // Выводим на экран, полученный массив
        System.out.println("Выводим на экран полученный массив:" + Arrays.toString(array));

        //Делаем сортировку массива
        for (int j = 0; j < array.length - 1; j++) {
            int least = j;
            for (int k = j + 1; k < array.length; k++) {
                if (array[k] < array[least]) {
                    least = k;
                }
            }
            int tmp = array[j];
            array[j] = array[least];
            array[least] = tmp;
        }
        System.out.println("Выводим на экран отсортированный массив:" + Arrays.toString(array));
    }

    }
