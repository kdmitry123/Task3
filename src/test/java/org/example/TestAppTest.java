package org.example;

import org.junit.Test;

import java.util.Objects;


public class TestAppTest {

    @Test
    public void testOne(){
        System.out.println("\nBelarus -------------------------------------------------------\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(FakerImpl.generateInfo(Objects.requireNonNull(FakerImpl.getInstance("be_BY"))));
        }
        System.out.println();

    }

    @Test
    public void testTwo(){
        System.out.println("\nRussia -------------------------------------------------------\n");
        for (int i = 0; i < 15; i++) {
            System.out.println(FakerImpl.generateInfo(Objects.requireNonNull(FakerImpl.getInstance("ru_RU"))));
        }
        System.out.println();
    }

    @Test
    public void testThree(){
        System.out.println("\nUSA -------------------------------------------------------\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(FakerImpl.generateInfo(Objects.requireNonNull(FakerImpl.getInstance("en_US"))));
        }
        System.out.println();
    }

}