package session3;

public class Foo2 {
    public static void main(String[] args) {

        byte b = 127;
        char c = 127;
        short s = 127;
        int i = 127;
        long l = 127;
        float f = 127;
        double d = 127;
        boolean isTrue = false;

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("isTrue = " + isTrue);

        long l2 = 127l;
        long l3 = 127L;
        System.out.println("l2 = " + l2);
        System.out.println("l2 = " + l3);

        float f2 = 127f;
        float f3 = 127F;
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        double d2 = 127d;
        double d3 = 127D;
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        float f4 = 1.27e02f;
        double d4 = 1.27e02;
        System.out.println("f4 = " + f4);
        System.out.println("d4 = " + d4);

        byte b4 = 0b1111111;
        System.out.println("b4 = " + b4);

        short s4 = 0177;
        System.out.println("s4 = " + s4);

        int i4 = 0x007F;
        System.out.println("i4 = " + i4);

        byte b5 = 'a';
        char c5 = 'a';
        double d5 = 'a';

        System.out.println("b5 = " + b5);
        System.out.println("c5 = " + c5);
        System.out.println("d5 = " + d5);

        byte b6 = '\u007f';
        char c6 = '\u007f';

        System.out.println("b6 = " + b6);
        System.out.println("c6 = " + c6);

        byte b7 = 0b0000_0001;
        char c7 = 0x0_07F;
        short s7 = 011_11;
        int i7 = 1_000_000;
        long d7 = 1_000_000L;
        float f7 = 1_000.000_000f;
        double l7 = 1.000_0000e10;

        System.out.println("b7 = " + b7);
        System.out.println("c7 = " + c7);
        System.out.println("s7 = " + s7);
        System.out.println("i7 = " + i7);
        System.out.println("l7 = " + l7);
        System.out.println("f7 = " + f7);
        System.out.println("d7 = " + d7);
    }
}
