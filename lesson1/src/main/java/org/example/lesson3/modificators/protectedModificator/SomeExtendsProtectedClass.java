package org.example.lesson3.modificators.protectedModificator;


public class SomeExtendsProtectedClass extends SomeProtectedClass {

    public static void printProtectedClassFromChild() {  // Это наследник
        SomeProtectedClass.printProtectedInfo();
    }

}
