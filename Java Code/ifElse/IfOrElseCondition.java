package ifElse;

import java.util.Scanner;

public class IfOrElseCondition {

    public static void main(String[] args) {

//        int age = 20;
////
////        if(age <= 14) {
////            System.out.println("Child");
////        } else if(age <= 18) {
////            System.out.println("Grandchild");
////        } else {
////            System.out.println("Grand");
////        }
//
//        // ternary operator ?
//
//        System.out.println(age <= 14 ? "Child" : "Grandchild");

//        int num = 10;


//        System.out.println(num != 10 ? num + 2 : num + 5);
//
//
//        String ans = (num != 11) ? (num == 20) ? "equal 20" : "not equal 20" : "not equal 10";
//
//        System.out.println(ans);


        // Loop

        // while, do while, for

        /*System.out.println("index 1");
        System.out.println("index 2");
        System.out.println("index 3");
        System.out.println("index 4");
        System.out.println("index 5");
        System.out.println("index 6");
        System.out.println("index 7");
        System.out.println("index 8");*/


        // init
        // condition
        // incre / decre

//        int i=1;

        // while loop
/*
        while(i <= 8) {
            System.out.println("Index " + i);
            i++;
        }
*/

        // for loop
/*        for( ; i<=8; ) {
            System.out.println("Index " + i);
            i++;
        }
*/

        // do while
/*        do {
            System.out.println("Index " + i);
            i++;
        } while(i < 9);
*/

        // Switch cass

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name : ");
//        String name = sc.nextLine();
//
//        switch (name) {
//            case "krupa":
//                System.out.println("good boy");
//                break;
//            case "shikha":
//                System.out.println("good girl");
//                break;
//            default:
//                System.out.println("not matched");
//        }

/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println(age);
        System.out.println(name);

*/

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            System.out.println("Enter Your name");
            String name = sc.nextLine();

            System.out.println(name);
        }

    }

}
