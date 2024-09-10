package org.example.lesson3.modificators.protectedModificator;

import org.example.lesson3.modificators.publicModificator.SomePublicClass;

public class Main {
    public static void main(String[] args) {

        SomeProtectedClass.printProtectedInfo();

        SomeExtendsProtectedClass.printProtectedClassFromChild();

        SomePublicClass.printPublicInfo();
    }
}
