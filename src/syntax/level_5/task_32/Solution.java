package syntax.level_5.task_32;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
//        Написать программу, которая:
//        1. считывает с консоли число N, которое должно быть больше 0
//        2. потом считывает N чисел с консоли
//        3. выводит на экран максимальное из введенных N чисел.
//
//
//        Требования:
//        1. Программа должна считывать числа с клавиатуры.
//        2. Программа должна выводить число на экран.
//        3. В классе должен быть метод public static void main.
//        4. Нельзя добавлять новые методы в класс Solution.
//        5. Программа должна выводить на экран максимальное из введенных N чисел.
//        6. Программа не должна ничего выводить на экран, если N меньше либо равно 0.
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberInput = Integer.parseInt(reader.readLine());
        int max = 0;
        if (numberInput > 0) {
            for (int i = 0; i < numberInput; i++) {
                int p = Integer.parseInt(reader.readLine());
                if (max < p) {
                    max = p;
                }
            }
            System.out.println(max);
        }
    }
}

// моё первое но тоже верное решение (через жопу):
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int numberInput = Integer.parseInt(reader.readLine());
//        int []array; //= new int [numberInput];
//        if(numberInput > 0) {
//            array = new int [numberInput];
//            for (int i = 0; i < array.length; i++) {
//                array[i] = Integer.parseInt(reader.readLine());
//            }
//            for (int i = 1; i < array.length; i++) {
//                if (array[0] < array[i]) {
//                    array[0] = array[i];
//                }
//            }
//            int maximum = array[0];
//
//            System.out.println(maximum);
//        }
//    }
//}