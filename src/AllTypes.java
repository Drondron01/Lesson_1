/*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
2. Создать переменные всех пройденных типов данных, и инициализировать их значения;*/

import java.math.BigInteger;

public class AllTypes {
    public static void main(String[] args){

        int b = 214748347;
        short c = 32767;
        long d = 99999;
        double e = 32.445444;
        float ff = 3.6699f;
        boolean g  = true;
        boolean g1 = false;
        int ss = b * c;
        String st = "Hellow";
        char   ch = 'A';
        System.out.println(st + " "  +  ss + "\n"  + e + "\t\t" + "\b " + ch + "  " + ff);
        System.out.println(ch);
        System.out.println(g&&g1);
        System.out.println(d%c);




    }
}
