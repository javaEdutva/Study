package exception;

import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {

/*
        int num = 10;
        System.out.println("Before calculate");
        System.out.println(num / 0);

        System.out.println("After calculate");
        int[] arr = new int[num];

        arr[num] = 0;
        System.out.println(arr[num]);
*/

/*        System.out.println("Before Calculate");
        try {
            int num = 10;
            System.out.println(num / 10);
            System.out.println("After Exception");
        } catch (ArithmeticException e) {
            System.out.println("Exception Message : "+e.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception Message : "+ex.getMessage());
        } finally {
            System.out.println("Finally Operation");
        }
        System.out.println("after Calculate");*/

        String name = "Subham";
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Your Name : ");
            String inputName = sc.nextLine();

            if(inputName.equals(name)) {
                throw new SubhamCompileTimeException("Subham Not allow in this program");
            } else {
                System.out.println("Thank god your are not Subham");
            }

        } catch (SubhamCompileTimeException e) {
            System.out.println(e.getMessage());
        }


    }

}
