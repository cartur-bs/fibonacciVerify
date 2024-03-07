package services;
public class FibonacciService {
    public static boolean membroDeFibonacci(int numero) {
        int a = 0;
        int b = 1;
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == numero;
    }
}
