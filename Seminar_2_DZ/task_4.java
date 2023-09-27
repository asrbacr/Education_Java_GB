package Seminar_2_DZ;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, 
 * когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, 
 * что пустые строки вводить нельзя.
 */
public class task_4 {
    
    public static void main(String[] args) {
        Scanner iScan = new Scanner(System.in);
        String text = "";
        while (text.equals("")) {
           System.out.print("Введите, что хотите: ");
           text = iScan.nextLine();
           try {
              if (text.equals("")) {
                 throw new EmptyStringException();
              }
           } catch (EmptyStringException e) {
              System.out.println("Нельзя вводить пустые строки, повторите ввод");
           }
        }
        System.out.println("Текст, который вы ввели " + text);
   }
}

class EmptyStringException extends Exception {
   public EmptyStringException(){
      super();
   }
}
