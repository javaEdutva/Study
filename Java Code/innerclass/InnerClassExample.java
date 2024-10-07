package innerclass;

public class InnerClassExample {

    public static void main(String[] args) {

        A obj = new A();
        A.B obj2 = obj.new B();
        obj2.value = 10;

        X.Y newObj = new X.Y();

        newObj.value = 10;

        M.doSomething();


    }

}

class A {

    class B {
        int value;
    }

}

class X {
    static class Y {
        int value;
    }
}

class M {

    public static void doSomething() {
        class N {
            int value;
        }

        N n = new N();
        n.value = 1;

        System.out.println(n.value);
    }

}

