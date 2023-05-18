import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DZ_06 {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        Laptop laptop1 = new Laptop();
        laptop1.Brand = "Lenovo";
        laptop1.RAM = 4;
        laptop1.ROM = 500;
        laptop1.OS = "Windows 10";
        laptop1.colors = "white";
        laptop1.isCD_ROM = false;
        // laptop1.printInfo();

        Laptop laptop2 = new Laptop("Dell", 4, 250);
        laptop2.isCD_ROM = true;
        // laptop2.printInfo();

        Laptop laptop3 = new Laptop("Aser", 2, 120);
        laptop3.colors = "gray";
        Laptop laptop4 = new Laptop("DNS", 5, 360);
        laptop4.OS = null;
        Laptop laptop5 = new Laptop("Samsung", 3, 240);
        laptop5.isCD_ROM = true;
        laptop5.OS = "Windows 7";
        Laptop laptop6 = new Laptop("Apple", 8, 320);
        laptop6.colors = "green";
        laptop6.OS = "Mac 10";
        Laptop laptop7 = new Laptop("Asus", 4, 160, "Windows 10", "brown", false);

        //Вывод всех варианты 
        HashSet<Laptop> setLaptops = new HashSet<>(
                Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7));
        for (Laptop laptop : setLaptops) {
            laptop.printInfo();
        }

        ArrayList<Laptop> AllLaptops = new ArrayList<>();
        AllLaptops.add(laptop1);
        AllLaptops.add(laptop2);
        AllLaptops.add(laptop3);
        AllLaptops.add(laptop4);
        AllLaptops.add(laptop5);
        AllLaptops.add(laptop6);
        AllLaptops.add(laptop7);

        HashMap<Integer, String> sortingValues = SerchLaptopParam.AllMainParam();
        HashMap<String, ArrayList<String>> allStr = SerchLaptopParam.getStringChoices(sortingValues, AllLaptops);

        int firstChoice = SerchLaptopParam.InputUserParam(sortingValues, iScanner);

        int secondChoice = SerchLaptopParam.ExtremeValues(sortingValues, AllLaptops, allStr, iScanner, firstChoice);

        SerchLaptopParam.filterFinal(firstChoice, secondChoice, allStr, AllLaptops);

        iScanner.close();
    }
}
