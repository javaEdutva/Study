package string;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {

/*        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "Hello World";
        String str4 = "Hello World";
        String str5 = "Hello World";
        String str6 = "Hello World";

        String newString = new String("Hello World");*/


        /*System.out.println(str1 == str2 );
        System.out.println(str3 == str4 );
        System.out.println(str4 == str5 );
        System.out.println(str5 == str6 );
        System.out.println(str6 == str1 );
*/
/*

        System.out.println(str1 == newString);
        System.out.println(str2 == newString);
        System.out.println(str3 == newString);
        System.out.println(str4 == newString);
        System.out.println(str5 == newString);
        System.out.println(str6 == newString);

*/


//        System.out.println(str1.equals(newString));

/*

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name 1 : ");
        String name1 = sc.nextLine();
        System.out.println("Enter name 2 : ");
        String name2 = sc.nextLine();

        System.out.println("Both name are same : "+name1.equals(name2));

*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string to check palindrome string : ");
        String str = sc.nextLine();     // input

        // check Palindrome String
        int left=0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        while(left < right) {
            if(str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("String is palindrome : " + isPalindrome); // output
    }

}
