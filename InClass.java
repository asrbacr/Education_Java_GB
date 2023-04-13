// package Education_Java_GB;

import java.time.*;
import java.util.Scanner;

/**
 * InClass
 */
public class program {

    public static void main(String[] args) {
        
        // String - "", char - '' - отличия типов
        // shift + alt + a - комментарий
        // System.out.println("Hello world!");
        // LocalDateTime time = LocalDateTime.now();
        // System.out.println(time);
        // String encoding = System.getProperty("console.encoding", "cp866");
        // Scanner iScanner = new Scanner(System.in, encoding);
        // System.out.print("Введите имя: ");
        // String name = iScanner.nextLine();
        // System.out.println(name);
        // iScanner.close();
        // vremya(name);

        int[] math = endElement(3);

        printMath(math);
    }

    public static String vremya(String name) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        String res = "";
        // isAfter <time < isBefore
        if (time.isAfter(LocalTime.of(5,0)) && time.isBefore(LocalTime.of(11,59))){
            System.out.println("Доброе утро!");
            res = "Доброе утро!" + name;
        }    
        else if (time.isAfter(LocalTime.of(12,0)) && time.isBefore(LocalTime.of(17,59))){
            System.out.println("Добрый день!");
            res = "Добрый день!" + name;
        }     
        else {
            System.out.println("Добрый вечер! " + name);
            res = "Добрый вечер! " + name;
        }
        return res;
    }

    // public static void main(String[] args) {
    //    String greeting;
    //     if (time.isAfter(LocalTime.of(5,0)) && time.isBefore(LocalTime.of(11, 59)))
    //         greeting = "Доброе утро";
    //     else if (time.isAfter(LocalTime.of(12,0)) && time.isBefore(LocalTime.of(17, 59)))
    //         greeting = "Добрый день";
    //     else if (time.isAfter(LocalTime.of(18,0)) && time.isBefore(LocalTime.of(22, 59)))
    //         greeting = "Добрый вечер";
    //     else // (time.isAfter(LocalTime.of(23,0)) && time.isBefore(LocalTime.of(4, 59)))
    //         greeting = "Доброй ночи";
    //     System.out.printf("%s %s!", greeting, name); 
    //     }


// Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести максимальное количество подряд идущих 1.
// Найти максимальное количество подряд идущих одинаковых элементов массива. (постараться сделать с одним циклом)
    
        public static void maxCount(int value) {
            int count = 0;
            int maxCount = 0;
            int[] math1 = fillMath();
            for (int i = 0; i < math1.length; i++) {
                if (math1[i] == value) count++;
                if (count > maxCount) maxCount = count;
                if (math1[i] != value) count = 0;
    
            }
            System.out.println(maxCount);
            printMath(math1);
        }
    
        public static int[] fillMath() {
            int [] math = new int[10];
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                math[i] = rand.nextInt(5);
            }
            return math;
        }
    
        public static void printMath(int[] math) {
    //        for (int i = 0; i < math.length; i++) {
    //            System.out.print(math[i] + ", ");
    //        }
    
            for (int i: math) {
                System.out.print(i + ", ");
            }
            System.out.println();
            
        }

// Дан массив nums = [3,2,1,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
// [2,2,1,3,3] 
// [2,1,2,3,3]

        public static void endElement(int num) {
            int[] nums = fillMath();
            printMath(nums);
            int temp = 0;
            for (int i = 0; i < nums.length; i++){
                if (nums[i] == num){
                    temp = nums[i];
                    for (int j = i; j < num.length - i; j++){
                        nums[j] = nums[j + 1];
                    }
                    nums[nums.length - 1] = temp;
                }
            }
            
            return nums;    
        }
        


}