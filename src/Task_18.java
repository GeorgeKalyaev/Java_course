import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

//import static org.graalvm.compiler.nodes.extended.StoreHubNode.write;

//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
//а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
//Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
public class Task_18 {
   // private static String fileName = "D:\\qwerty.txt";
   int lines;
   int qwerty = 0;

    public void Task_18_myFancyMethod() {
        try {
            File file = new File("D:\\qwerty.txt");
            Scanner scanner = new Scanner(file);

            Scanner scanner2 = new Scanner(System.in);

            while (scanner.hasNextLine()) {

                lines++;
                String[] array = scanner.nextLine().split(" ");

                for(int i=0; i < array.length; i++) {
                    System.out.println( array[i] );
                }

            }
            //Вводим данные для перезаписи
            System.out.println("Введите то, что хотите записать в файл: ");

            String[] text = new String[lines];

            while (qwerty != lines) {
                text[qwerty] = scanner2.nextLine();
                qwerty++;
            }
            File file2 = new File("D:\\qwerty.txt");
            try{
                //PrintWriter обеспечит возможности записи в файл
                PrintWriter printWriter = new PrintWriter(file2.getAbsoluteFile());
                try{
                    //записываем текст файла
                    for (int i=0; i < text.length; i++){
                    printWriter.print(text[i]+ "\n");
                     }
                } finally {
                    //закрываем файл обязательно
                       printWriter.close();
                }
            } catch (IOException e){
                throw new RuntimeException(e);
            }

            //Чтение файла второй раз
            String textFromFile2 = read();
            System.out.println("Данные из файла после перезаписи: \n" + textFromFile2 );

       } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String read () throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        try{
            //Объект для чтения файла в буфер
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\qwerty.txt"));
            try{
                //В цикле построчно считываем файл
                String s; //объявляем переменную, куда поместим считываемые строки с файла
                while ((s = bufferedReader.readLine()) != null) { //выполнять пока есть что считывать
                    stringBuilder.append(s + "\n");
                }
            } finally {
                //закрываем считыватель
                bufferedReader.close();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        //Возвращаем полученный текст с файла
        return stringBuilder.toString();
    }
}

