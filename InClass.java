import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class InClass {
    public static void main(String[] args) {
        
       /*  HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<String, Integer> linHashMap = new LinkedHashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        fillHashMap(hashMap, linHashMap, treeMap);
        System.out.println();
        System.out.println(hashMap);
        System.out.println(linHashMap);
        System.out.println(treeMap); */
        HashMap<Integer, String> structureHashMap = new HashMap<>();
        fillPeople(structureHashMap);
    }

    private static void fillPeople(HashMap<Integer, String> structureHashMap) {
        Scanner iScanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String name = iScanner.nextLine();
            String[] nameSplit = name.split(" ");//nameSplit[0] -> 3434324, nameSplit[1] -> Ivanov
            structureHashMap.put(Integer.parseInt(nameSplit[0]), nameSplit[1]);
        }
        for (Map.Entry<Integer, String> el : structureHashMap.entrySet()) {
            if (el.getValue().equals("Ivanov")) System.out.println(el.getKey()+ " : " + el.getValue());
        }
        // System.out.println(structureHashMap);
        iScanner.close();

    }

    public static void fillHashMap(HashMap<String, Integer> hashMap, HashMap<String, Integer> linHashMap, TreeMap<String, Integer> treeMap ) {
        Random rand = new Random();
        for (Integer i = 0; i < 10; i++) {
            Integer k = rand.nextInt(15);
            String name = "Vasylii";
            System.out.printf("%d: %d\n", k, name.hashCode());
            hashMap.put(k.toString(), i);
            linHashMap.put(k.toString(), i);
            treeMap.put(k.toString(), i);
        }
    }
}