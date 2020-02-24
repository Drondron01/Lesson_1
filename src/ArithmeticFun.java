// 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
// где a, b, c, d – входные параметры этого метода;
/*4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
 в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
5. Написать метод, которому в качестве параметра передается целое число, метод должен
напечатать в консоль положительное ли число передали, или отрицательное; Замечание:
ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число, метод должен
вернуть true, если число отрицательное;
8. * Написать метод, который определяет является ли год високосным, и выводит сообщение
в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
   */

public class ArithmeticFun {

    static int ArFun(int a, int b, int d, int c){       // Задание 3
       int s = a * (b + (c / d));

        return s;
    }

    static boolean Conditions(int aa, int bb){          // Задание 4
        boolean res = true;
       //int sum = a+ b
        if ((aa+bb)<= 20 && (aa+bb)>= 10){
            res = true;
        } else{
            res = false;
        }             //s = ((aa+bb)<= 20 && (a+b)>= 10) ? true : false;
        return res;
    }

    static void NumSign(int n) {                        // Задание 5
        if (n>=0){
            System.out.println("Положительное число");
        } else{
            System.out.println("Отрицательное число");
        }
    }

    static boolean NumSign1(int n) {                        // Задание 6
        boolean rs;
        if (n<=0){
            rs = true;
        } else{
            rs = false; //Если не определять параметр при положительных значениях, то возникает ошибка, т.е. NaN не проходит
        }
        return rs;
    }

    static void HiName(String St) {                        // Задание 7
        System.out.println("Привет, " + St + "!" );
    }

    static void LeapYare(int y) {                        // Задание 8
        boolean ly = (y%4!=0) || ((y%100==0) && (y%400!=0));
        if (ly) {
            System.out.println("Обычный год");
        } else {
            System.out.println("Високосный год");
        }

   /*     If (ly == true) {
            System.out.println("Обычный год");

        else {
            System.out.println("Високосный год");
        }*/
    }


    public static void main(String[] args) {
        int s = ArFun(3,4,5,6);     // Задание 3
        System.out.println(s);
        System.out.println(Conditions(7,8));;   // Задание 4
        System.out.println(Conditions(17,8));   // Задание 4
        System.out.println(Conditions(2,2));    // Задание 4
        NumSign(-3);                        // Задание 5
        NumSign(10);                        // Задание 5
        System.out.println(NumSign1(10));   // Задание 6
        HiName("Вася");                     // Задание 7
        LeapYare(2000);                     // Задание 8
        LeapYare(200);                      // Задание 8
        LeapYare(2019);                     // Задание 8
    }

}
