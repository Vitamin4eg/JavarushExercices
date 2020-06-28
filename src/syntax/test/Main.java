package syntax.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static class Cat{
        String name;
        int age;
        public Cat(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public Cat cat = new Cat("tom", 4);
    public static void main(String[] args) {
        Main cat2 = new Main();
        System.out.println(cat2.cat.name);
        Cat cat3 = new Cat("f",5);
        Date now = new Date();
        System.out.println(now);
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH ) + " " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.YEAR));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        Calendar calendar1 = new GregorianCalendar();

    }
}
