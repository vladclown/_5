import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Вычисление произведения");
            System.out.println("Введите первое число");
            int a = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число");
            int b = new Scanner(System.in).nextInt();
            int i = a * b;
            System.out.println(a + " * " + b +" = " + i);
            System.out.println(System.lineSeparator());
        }


    }
}