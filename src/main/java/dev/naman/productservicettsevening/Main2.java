package dev.naman.productservicettsevening;

import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> l1 = List.of(1, 2, 3, 4);
        List<String> l2 = List.of(
                "Hello",
                "Hi",
                "Hey"
        );
        int a[] = {1, 2, 3, 4, 5};

        System.out.println(a.getClass().getName());

        System.out.println(l1.getClass().getName());
        System.out.println(l2.getClass().getName());
    }
}
