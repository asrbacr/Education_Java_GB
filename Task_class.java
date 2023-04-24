import java.util.LinkedList;
import java.util.Scanner;

public class Task_class {
    public static void main(String[] args) {
        /* Реализовать консольное приложение, которое:
        1. Принимает от пользователя строку вида 
        text~num
        2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num. Использовать метод Split
        3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка. */

        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(list.toString());
            System.out.println("Введите вашу команду: ");
            String command = scanner.nextLine();

            String[] parts = command.split("~");
            if (parts.length != 2) {
                System.out.println("Ошибка, Не верный ввод");
                continue;
            }

            String text = parts[0];
            int position = Integer.parseInt(parts[1]);

            if (text.equals("print")) {
                if (position >= list.size()) {
                    System.out.println("Ошибка, вывод за пределы листа");
                    continue;                    
                }

                String remove = list.remove(position);
                System.out.println("Удалён элемент: " + remove);
            } else {
                if (position > list.size()) {
                    System.out.println("Ошибка, позиция ошибка");
                    continue;
                }
                list.add(position, text);
            }
        }
    }
}
