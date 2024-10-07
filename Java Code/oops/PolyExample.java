package oops;

public class PolyExample {

    public static void fun(int a) {
        System.out.println("Fun Input A : "+ a);
    }

    public static void fun(int a, int b) {
        System.out.println("Fun Input A AND B : "+ a + " " + b);
    }

    // Example
    // a + b, a + b + c, a + b + c + d

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static int sum(int... arraySum) {
        int sum = 0;
        for(int x : arraySum) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {

        Bird1 obj = new Bird1();
        obj.fly();



//        int result = sum(10, 20, 80, 90, 90, 90);
//
//        System.out.println(result);

    }

}


class Bird1 {
    void fly() {
        System.out.println("Bird is Flying from bird 1"); // hidden
    }
}

class Bird2 extends Bird1 {
    void fly() {
        System.out.println("Bird is Flying from bird 2");
    }
}






