package oops;

public class FinalExample {

    public static void main(String[] args) {

        Child child = new Child("abc@gmail.com","abc");
        System.out.println(child.email);

    }

}

class User {

    public final String email;
    public final String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

}

class Child extends User {

    public Child(String email, String password) {
        super(email, password);
    }

}

final class A {
    private final String email;
    private final String password;

    public A(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}








