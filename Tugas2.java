import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n;

        while (true) {
            // input nilai n
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
            
            // nilai n harus >= 3
            if (n >= 3) {
                break;
            } else {
                System.out.println("Nilai n harus >= 3");
            }
        }

        // jarak baris
        System.out.println();
        
         for (int i = 1; i <= n; i++) { // mencetak baris
            for (int j = 1; j <= n; j++) { // mencetak kolom
                // cetak angka di tepi
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  "); // dua spasi agar sejajar
                }
            }
            // perintah ganti baris
            System.out.println();
        }
        sc.close();
    }
}
