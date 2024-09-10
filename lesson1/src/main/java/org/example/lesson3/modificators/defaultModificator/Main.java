package org.example.lesson3.modificators.defaultModificator;

import org.example.lesson3.modificators.publicModificator.SomePublicClass;

public class Main {
    public static void main(String[] args) {
        // main внутри пакета с дефолтным методом
        SomeDefaultClass.printProtectedInfo();

        SomePublicClass.printPublicInfo();
    }
}
