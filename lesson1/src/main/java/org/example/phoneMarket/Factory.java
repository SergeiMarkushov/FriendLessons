package org.example.phoneMarket;

public class Factory {

    public static Phone makeIPhone(String model, String color, int memory) {
        Phone iphone = new Phone();
        iphone.setBrand("IPhone");
        iphone.setModel(model);
        iphone.setColor(color);
        iphone.setMemory(memory);

        if (model.equals("IPhone 11")) {
            iphone.setDisplay(6.06);
            iphone.setSimCount(1);
        } else {
            iphone.setDisplay(6.1);
            iphone.setSimCount(2);
        }
        return iphone;
    }

    public static Phone makeOppo(String model, String color, int memory) {
        Phone iphone = new Phone();
        iphone.setBrand("Oppo");
        iphone.setModel(model);
        iphone.setColor(color);
        iphone.setMemory(memory);

        if (model.equals("Oppo N3")) {
            iphone.setDisplay(6.31);
            iphone.setSimCount(1);
        } else {
            iphone.setDisplay(6.56);
            iphone.setSimCount(2);
        }
        return iphone;
    }

    public static Phone makeXiaomi(String model, String color, int memory) {
        Phone iphone = new Phone();
        iphone.setBrand("Xiaomi");
        iphone.setModel(model);
        iphone.setColor(color);
        iphone.setMemory(memory);

        if (model.equals("Xiaomi 12C")) {
            iphone.setDisplay(6.56);
            iphone.setSimCount(2);
        } else {
            iphone.setDisplay(6.53);
            iphone.setSimCount(1);
        }
        return iphone;
    }
}
