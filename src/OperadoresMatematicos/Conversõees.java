package OperadoresMatematicos;

public class Conversõees {
    public static void main(String[] args) {

        //Conversões podem ser feitas para qualquer tipo de dado
        //Downcast sempre precisam ser explícitos

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // douwncast

        long l1;
        int i1 = 10;
        l1 = i1; // upcast

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2; //douwncast

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; //downcast sem modificação

        double d1;
        float f1 = 10.5f;
        d1 = (double) f1; // downcast com poucas casas descimais sem perda

        float f2;
        float f3;
        double d2 = 10000000000000.58d;
        f2 = (float) d2;
        double d3 = 100000000.00000000000000000;
        f3 = (float) d3; // downcast

        int i4;
        float f4 = 11.56956f;
        i4 = (int) f4; // downcast tirando as casas após a virgula

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3;

        System.out.println("b1 para double: " + b1);


    }
}
