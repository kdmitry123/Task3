package org.example;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerImpl {

    public static Faker getInstance(String locale) {
        switch (locale){
            case "ru_RU" : return new Faker(new Locale("ru", "RU"));
            case "en_US" : return new Faker(new Locale("en", "US"));
            case "be_BY" : return new Faker(new Locale("by", "BY"));
            default: return null;
        }

    }

    public static String generateInfo(Faker faker){
        String info = faker.name().fullName()+ "; " + faker.address().fullAddress() + ", " + faker.phoneNumber().phoneNumber();
        return faker.numerify(info);
    }
}

