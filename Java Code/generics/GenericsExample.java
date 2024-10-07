package generics;

public class GenericsExample {

    public static void main(String[] args) {
        Print<Integer> p = new Print<>();

        p.print(70);

        Print<Character> charP = new Print<>();
        charP.print('A');

        Print<Example> examplePrint = new Print<>();

        Example example = new Example();
        example.name = "ABCD";

        examplePrint.print(example);

    }

}

class Example {
    String name;

    @Override
    public String toString() {
        return "example{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Print<T> {
    void print(T t) {
        System.out.println("Print Class Print Value : " + t);
    }
}


