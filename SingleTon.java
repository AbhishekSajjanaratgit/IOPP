package Abhishek;

import java.io.File;
import java.io.FileWriter;

public class SingleTon {
    public static void main(String[] args) throws Exception {

    Singleton x = Singleton.getSingle();
    x.i.append("\nAbhishek How are you?");

    Singleton y=Singleton.getSingle();
    y.i.append("\nI am good How are you");

    Singleton z = Singleton.getSingle();
    z.i.append("\nElon Musk is going to buy Coca-Cola in near future");

        System.out.println("X :"+ x.hashCode());
        System.out.println("Y :"+ y.hashCode());
        System.out.println("Z :"+ z.hashCode());


    }

}

class Singleton {
    private static Singleton single = null;
     public Inner i = new Inner();
    private Singleton() {
    }

    public static Singleton getSingle() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }

    class Inner {

        void append(String s) throws Exception{
             File file = new File("E:\\JavaProgrammes\\SingleTon\\src\\Abhishek","Singleton.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(s);
            fileWriter.close();

        }

    }
}

