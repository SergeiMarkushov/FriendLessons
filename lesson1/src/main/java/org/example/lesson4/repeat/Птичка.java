package org.example.lesson4.repeat;

public class Птичка {
    public String имя;
    public int весПтички;

//    @Override
//    public String toString() {
//        return "У нашей птички имя: " + имя + " вес: " + весПтички;
//    }


    @Override
    public String toString() {
        return "Птичка{" +
                "имя='" + имя + '\'' +
                ", весПтички=" + весПтички +
                '}';
    }
}
