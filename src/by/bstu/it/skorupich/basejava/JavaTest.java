package by.bstu.it.skorupich.basejava;

import java.util.Scanner;
import java.lang.Math.*;
import java.util.Random;
public class JavaTest {
    static int sint;
    public final int PFINT=13;
    public static final int PSFINT=13;
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
        bool=true^true;
        //bool=true+true; error
        System.out.println("boolean = boolean && boolean = "+bool);
        //9223372036854775807;
        double d1=9223372036854775807D;
        long l1 = 9223372036854775807L;
        float f1 =9223372036854775807F;
        long l2=0x7fff_ffff_fffL;

        char a1='a';
        char a2='\u0061';
        char a3=(char)97;

        System.out.println("'a', 0061, 97 "+a1+" "+a2+" "+a3);
        char a4=(char)(a1+a2+a3);
        System.out.println(a4);

        System.out.println("Result of 3,45 % 2,4 = "+3.45%2.4);

        System.out.println("Result of 1,0 / 0,0 = "+1.0/0.0);

        System.out.println("Result of log(-345) = "+Math.log(-345));
        System.out.println("Result of intBitsToFloat ="+Float.intBitsToFloat(0x7F800000));
        System.out.println("Result of intBitsToFloat ="+Float.intBitsToFloat(0xFF800000));

        //0x 16 с/с, 0 8 с/с ,0b 2 с/с

        final int FINT=12;

        System.out.println("Math.PI = "+Math.round(Math.PI));
        System.out.println("Math.E = "+Math.round(Math.E));
        System.out.println("Math.min(pi,e) = "+Math.min(Math.PI,Math.E));
       // Random random=new Random(System.currentTimeMillis());

        System.out.println("Math.random(0,1) ="+Math.random());

        Boolean Bool=true;
        Character character='a';
        Double Double1=9.09;
        Float Float1=9.9F;
        Long Long1=999999999999L;
        Integer integer=9999;
        Byte Byte1 =127;

        System.out.println("Result of Boolean&Boolean = " + (Bool&true));
        System.out.println("Result of Integer>>>2 = "+(integer>>>2));
        System.out.println("Result of Integer>>>2 = "+(integer>>2));
        System.out.println("Result of Double.MAX_VALUE = "+Double.MAX_VALUE + " Result of Double.MAX_VALUE =" + Double.MIN_VALUE);
        int integer1=integer;
        byte Byte2=Byte1;

        integer1=Integer.parseInt("123");

        System.out.println("Hex Integer = "+Integer.toHexString(integer1));

        String s=Integer.toString(12);

        System.out.println("toString = "+s);

        System.out.println("bitCount = "+Integer.bitCount(999999999));


        String s34="2345";
        int i32=Integer.valueOf(s34);
        System.out.println("String 2345 to int = " + i32);
        Integer i16=new Integer(s34);
        System.out.println("String 2345 to int = "+ i16);

        byte[] array=s34.getBytes();

        System.out.println("getBytes = "+array);

        String str=new String(array);
        System.out.println("getString = "+str);

        Boolean bl=new Boolean(str);
        System.out.println("from string to bool = "+bl);

        boolean bl1=Boolean.valueOf(str);
        boolean bl2=Boolean.parseBoolean(str);

        System.out.println("from string to bool = "+bl1);
        System.out.println("from string to bool = "+bl2);

        String str1="1234";
        String str2="1234";

        if(str1==str2)
            System.out.println("Bitch!");

        if(str1.equals(str2))
            System.out.println("Bitch!");

        if(str1.compareTo(str2)==0)
        {

            System.out.println("Bitch!");
        }
        //str1=null;
        System.out.println();
        if(str1==str2)
            System.out.println("Bitch!");

        if(str1.equals(str2))
            System.out.println("Bitch!");

        if(str1.compareTo(str2)==0)
        {

            System.out.println("Bitch!");
        }

        String[] str4=str1.split(str2);

        str1.contains("1");

        char[][] c1=new char[3][];

        char[] c2[]=new char[1][2];

        char c3[][]=new char[2][3];

        char[] d=new char[0];
       // d[0]='q';

        c1[1]=new char[3];
        c1[2]=new char[4];
        c1[0]=new char[2];

        System.out.println("c1.length " + c1.length);
        System.out.println("c1[0].length "+c1[0].length);
        System.out.println("c1[1].length "+c1[1].length);
        System.out.println("c1[2].length "+c1[2].length);

        c2[0][0]='a';
        c2[0][1]='b';
        c3[0][0]='a';
        c3[0][1]='b';
        c3[0][2]='c';
        c3[1][0]='d';
        c3[1][1]='e';
        c3[1][2]='f';

        boolean c2c3= c2==c3;

        System.out.println("c2==c3 = "+c2c3);

    }
}
