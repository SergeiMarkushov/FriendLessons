package org.example.lesson3.modificators.privateModificator;

import org.example.lesson3.modificators.publicModificator.SomePublicClass;

import javax.imageio.stream.ImageInputStream;

public class Main {
    public static void main(String[] args) {
        SomePublicClass.printPublicInfo();

        SomePrivateClass.printPrivateInfoFromPublic();

    }
}
