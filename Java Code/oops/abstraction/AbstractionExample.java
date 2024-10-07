package oops.abstraction;

import java.util.Scanner;

public class AbstractionExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your implementation type : ");
        String str = sc.nextLine();
        User user = null;

        switch(str) {
            case "Employee":
                user = new Employee("Subham", "abc@gmail.com","abc", 90000.800);
                break;
            case "Intern":
                user = new Intern("anu", "anu@gmail.com","abc", 17990000.800);
                Intern internObj = (Intern) user;
                internObj.swim();
                internObj.userCanWalk();
                break;
            default:
                throw new RuntimeException("We dont have implementation for " + str);
        }

        user.printNameWithSalary();

    }

}

interface WalkUser {
    void userCanWalk();
}

interface Swimming {
    void swim();
}


abstract class User {
    private String name;
    private String email;
    private String password;
    private Double salary;

    public User(String name, String email, String password, Double salary) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary < 1000) {
            throw new RuntimeException("Salary can't be lesser then 1000");
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void printNameWithSalary();

}

class Intern extends User implements WalkUser, Swimming {
    public Intern(String name, String email, String password, Double salary) {
        super(name, email, password, salary);
    }

    @Override
    public void printNameWithSalary() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }

    @Override
    public void userCanWalk() {
        System.out.println("User name : " + getName() + " is walking");
    }

    @Override
    public void swim() {
        System.out.println("User name : " + getName() + " is swimming");
    }
}

class Employee extends User {

    public Employee(String name, String email, String password, Double salary) {
        super(name, email, password, salary);
    }

    @Override
    public void printNameWithSalary() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }
}


