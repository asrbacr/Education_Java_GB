import java.util.HashMap;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println(isIzomorph());
    }

    public static Boolean isIzomorph() {
    String s1 = "add";
    String s2 = "egg";
    
    HashMap<Character, Character> map = new HashMap<>();
    if (s1.length() != s2.length()) return false;

    if (s1.equals(s2)) return true; 

    for (int i = 0; i < s1.length(); i++) {
        Character c1 = s1.charAt(i);
        Character c2 = s2.charAt(i);
        if (!map.containsKey(c1)) map.put(c1, c2); 
        else {
            if (map.get(c1) != c2) return false;
        }
        return true;
    }
}

private static Type name() {
        /* Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1*3) - ложь
        Пример 3: [6+(3*3)] - истина
        Пример 4: {a}[+]{(d*3)} - истина
        Пример 5: <{a}+{(d*3)}> - истина
        Пример 6: {a+]}{(d*3)} - ложь */

}

}
