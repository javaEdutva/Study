package array;

public class ForEachArray {

    public static void main(String[] args) {

        // for, for each

        // sum of all the elements
        // for loop
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);

        // ForEach Loop
        int forEachSum = 0;
        for(int x : arr) {
            forEachSum += x;
        }
        System.out.println("ForEachSum: " + forEachSum);

    }

}
