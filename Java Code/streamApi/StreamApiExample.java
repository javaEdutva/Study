package streamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamApiExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
//        for(int i=0; i<list.size(); i++){
//            list.set(i, list.get(i)+2);
//        }

        System.out.println(list);
        // increment by 2
        list = list
                .stream()
                .map(type -> type + 2)
                .toList();

        System.out.println(list);

        System.out.println("-----------------");

        // Even Numbers
        list = list.stream()
                .filter(type -> type % 2 == 0)
                .toList();

        System.out.println(list);

    }

}
