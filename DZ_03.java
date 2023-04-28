import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DZ_03 {
    static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 1. Алгоритм сортировки слиянием
        // int[] arrayNumbs = { 77, 46, 11, 89, 48, 14, 67, 73, 22, 26, 47, 1, 67, 23, 4
        // };

        // 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
        ArrayList<Integer> oneList = GenArrayRandom(10, 10, 30);
        PrintConsoleArray(oneList);
        for (int i = 0; i <= oneList.size(); i++) {
            if (oneList.get(i) % 2 == 0)
                oneList.remove(i);
        }
        PrintConsoleArray(oneList);


        iScanner.close();
    }

    public static ArrayList<Integer> GenArrayRandom(Integer sizeArray, Integer minElem, Integer maxElem) {
        Random rand = new Random();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < sizeArray; i++)
            array.add(rand.nextInt(minElem, maxElem + 1));
        return array;
    }

    public static void PrintConsoleArray(ArrayList<Integer> array) {
        System.out.println();
        for (Integer el : array) {
            System.out.print(el.toString() + " ");
        }
    }


}
