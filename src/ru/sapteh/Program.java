package ru.sapteh;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String name = buffer.readLine();
        System.out.println("Введите возраст: ");
        int age = Integer.parseInt(buffer.readLine());
        System.out.println("Введите дату: ");
        int date = Integer.parseInt(buffer.readLine());
        Person person = new Person(name, age, date);
        System.out.println(personIsEmpty(person));

    }

    public static String personIsEmpty(Person p) {
        String err = "";
        if (p.getName().isEmpty())err += "Имя не заполнено\n";
        if (p.getAge() == 0) err+="Возраст не заполнен\n";
        if (p.getDate() == 0) err+="Дата не указана";
        if (!err.isEmpty()) return err;
            return "Объект " + p.getClass() + " инициализирован\n"+p.toString();
    }
}
