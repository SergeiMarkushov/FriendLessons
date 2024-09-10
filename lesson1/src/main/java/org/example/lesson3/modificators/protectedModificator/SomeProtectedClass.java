package org.example.lesson3.modificators.protectedModificator;

public class SomeProtectedClass {

    protected static void printProtectedInfo() { // вызывается любым классом в том же пакете и наследниками
        System.out.println("protected method from protectedModificator");
    }
}
