package org.example.lesson3.modificators.privateModificator;

public class SomePrivateClass {

    private static void printPrivateInfo() {
        System.out.println("print private method");
    }

    public static void printPrivateInfoFromPublic() { // может быть вызван только внутри текущего класса
        printPrivateInfo();
    }
}
