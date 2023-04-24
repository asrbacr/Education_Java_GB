import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayDeque;
// import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

import javax.management.Query;

/**
 * InClass
 */
public class InClass {

    public static void main(String[] args) {
        
        // Сортровака

        // удалить целые числа ДЗ
        // в цилке forech заложен итератор
        /* Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if 
        } */

        /* List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        
        long start2 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list2.add(i);
        }
        long end2 = System.nanoTime();
        System.out.println(end2 - start2); */

        // стэк и очередь
        /* Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        for (int i = 0; i < 15; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        } */

        /* Random rand = new Random();
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for (int i = 0; i < 15; i++) {
            pQueue.add(rand.nextInt(10));
        }
        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.remove() + " ");
        } */


        


        

        

    }
}