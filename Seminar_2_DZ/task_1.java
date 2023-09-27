package Seminar_2_DZ;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя
 * ввод дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class task_1 {
    
    public static void main(String[] args) {
        Scanner iSkan = new Scanner(System.in);
        float number = 0;
        boolean inputCorrecting = false;
        while (!inputCorrecting) {
            System.out.print("Введите число дробного типа: ");
            String userInput = iSkan.nextLine();

            try {
                number = Float.parseFloat(userInput);
                inputCorrecting = true;
            } catch (NumberFormatException e) {
                System.out.println("Повторите ввод дробного числа");
            }
        }
        System.out.println("Вы ввели число " + number);
    }
}
