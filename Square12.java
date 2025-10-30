import java.util.Scanner;

public class Square12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // input nilai N
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        // outer loop untuk mencetak baris
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            // inner loop untuk mencetak kolom
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            // untuk mengganti baris
            System.out.println();
        }
        sc.close();
    }   
}