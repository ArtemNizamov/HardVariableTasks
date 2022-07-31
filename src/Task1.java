public class Task1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = (a * (b + (c - d * e)));
        result = -result; // Унарный оператор минус ставит противоположный знак переменной

        System.out.println("Противоположный результат равен " + result);
    }
}




