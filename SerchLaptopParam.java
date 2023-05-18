import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * SerchLaptopParam - класс для поиска по параметрам
 */
public class SerchLaptopParam {

    /**
     * Список возможный параметров для поиска
     */
    public static HashMap<Integer, String> AllMainParam(){
        HashMap<Integer, String> paramForSerch = new HashMap<>();
        paramForSerch.put(1, "Бренд");
        paramForSerch.put(2, "Оперативная память");
        paramForSerch.put(3, "Объём памяти диска");
        paramForSerch.put(4, "Операционная система");
        paramForSerch.put(5, "Цвет");
        // paramForSerch.put(6, "Наличие дисковода");
        
        return paramForSerch;
    }

    /**
     * Ввод параметра от пользователя
     */ 
    public static int InputUserParam(HashMap<Integer, String> paramForSerch, Scanner iScanner) {
        System.out.println("Выберите цифру, соответствующую необходимому параметру:");

        for (var el : paramForSerch.entrySet())
            System.out.println(el.getKey() + ". " + el.getValue());

        System.out.print("\nВаш выбор: ");
        int choice = iScanner.nextInt();
        iScanner.nextLine();

        return choice;
    }

    /**
     * Ввод значение мин и макс для поиска
     */
    public static int ExtremeValues(HashMap<Integer, String> paramForSerch, ArrayList<Laptop> al, HashMap<String, ArrayList<String>> strMap, Scanner iScanner, int firstChoice) {
        int choice = -1;

        if (firstChoice == 2 || firstChoice == 3) {
            System.out.println("Напишите минимально подходящее кол-во памяти (" + paramForSerch.get(firstChoice) + ").");
            System.out.print("Кол-во памяти (ГБ): ");

            choice = iScanner.nextInt();
            iScanner.nextLine();
        }

        else if (firstChoice == 4 || firstChoice == 5 || firstChoice == 1) {
            ArrayList<String> strChoices = strMap.get(paramForSerch.get(firstChoice));
            System.out.println("Выберите один из подходящих вариантов (" + paramForSerch.get(firstChoice) + "):");

            for (int i = 0; i < strChoices.size(); i++) {
                System.out.println((i + 1) + ". " + strChoices.get(i));
                }

            System.out.print("\nВаш выбор: ");
            choice = iScanner.nextInt();
            iScanner.nextLine();
        }

        else {
            System.out.println("Такого выбора нет!");
            }

        return choice;
    }

    /**
     * Формирование списка вариантов и Вывод параметров
     */
    public static void filterFinal(int first, int second, HashMap<String, ArrayList<String>> strMap, ArrayList<Laptop> al) {
        ArrayList<Laptop> matching = new ArrayList<>();

        switch (first) {
            case 2:
                for (Laptop el: al)
                    if (el.RAM >= second)
                        matching.add(el);
                break;

            case 3:
                for (Laptop el: al)
                    if (el.ROM >= second)
                        matching.add(el);
                break;

            case 4:
                if (strMap.get("Операционная система").size() <= second - 1 || second < 1) {
                    System.out.println("Такого выбора нет!");
                    break;
                }

                for (Laptop el: al)
                    if (strMap.get("Операционная система").get(second - 1).equals(el.OS))
                        matching.add(el);
                break;

            case 5:
                if (strMap.get("Цвет").size() <= second - 1 || second < 1) {
                    System.out.println("Такого выбора нет!");
                    break;
                }

                for (Laptop el: al)
                    if (strMap.get("Цвет").get(second - 1).equals(el.colors))
                        matching.add(el);
                break;

            default:
                break;
        }

        if (matching.size() < 1) System.out.println("Нет подходящих вариантов(");
        else {
            System.out.println("\n---- Все подходящие варианты ----\n");
            for (Laptop el: matching) el.printInfo();
            System.out.println("\n---------------------------------\n");
        }
    }


    /**
     * Метод для создания словаря с уникальными значениями ОС и цвета
     */
    public static HashMap<String, ArrayList<String>> getStringChoices(HashMap<Integer, String> paramForSerch, ArrayList<Laptop> al) {
        HashMap<String, ArrayList<String>> strMap = new HashMap<>();

        HashSet<String> oses = new HashSet<>();
        HashSet<String> colors = new HashSet<>();
        ArrayList<String> osList = new ArrayList<>();
        ArrayList<String> colorList = new ArrayList<>();

        for (Laptop el: al) {
            oses.add(el.OS);
            colors.add(el.colors);
        }

        osList.addAll(oses);
        colorList.addAll(colors);

        strMap.put(paramForSerch.get(3), osList);
        strMap.put(paramForSerch.get(4), colorList);

        return strMap;
    }

}
