package org.example;

import java.util.Objects;

public class TestApp {
    public static void main(String[] args) {
        String code = args[0];
        int counter = Integer.parseInt(args[1]);
        double error = Double.parseDouble(args[2]);

        for (int i = 0; i < counter; i++) {
            System.out.println(FakerImpl.generateInfo(Objects.requireNonNull(FakerImpl.getInstance(code))));
        }

    }
}
