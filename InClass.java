import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InClass {
    public static void main(String[] args) {
        
        /* // Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        long start = System.nanoTime();
        for (int i = 0; i < args.length; i++) {
            
        }
        System.out.println(s1 == s6);
        System.out.println(s1.equals(s6)); */

        /* Заполнить список десятью случайными числами. 
        Отсортировать список методом sort() и вывести его на экран. */
        // https://metanit.com/java/tutorial/5.2.php

        // ArrayList<Integer> list = new ArrayList<>();
        // Random rn = new Random();
        // for (int i = 0; i < 10; i++) {
            //     list.add(rn.nextInt(10));
        // }
        // System.out.println(list);
        
        // list.sort(null);
        // System.out.println(list);

        /* Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
        Вывести название каждой планеты и количество его повторений в списке.
        String[] planets = {“”, “”...} */
        
        Random rn = new Random();
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluton"};

        ArrayList<String> listPalnet = new ArrayList<>();
        
        for (int i = 0; i < 15; i++) {
           int randomElem = rn.nextInt(planets.length);
            listPalnet.add(planets[randomElem]);
        }
        System.out.println(listPalnet);
    }

    public static void planet() {
        String[] planets = {
                "Mercury",
                "Venus",
                "Earth",
                "Mars",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Neptune",
                "Pluto"};

        ArrayList<String> listPlanets = new ArrayList<String>();
        Random rn = new Random();

        for (int i = 0; i < 15; i++) {
            int randomElem = rn.nextInt(planets.length);
            listPlanets.add(planets[randomElem]);

        }

        Map<String, Integer> mapPlanets = new HashMap<String, Integer>();
        for (String planet:listPlanets) {
            boolean isKeyExists = mapPlanets.containsKey(planet);
            if(isKeyExists) {
                int count = mapPlanets.get(planet);
                mapPlanets.put(planet, ++count);
            } else {
                mapPlanets.put(planet, 1);
            }
        }

        System.out.println(listPlanets);
        System.out.println(mapPlanets);
    }

}
