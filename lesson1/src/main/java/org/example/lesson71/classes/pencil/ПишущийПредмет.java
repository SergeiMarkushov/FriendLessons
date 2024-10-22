package org.example.lesson71.classes.pencil;

public class ПишущийПредмет {
    public String типПишущегоПредмета;
    public String цветКорпуса;
    public String цветЧернил;

    public void свойстваПишущегоПредмета() {
        System.out.println("Тип предмета: " + типПишущегоПредмета);
        System.out.println("Цвет корпуса: " + цветКорпуса);
        System.out.println("Цвет чернил: " + цветЧернил);
    }
}
