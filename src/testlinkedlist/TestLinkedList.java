package testlinkedlist;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: BillTinVT
 * @Assignment Name: testlinkedlist
 * @Date: Mar 2, 2016
 * @Description:
 */
//Imports
import java.util.*;

//Begin Class TestLinkedList
public class TestLinkedList {


    /* New Scanner object with class scope*/
    static Scanner sc = new Scanner(System.in);

    //Begin Main Method
    public static void main(String[] args) {

        //Variables
        int num;
        int menuLoc;

        /* New LinkedList object */
        Deque deq = new LinkedList();

        /* New Iterator object */
        Iterator iter = deq.iterator();

        /* Beginning number for queue */
        System.out.print("Enter a number to begin the queue: ");
        num = sc.nextInt();
        addNum(deq, num);   //Send to addNum Method

        do { //Begin do loop
            System.out.println("Select an option:");
            System.out.println("1. Add a number to the Front of Queue");
            System.out.println("2. Add a number to the Back of Queue");
            System.out.println("3. Modify the Queue");
            System.out.println("4. Print the Queue");
            System.out.println("5. Exit");
            System.out.print("Choice ->: ");
            menuLoc = sc.nextInt();

            if (menuLoc == 1 || menuLoc == 2) {
                System.out.print("Enter a number: ");
                num = sc.nextInt();
            }

            //Used to call methods
            switch (menuLoc) {
                case 1:
                    addFirst(deq, num);
                    break;
                case 2:
                    addLast(deq, num);
                    break;
                case 3:
                    removeNum(deq);
                    break;
                case 4:
                    printIt(iter, deq);
                    break;
                case 5:
                    goodBye();
                    break;
                default:
                    System.out.println("System error...\nExiting.");
                    System.exit(1);
            }
        } while (menuLoc != 5); //End do loop
    } //End Main Method

    /**
     * Method printIt: Prints contents of the queue using an iterator
     *
     * @param iter
     * @param deq
     */
    private static void printIt(Iterator iter, Deque deq) {
        iter = deq.iterator();
        System.out.print("Your queue contains: ");
        while (iter.hasNext()) {
            System.out.printf("%d", (int) iter.next());
            if (iter.hasNext()) {
                System.out.printf(",");
            }
        }

        System.out.print("\n");
    }

    /**
     * Method Goodbye: Used to exit program
     */
    private static void goodBye() {
        System.out.println("Program Exit\nGoodbye");
        System.exit(0);
    }

    /**
     * Method removeNum: Ask user to remove element from front or back of queue
     *
     * @param deq
     */
    private static void removeNum(Deque deq) {

        int ans;

        System.out.println("Select an option:");
        System.out.println("1. Remove from Front of Queue");
        System.out.println("2. Remove from Back of Queue");
        ans = sc.nextInt();
        if (ans == 1) {
            removeFront(deq);
        } else {
            removeBack(deq);
        }
    }

    /**
     * Method addNum: Add a number to queue
     *
     * @param deq
     * @param x
     */
    private static void addNum(Deque deq, int x) {
        deq.add(x);
    }

    /**
     * Method addFirst: Used to add a number to the front of the queue
     *
     * @param deq
     * @param x
     */
    private static void addFirst(Deque deq, int x) {
        deq.addFirst(x);
    }

    /**
     * Method addLast: Used to add a number to the back of the queue
     *
     * @param deq
     * @param x
     */
    private static void addLast(Deque deq, int x) {
        deq.addLast(x);
    }

    /**
     * Method romveFirst: Used to remove a number from the front of the queue
     *
     * @param deq
     */
    private static void removeFront(Deque deq) {
        deq.removeFirst();
    }

    /**
     * Method romveBack: Used to remove a number from the back of the queue
     *
     * @param deq
     */
    private static void removeBack(Deque deq) {
        deq.removeLast();
    }
} //End Class TestLinkedList
