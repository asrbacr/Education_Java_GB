import java.util.Scanner;
import java.util.ArrayList;

public class DZ_01 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Задачи:\n1.1 Вычислить n-ое треугольного число.\n1.2 Вычислить n факториал.\n2 Вывести все простые числа от 1 до 1000.\n2. Вывести все простые числа от 1 до 1000.");
        System.out.printf("Введите номер задачи для проверки: ");
        String numb = iScanner.nextLine();
        switch (numb) {
            case "1.1":
                int x = inputUser();
                System.out.printf("Сумма чисел от 1 до %s = %s", x, triangularNumber(x));
                break;
            case "1.2":
                x = inputUser();
                System.out.printf("Факториал числа %s! = %s", x, Factorial(x));
                break;
            case "2":
                System.out.println("Все простые числа от 1 до 1000");

                break;
        
            default:
                break;
        }
        iScanner.close();
    }

    public static Integer inputUser() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int x = iScanner.nextInt();
        iScanner.close();
        return x;
        
    }

    public static Integer triangularNumber(int number) {
        int Summ = 0;
        if (number < 0) number *= (-1);

        for (int i = 0; i <= number; i++) {
            Summ += i;
        }
        return Summ;
    }

    public static Integer Factorial(int number) {
        int result = 1;
        if (number < 0) number *= (-1);
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static ArrayList<Integer> primeNumber() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
           
            
            }
            
            
        }

    }

}
