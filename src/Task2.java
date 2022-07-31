public class Task2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        a ^= b; // Знак ^= меняет местами значения переменных
        b ^= a;
        a ^= b;

        System.out.println(" Переменная a = " + a + " Переменная b = " + b);
    }
}

