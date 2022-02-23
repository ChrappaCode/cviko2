package sk.stuba.fei.uim.oop;

public class Operatory {
    public static void main(String[] args) {

        boolean b = false;
        int i = 345;
        int j = 10;
        String s = "abc";

        System.out.print("int i = " + i + " a int j = " + j + " = ");
        System.out.println(i + j);

        System.out.println("String s = " + s + " + boolean b = " + b + " = " + (s + b));

        System.out.println("int i = " + i + " + boolean b = " + b + " = " + i + b);

        j = i * (i + 1);

        System.out.println(j > i);



    }
}
