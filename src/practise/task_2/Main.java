package practise.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }

        list = list.stream()
                .sorted((a,b) -> b - a)
                .skip(5)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
