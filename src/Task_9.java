import java.util.Scanner;

    public class Task_9 {
        public void Task_9_myFancyMethod() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Задайте размер массиву ");
            int size = scanner.nextInt();
            int[] array = new int[size]; // создали массив эррэй длину задали с клавы

            System.out.println("Заполните массив элементами: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt(); // каждый элемент массива заполняем
            }

            for(int i=0; i < array.length; i++) {
                array[i] = array[i] * 2;;
            }
            for(int i=0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

