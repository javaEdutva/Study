package oops.functionalProgram;


public class FunctionalExample {

    static void funImpl(Fun fun) {
        fun.fun();
        System.out.println("Fun Implementation");
    }

    public static void main(String[] args) {

        // Create Object
/*
        Fun fun1 = () -> System.out.println("Fun1 Hello World");
        Fun fun2 = () -> System.out.println("Fun2 Hello World");

        funImpl(fun1);
        funImpl(fun2);
*/

//        Engine engine1 = (obj) -> System.out.println("Start Engine Brand name : "+ obj);

//        engine1.startEngine("BMW");

//        Engine eng = ((obj) -> {
//
//            if(obj.isBlank()) {
//                System.out.println("Engine not working");
//            } else {
//                System.out.println("Engine working");
//            }
//
//            return 1;
//        });
//
//        System.out.println(eng.startEngine(""));

//        Engine eng = (obj) -> obj.isBlank() ? 0 : 1;
//
//        System.out.println(eng.startEngine("BMW") == 0 ? "Engine Not Working" : "Engine Working");




    }

}

class A {
    int fun() {
        return 1;
    }
}

class B extends A {
    int fun() {
        return 2;
    }
}


@FunctionalInterface
interface Engine {
     int startEngine(String brandName);

    default String engineName(String brandName) {
        return brandName;
    }

    default int fun() {
        return 1;
    }

}

interface Fun {
    void fun();
    String engineName(String brandName);
}


