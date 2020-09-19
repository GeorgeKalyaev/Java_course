import java.io.*;
import java.util.Scanner;

public class Task_17 {
    public void Task_17_myFancyMethod() {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("признак ввода стоп - stop");

        try(FileWriter fw = new FileWriter("test.txt"))
        {
            do {
                System.out.print(": ");
                str = br.readLine();

                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        }catch (IOException exc){
            System.out.println("Ошибка ввода-вывода " + exc);
        }
    }
}