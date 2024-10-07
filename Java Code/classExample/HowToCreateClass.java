package classExample;

public class HowToCreateClass {

    static void print(int value) {
        if(value == 0) return;
        print(value - 1);
        System.out.println(value);
    }


    public static void main(String[] args) {    // JVM -> HowToCreateClass.main()

        print(10);






/*        Example ex1 = new Example();
        ex1.name = "ABC";
        ex1.address = "india";
        ex1.print("Pankaj");

//        Example ex2 = new Example();
//        ex2.print();*/

        // Object
/*
        Bird bird = new Bird();
        bird.fly();
        Bird.fly();
*/

/*        StaticExample st1 = new StaticExample();
        st1.number=100;
        st1.result=200;
        st1.value = 30;
        st1.print();


        StaticExample st2 = new StaticExample();
        st2.number=900;
        st2.result=1200;
        st2.print();

        StaticExample st3 = new StaticExample();
        st3.number=9100;
        st3.result=4200;
        st3.print();

        StaticExample st4 = new StaticExample();
        st4.number=6100;
        st4.result=7200;
        st4.print();

*/






    }

}



class Example {
    String name;
    String address;

    public void print(String name) {
        System.out.println("Class name : " + this.name);
        System.out.println("method name : " + name);
        System.out.println("address : " + this.address);
    }

}


class Bird {
    static void fly() {
        System.out.println("Bird fly");
    }
}


class StaticExample {

    static int value = 10;
    int number;
    int result;

    static void print() {
        System.out.println("value : " + value);
    }

}



