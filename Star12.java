import java.util.Scanner;

public class Star12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // input nilai N
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        // looping * sebanyak N
        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }

        sc.close();
    }
}