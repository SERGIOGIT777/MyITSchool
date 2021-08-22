package Lesson.Student16.src.com.serg.zd3;


import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// Интерфейсы Collection Framework

        //Queue and DEQUE

        //add

        /*PriorityQueue<Integer> myPriority = new PriorityQueue<>();
        myPriority.add(1);
        myPriority.add(3);
        myPriority.add(5);

        for (int pr: myPriority){
            System.out.println(pr);
        }

        //remove and poll

        /*myPriority.remove();// убирает первый элемент из начала очереди
        System.out.println("After remove: ");
        for(int pr1: myPriority){
            System.out.println(pr1);
        }
        */

        /*myPriority.remove(3); // удаляет по элементу из очереди
        System.out.println("After remove: ");
        for(int pr2: myPriority){
            System.out.println(pr2);
        }
*/

        //offer

        PriorityQueue<Integer> myPrioryti = new PriorityQueue<>();
        myPrioryti.add(1);
        myPrioryti.add(2);
        myPrioryti.add(3);

        /*myPrioryti.offer(33);

        for (int pr:myPrioryti){
            System.out.println(pr);
        }

         */

        //peek - показывает первый элемент очереди

        System.out.println(myPrioryti.peek());

        String vb = "45 + 34";
        int a = Integer.parseInt(vb);

    }
}
