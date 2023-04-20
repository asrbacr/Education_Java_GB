import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class DZ_01 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Задачи:\n1.1 Вычислить n-ое треугольного число.\n1.2 Вычислить n факториал.\n2. Вывести все простые числа от 1 до 1000.\n3. Простой калькулятор (выход осуществляется командой stop)");
        System.out.printf("Введите номер задачи для проверки: ");
        String numb = iScanner.nextLine();
        switch (numb) {
            case "1.1":
                System.out.print("Введите число: ");
                int x = iScanner.nextInt();
                System.out.printf("Сумма чисел от 1 до %d = %d", x, triangularNumber(x));
                break;
            case "1.2":
                System.out.print("Введите число: ");
                x = iScanner.nextInt();
                System.out.printf("Факториал числа %d! = %d", x, Factorial(x));
                break;
            case "2":
                System.out.println("Все простые числа от 1 до 1000");
                System.out.println(primeNumber());
                break;
            case "3":
                System.out.println("Выход осуществляется командой stop");
                Boolean flag = true;
                while (flag == true) {
                    System.out.print("Введите число 1: ");
                    // Scanner numbFloat = new Scanner(System.in);
                    Double a = iScanner.nextDouble();

                    System.out.print("Введите действие (+, -, *, /, %): ");
                    char operation = iScanner.next().charAt(0);

                    System.out.print("Введите число 2: ");

                    Double b = iScanner.nextDouble();

                    String resultat = ResultCalc(a, b, operation);
                    // Scanner inputOperation = new Scanner(System.in);
                    // inputOperation.close();
                    if (operation == 's' || operation == 'S')
                        flag = false;
                    else {
                            // Double resultat = ResultCalc(a, b, operation);
                            System.out.printf("%f %s %f = %s\n", a, operation, b, resultat);
                        }
                    // System.out.printf("%.1f %s %.1f = %s\n\n", a, operation, b, resultat);
                        
                    // numbFloat.close();
                }

                break;

            default:
                System.out.println("Введён не верный номер.");
                break;
        }
        iScanner.close();
    }

    public static Integer triangularNumber(int number) {
        int Summ = 0;
        if (number < 0)
            number *= (-1);

        for (int i = 0; i <= number; i++) {
            Summ += i;
        }
        return Summ;
    }

    public static Integer Factorial(int number) {
        int result = 1;
        if (number < 0)
            number *= (-1);
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * @return
     */
    public static int[] primeNumber() {
    int[] myArray = new int[20];

    for (int i = 1; i <= 20; i++) {
        myArray[i - 1] = i;
    }

    
    for (int i = 2; i < myArray.length; i++) {
        if (myArray[i] % i == 0 && myArray[i] / i != 1) {

        }
    }

    for (int i = 0; i < myArray.length; i++) {
        System.out.print(myArray[i] + " ");
        
    }
    return myArray;
    }

    public static String ResultCalc(Double a, Double b, char operation) {
        Double result = 0.0;

        if (operation == '+')
            result = a + b;
        else if (operation == '-')
            result = a - b;
        else if (operation == '*')
            result = a * b;
        else if (operation == '/')
            result = a / b;
        else if (operation == '%')
            result = a % b;
        

        // switch (operation) {
        // Float result = 0;
        // case "+":
        // result = a + b;
        // break;
        // case "-":
        // result = a - b;
        // break;
        // case "*":
        // result = a * b;
        // break;
        // case "/":
        // result = a / b;
        // break;
        // case "%":
        // result = a % b;
        // break;

        // default:
        // break;
        // }
        DecimalFormat dF = new DecimalFormat("#.###");
        String Res = dF.format(result);
        return Res;
    }

}
