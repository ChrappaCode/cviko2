package sk.stuba.fei.uim.oop;

public class Pretypovanie {

    public static void main(String[] args) {

        int vstup = Integer.parseInt(args[0]);
        int n = 5;
        double x = 1.7;

        n = (int)x ; //oreze za ciarkou

        System.out.println("int vstup = " + vstup);
        System.out.println("int n = " + n);
        x++;
        System.out.println("double x = " + x);

        int n2 = 0;
        boolean b2 = (n != 0) && (5 / n >= 1) ;
        System.out.println(b2);

    }
}


