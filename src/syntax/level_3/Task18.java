package syntax.level_3;
/*План по захвату мира
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!
Последовательность вводимых данных имеет большое значение.

Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число.
5. Выведенный текст должен полностью соответствовать заданию.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task18 {
    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in)); // класс BufferedReader - считывает только строки
                                                     // класс InputStreamReader - считывает символы
                                                                       // System.in - является экземпляром класса InputStreamReader у
                                                                       // которого есть метод read() - который считывает по битам
        String aGe = scan.readLine(); //считивает строку из цифр
        String name = scan.readLine();
        int age = Integer.parseInt(aGe); // переводит(конвертирует) строку цифр в сами цифры

        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}
