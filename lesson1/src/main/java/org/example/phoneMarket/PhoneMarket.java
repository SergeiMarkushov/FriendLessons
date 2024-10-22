package org.example.phoneMarket;

public class PhoneMarket {
    public static void main(String[] args) {
        Phone iphone = Factory.makeIPhone("IPhone 11", "Red", 256);
        Phone oppo = Factory.makeOppo("Oppo N3", "White", 512);
        Phone xiaomi = Factory.makeOppo("Xiaomi 12C", "Black", 256);

        iphone.showPhoneInfo();
        oppo.showPhoneInfo();
        xiaomi.showPhoneInfo();
    }
}
