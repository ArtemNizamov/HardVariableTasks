import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a = (int) rnd.nextInt(899) + 100; //  Делаем рандомное трехзначное число
        int b = (a / 10) % 10; // Делим число на 10, чтобы узнать десятки и сотни, потом делим с на 10 остатком, чтобы узнать только десятки

        System.out.println(b);
    }
}