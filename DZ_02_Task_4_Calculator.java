import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import javax.xml.crypto.Data;

/**
 * DZ_02.Task_4.Calculator
 */
public class DZ_02_Task_4_Calculator {
    static Scanner iScanner = new Scanner(System.in);
    static LocalDateTime startCalc = LocalDateTime.now();
    public static void main(String[] args) throws IOException {
        DecimalFormat dF = new DecimalFormat("#.###");
        // Scanner iScanner = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("logCalc.log", true)) {
            System.out.println("Выход осуществляется командой stop на этапе ввода действия");
            fw.write("Запуск " + String.valueOf(startCalc) + '\n');
            
            Boolean flag = true;
            while (flag == true) {
                System.out.print("Введите число 1: ");
                Double a = iScanner.nextDouble();
                // Double a = 4.0;
                System.out.print("Введите действие (+, -, *, /, %): ");
                char operation = iScanner.next().charAt(0);
                // char operation = '+';
                System.out.print("Введите число 2: ");
                Double b = iScanner.nextDouble();
                // Double b = 4.0;
                String resultat = ResultCalc(a, b, operation);
                if (operation == 's' || operation == 'S'){
                    fw.write("end program\n");
                    flag = false;
                }
                else {
                    System.out.printf("%s %s %s = %s\n", dF.format(a), operation, dF.format(b), resultat);
                    fw.write(String.valueOf(a) + " ");
                    fw.write(String.valueOf(operation) + " ");
                    fw.write(String.valueOf(b) + " = ");
                    fw.write(String.valueOf(resultat) + '\n');
                };
            }
            fw.flush();
        }
        iScanner.close();
    }

    public static String ResultCalc(Double a, Double b, char operation) {
        Double result = 0.0;

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;

            default:
                break;
        }

        DecimalFormat dF = new DecimalFormat("#.###");
        String Res = dF.format(result);
        return Res;
    }

}