package Chapter1;

import java.math.BigInteger;
import java.util.*;

import static java.lang.Integer.toHexString;
import static java.lang.Math.floorMod;

public class Tasks {

    public static void main(String[] args) {
        //Упражнение 1
        /*System.out.print("Пожалуйста, введите целое число:");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        System.out.println();
        System.out.println("Перевод в 2: "+Integer.toBinaryString(num));
        System.out.println("Перевод в 8: "+Integer.toOctalString(num));
        System.out.println("Перевод в 16: "+toHexString(num));*/

        //Упражнение 2
        /*System.out.print("Пожалуйста, введите угол:");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int i=num%360;
        if(i<0) i+=360;
        System.out.println("Угол через % :"+i+
        " или через floorMod():"+floorMod(num, 360));*/

        //Упражнение 3
        /*int [] nums = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.print("Первое число:");
        nums[0]=in.nextInt();
        System.out.print("Второе число:");
        nums[1]=in.nextInt();
        System.out.print("Третье число:");
        nums[2]=in.nextInt();

        if(nums[0]>nums[1]&&nums[0]>nums[2]) System.out.println(nums[0]);
        else if (nums[1]>nums[0]&&nums[2]>nums[1]) System.out.println(nums[2]);
        else System.out.println(nums[1]);

        System.out.println(Math.max(Math.max(nums[0],nums[1]),nums[2]));*/

        //Упражнение 4
        /*
        Double dMax = Double.MAX_VALUE;
        Double dMin = Double.valueOf(Math.nextUp(0));
        System.out.println(минимальное положительное значение double:dMin+" максимальное значение double: "+dMax);*/

        //Упражение 5
        /* double d = 2147483649.1;
        System.out.println((int)d);*/

        //Упражение 6
        /*BigInteger bi= BigInteger.valueOf(1);
        for (int i = 1; i <=1000; i ++){
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bi);*/

        //Упражение 7
        /*System.out.println("Введите 2 числа от 0 до 65535");
        Scanner in = new Scanner(System.in);
        System.out.println("Первое: ");
        short s1= (short) (in.nextLong()-33000);
        System.out.println("Второе: ");
        short s2=(short) (in.nextLong()-33000);
        System.out.println("Сумма: "+(s1+s2+66000));
        System.out.println("Разность: "+(s1-s2));
        System.out.println("Произведение: "+((s1+33000)*(s2+33000)));
        System.out.println("Частное: "+((s1+33000)/(s2+33000)));
        System.out.println("Остаток: "+((s1+33000)%(s2+33000)));*/

        //Упражение 8
        /*System.out.println("Введите строку:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String delimeter = " ";
        String[] subStr = str.split(delimeter);*/

        //Упражение 9
        /*String str = "привет как дела";
        String delimeter = " ";
        String[] subStr = str.split(delimeter);
        System.out.println("как".equals(subStr[1]));*/

        //Упражнение 10
        /*Random rnd = new Random();
        long i = rnd.nextLong();
        System.out.println(Long.toString( i, 36));*/

        //Упражнение 11

    }

}
