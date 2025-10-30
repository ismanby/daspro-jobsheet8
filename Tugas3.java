import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jmlCabang, jmlPelanggan, jmlItem, totalPelanggan = 0, itemTerjual = 0, totalItem = 0;

        System.out.print("Masukkan jumlah cabang kafe: ");
        jmlCabang = sc.nextInt();

        for (int i = 1; i <= jmlCabang; i++) {
            System.out.println("\n---- Cabang " + i + " ----");
            System.out.print("Jumlah Pelanggan: ");
            jmlPelanggan = sc.nextInt();
            totalPelanggan += jmlPelanggan;

            itemTerjual = 0;
            for (int j = 1; j <= jmlPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                jmlItem = sc.nextInt();
                itemTerjual += jmlItem;
            }

            totalItem += itemTerjual;

            System.out.println("Cabang " + i + " :");
            System.out.println("- Pelanggan: " + jmlPelanggan + " orang");
            System.out.println("- Item terjual: " + itemTerjual);
        }

        System.out.println("\n==========================================");
        System.out.println("Total seluruh cabang: ");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " item");

        sc.close();
    }
}