import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task_class_2 {
    public static void main(String[] args) {

        /* Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней. Collection.reverse(...)
        Если введено revert, удаляет предыдущую введенную строку из памяти. */
        List<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(list.toString());
            System.out.println("Введите строку: ");
            String command = scanner.nextLine();
            if(command.equals("")){
                break;
            }
            if(command.equals("print")){
                Collections.reverse(list);

            }else if(command.equals("revert")){
                int size = list.size();
                if(size > 0){
                    list.remove(size-1);
                }else{
                    System.out.println("Ваш список пуст");
                }
            }else{
                list.add(command);
            }

        }
        scanner.close();
        
    }
}
