import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Stack;

public class TaskCalc {
    static Scanner iScanner = new Scanner(System.in);
    public static Integer step = 1;
    public static double RESULT = 0.d;

    public static Logger Log(String logFileCalc) throws IOException {
        Logger iLog = Logger.getLogger(TaskCalc.class.getName());
        iLog.setUseParentHandlers(false);

        FileHandler fh = new FileHandler(logFileCalc);
        iLog.addHandler(fh);
        SimpleFormatter txt = new SimpleFormatter();
        fh.setFormatter(txt);
        return iLog;
    }

    public static void main(String[] args) throws IOException {
        Logger calcLoger = Log("logCalcSeminar.log");
        calc(calcLoger);
        iScanner.close();
        System.out.println();
    }

    public static void calc(Logger logger) {
        boolean stop = false;
        Stack<Double> result = new Stack<>();
        Double inp1 = null;
        Double inp2 = null;
        while (!stop) {
            boolean err = true;
            if (step == 1) {
                inp1 = stepNum(err, logger, result);
                RESULT = result.get(0); // RESULT = inp1.doubleValue();
            } else if (step == 2) {
                inp2 = stepNum(err, logger, result);
            } else if (step == 3) {
                stop = action(err, stop, logger, inp1, inp2, result);
            }
        }

    }

    public static boolean action(boolean err, boolean stop, Logger logger,
            Double inp1, Double inp2, Stack<Double> result) {
        while (err) {
            System.out.print("Введите действие или stop или back: ");
            String act = iScanner.next();
            logger.log(Level.INFO, "Введено действие " + act.toString());
            switch (act) {
                case "+": {
                    System.out.println();
                    err = false;
                    result.push(inp1.doubleValue() + inp2.doubleValue());
                    RESULT = inp1.doubleValue() + inp2.doubleValue();
                    step = 2;
                    System.out.println("Текущий результат: " + RESULT);
                }
                case "-": {
                    System.out.println();
                    err = false;
                    result.push(inp1.doubleValue() - inp2.doubleValue());
                    RESULT = inp1.doubleValue() - inp2.doubleValue();
                    step = 2;
                    System.out.println("Текущий результат: " + RESULT);
                }
                case "/": {
                    System.out.println();
                    err = false;
                    result.push(inp1.doubleValue() / inp2.doubleValue());
                    RESULT = inp1.doubleValue() / inp2.doubleValue();
                    step = 2;
                    System.out.println("Текущий результат: " + RESULT);
                }
                case "*": {
                    System.out.println();
                    err = false;
                    result.push(inp1.doubleValue() * inp2.doubleValue());
                    RESULT = inp1.doubleValue() * inp2.doubleValue();
                    step = 2;
                    System.out.println("Текущий результат: " + RESULT);
                }
                case "stop": {
                    System.out.println();
                    System.out.println("stop");
                    err = false;
                    stop = true;
                }
                case "back": {
                    if (result.isEmpty()) {
                        System.out.println("Текущий результат: " + RESULT);
                    }
                    System.out.println("\n");
                    err = false;
                    result.pop();
                    RESULT = result.pop();
                    System.out.println("Текущий результат: " + RESULT);
                }
                default: {
                    logger.log(Level.INFO, "Ошибка ввода действия");
                    iScanner.next();
                }
            }
        }
        return stop;
    }

    public static Double stepNum(boolean err, Logger log, Stack<Double> result) {
        Double input = null;
        while (err) {
            try {
                System.out.printf("Введите число %s: ", step.toString());
                String inp = iScanner.next();
                input = Double.valueOf(inp);
                log.log(Level.INFO, step.toString() + " введеное число: " + input.toString() + " или команда 'back'");
                if (step == 1)
                    result.add(0, input.doubleValue());
                err = false;
                step++;
            } catch (Exception ex) {
                System.out.println("Ошибка ввода");
            }
        }
        return input;
    }
}
