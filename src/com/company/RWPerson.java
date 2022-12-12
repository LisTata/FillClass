package com.company;

import javax.imageio.IIOException;
import java.io.*;

public class RWPerson {
    public static void main(String[] args) throws IOException, CloneNotSupportedException, ClassNotFoundException {
write();
read();

    }
    public static void write() throws IOException {
        FileOutputStream file = new FileOutputStream("src/com/company/person.bin");
        ObjectOutputStream out = new ObjectOutputStream(file);
        Person person=new Person(1,"Ivan");



        out.writeObject(person);

        out.close();
        file.close();
    }
    public static void read() throws IOException, CloneNotSupportedException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("src/com/company/person.bin");
        ObjectInputStream in = new ObjectInputStream(file);
        Person person=(Person) in.readObject();
        System.out.println();
    }
}
