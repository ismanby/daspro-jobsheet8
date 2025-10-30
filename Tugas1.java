import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // deklarasi & inisialisasi variabel
        int n = 0, kuadrat, jumlah;

        // input nilai n
        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // input nilai n
            System.out.print("n = " + i + " -> jumlah kuadrat = ");

            // reset variabel jumlah
            jumlah = 0;
            for (int j = 1; j <= i; j++) {
                // rumus kuadrat bilangan
                kuadrat = j * j;
                // penjumlahan angka yang disimpan di variabel jumlah
                jumlah += kuadrat;

                System.out.print(kuadrat);
                if (j < i) {
                    // jika bilangan di atas 1, maka dijumlahkan bilangan yang telah dikuadratkan
                    System.out.print(" + ");
                }
            }
            // total penjumlahan kuadrat
            System.out.println(" = " + jumlah);
        }

        sc.close();
    }
}