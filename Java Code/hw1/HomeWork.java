package hw1;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int num = sc.nextInt();

        System.out.println("Enter digit : ");
        int digit = sc.nextInt();

        for(int i=0; i<digit-1; i++) {
            num /= 10;
        }

        System.out.println("Result of 3rd digit : " + (num % 10));*/

//        num = num / 10;
//        num /= 10;
//
//        System.out.println("3rd Digit : " +(num % 10));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value : ");
        int value = sc.nextInt();

        System.out.println("Enter bit to find : ");
        int bit = sc.nextInt();

        int result = (value & (1 << bit - 1)) != 0 ? 1 : 0;

        System.out.println(bit + " bit : " + result);



    }

}
