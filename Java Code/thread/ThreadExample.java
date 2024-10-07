package thread;

import java.util.concurrent.*;

public class ThreadExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("T1 : " + Thread.currentThread().getName() + " Index value : " + i);
                }
            }
        };

        Runnable run2 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("T2 : " + Thread.currentThread().getName() + " Index value : " + i);
                }
            }
        };

        Runnable run3 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("T3 : " + Thread.currentThread().getName() + " Index value : " + i);
                }
            }
        };

        Runnable run4 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("T4 : " + Thread.currentThread().getName() + " Index value : " + i);
                }
            }
        };

        // Create Threads
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        Thread t3 = new Thread(run3);
        Thread t4 = new Thread(run4);


        // Execute Threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("Main thread Execution : " + Thread.currentThread().getName());*/


        /*// How to create thread (Runnable Example)
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("First thread Hello World");
            }
        };

        Thread thread = new Thread(runnable);

        thread.start();
        System.out.println("Main Thread Hello World");
*/


/*        // Callable Example
        Callable<Integer> callThread = new Callable<Integer>() {
            public Integer call() throws Exception {
                int sum = 0;
                for(int i=0; i<100; i++) {
                    System.out.println("Sum value : " + sum);
                    sum += i;
                }
                System.out.println("Final Result : " + sum);
                return sum;
            }
        };

        FutureTask<Integer> future = new FutureTask<>(callThread);
        future.run();

        Integer value = future.get();
        System.out.println("Thread value : " + value);

        System.out.println("Main Thread : "+ Thread.currentThread().getName());*/


        // Sum
        Callable<Integer> sumThread = new Callable<Integer>() {
            public Integer call() throws Exception {
                int sum = 0;
                for(int i=0; i<100; i++) {
                    System.out.println("Sum value : " + sum);
                    sum += i;
                }
                System.out.println("Final Result : " + sum);
                return sum;
            }
        };

        // Sub
        Callable<Integer> subThread = new Callable<Integer>() {
            public Integer call() throws Exception {
                int sum = 0;
                for(int i=0; i<100; i++) {
                    System.out.println("Sub value : " + sum);
                    sum -= i;
                }
                System.out.println("Final Result : " + sum);
                return sum;
            }
        };

        // Mul
        Callable<Integer> mulThread = new Callable<Integer>() {
            public Integer call() throws Exception {
                int sum = 1;
                for(int i=1; i<=10; i++) {
                    System.out.println("Mul value : " + sum);
                    sum *= i;
                }
                System.out.println("Final Result : " + sum);
                return sum;
            }
        };

        FutureTask<Integer> sumFuture = new FutureTask<>(sumThread);
        FutureTask<Integer> subFuture = new FutureTask<>(subThread);
        FutureTask<Integer> MulFuture = new FutureTask<>(mulThread);

        sumFuture.run();
        subFuture.run();
        MulFuture.run();

        System.out.println("Sum value : " + sumFuture.get());
        System.out.println("Sub value : " + subFuture.get());
        System.out.println("Mul value : " + MulFuture.get());


        System.out.println("Main thread : " + Thread.currentThread().getName());

    }


}
