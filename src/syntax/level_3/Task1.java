package syntax.level_3;

public class Task1 {
    public static void main(String[] args) {
        int i = 0;
        for(double d = 30; d <= 35; d++) {
            System.out.print(i);
            i++;
            System.out.println(" " + d % 5);
        }
    }
}
