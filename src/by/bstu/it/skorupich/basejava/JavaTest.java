package by.bstu.it.skorupich.basejava;

import java.util.Scanner;

public class JavaTest {
    static int sint;
    public static void main(String[] args) {
        System.out.println("Hey!");

        char symbol='r';
        String string="Compute";
        short num1=246;
        byte num2=12;
        int num3=100000;
        int num3_1=0;//or negative -1,-2 ...
        long num4=100000000;
        boolean bool=true;

        System.out.println("String + int = "+string+num3);
        System.out.println("String + char = "+string + symbol);
        System.out.println("String + double = " + string + 8.12);
        //byte num5=num2+num3; error
        int num6 = (int)(8.12+num4);
        System.out.println("int = double + long = "+num6);
        long num7 = num3_1+ 2147483647;
        System.out.println("long = int + 2147483647 = "+num7);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter data: ");
        sint=in.nextInt();
        System.out.println("static int sint = "+sint);
        bool=bool&&false;
        System.out.println("boolean = boolean && boolean = "+bool);

    }
}
