package ru.sapteh;

import javax.imageio.IIOException;
import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:/Java_42_t/1/Person");
        File file = new File("C:/Java_42_t/1/Person/Per.txt");
        dir.mkdir();
        file.createNewFile();

        FileWriter fos = new FileWriter(file);

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String name = buffer.readLine();
        System.out.println("Введите возраст: ");
        int age = Integer.parseInt(buffer.readLine());
        System.out.println("Введите дату: ");
        int date = Integer.parseInt(buffer.readLine());

        Person person = new Person(name, age, date);
        System.out.println(personIsEmpty(person));

        fos.write(personIsEmpty(person));
        fos.close();

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
