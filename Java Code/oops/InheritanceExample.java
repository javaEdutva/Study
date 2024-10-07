package oops;

public class InheritanceExample {

    public static void main(String[] args) {

/*        ChildC child = new ChildC();    // LHS Parent = RHS Child Constructor
        System.out.println(child.result());
        System.out.println(child.mulResul());*/

        MyClass obj = new SubClass();

        obj.print();

    }

//    static void print() {
//        System.out.println("Hello World");
//    }
//
//    void hello() {
//        print();
//    }
//
//    void hello2() {
//        hello();
//    }

}



class MyClass {
    void print() {
        System.out.println("MyClass");
    }
}

class SubClass extends MyClass {
    void print() {
        System.out.println("SubClass");
    }
}


/*
class A {
    public A(int x) {
        System.out.println("Param Class A");
    }

    public A() {
        System.out.println("Default Class A");
    }
}

class B extends A {
    public B() {
//        super(100);
        System.out.println("Class B");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C");
    }
}
*/

/*

class ParentA {

    int value=10;
    int sum=90;
    int max=1000;



}


class ChildB extends ParentA {

    public ChildB() {}

    public int result() {
        return value + sum + max;
    }

    public int mulResul() {
        return value * max * sum;
    }

}

class ChildC extends ChildB {

    public ChildC() {
        super();
    }

}
*/

