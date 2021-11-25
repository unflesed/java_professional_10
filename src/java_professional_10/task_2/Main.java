package java_professional_10.task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*10));
        }
        int i = list
                .stream()
                .map(value -> value * value)
                .reduce(0,(a1, a2) -> a1 + a2);
        System.out.println(i);
    }
}

