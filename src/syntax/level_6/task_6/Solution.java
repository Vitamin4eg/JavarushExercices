package syntax.level_6.task_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Чётные и нечётные циферки
//        Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
//        Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
//        Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
//        Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
//        Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.
//
//        Пример для числа 4445:
//        Even: 3 Odd: 1
//
//
//        Требования:
//        1. Программа должна считывать данные с клавиатуры.
//        2. Метод main должен посчитать сколько четных цифр во веденном числе и записать это количество в переменную even.
//        3. Метод main должен посчитать сколько нечетных цифр во веденном числе и записать это количество в переменную odd.
//        4. Программа должна выводить текст на экран.
//        5. Выведенный текст должен соответствовать заданию.
public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String scanKeyboard = buffer.readLine();
        for (int i = 0; i < scanKeyboard.length(); i++){ // так же ее можно решить остатком /10 и с помощью массива
            char ch = scanKeyboard.charAt(i);
            if((int)ch % 2 == 0){
                even++;
            }
            else odd++;
        }
        System.out.println("Even: " + even + " " + "Odd: " + odd);
    }
}
