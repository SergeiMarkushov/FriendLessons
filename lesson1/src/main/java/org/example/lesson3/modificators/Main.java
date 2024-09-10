package org.example.lesson3.modificators;

import org.example.lesson3.modificators.privateModificator.SomePrivateClass;
import org.example.lesson3.modificators.protectedModificator.SomeExtendsProtectedClass;
import org.example.lesson3.modificators.publicModificator.SomePublicClass;

public class Main {
    public static void main(String[] args) {

        SomePublicClass.printPublicInfo();

        SomeExtendsProtectedClass.printProtectedClassFromChild();

        SomePrivateClass.printPrivateInfoFromPublic();
    }
}
