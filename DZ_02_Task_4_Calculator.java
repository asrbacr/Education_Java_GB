import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * DZ_02.Task_4.Calculator
 */
public class DZ_02_Task_4_Calculator {
    static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        DecimalFormat dF = new DecimalFormat("#.###");
        // Scanner iScanner = new Scanner(System.in);
        System.out.println("Выход осуществляется командой stop на этапе ввода действия");
        Boolean flag = true;
        while (flag == true) {
            System.out.print("Введите число 1: ");
            Double a = iScanner.nextDouble();
            System.out.print("Введите действие (+, -, *, /, %): ");
            char operation = iScanner.next().charAt(0);
            System.out.print("Введите число 2: ");
            Double b = iScanner.nextDouble();
            String resultat = ResultCalc(a, b, operation);
            if (operation == 's' || operation == 'S')
                flag = false;
            else {
                System.out.printf("%s %s %s = %s\n", dF.format(a), operation, dF.format(b), resultat);
                try (FileWriter fw = new FileWriter("logCalc.log", true)) {
                    fw.write(String.valueOf(a) + " ");
                    fw.write(String.valueOf(operation) + " ");
                    fw.write(String.valueOf(b) + " = ");
                    fw.write(String.valueOf(resultat) + '\n');
                    fw.flush();
                }
            }
        }
        iScanner.close();
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