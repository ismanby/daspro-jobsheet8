import java.util.Scanner;

public class NilaiKelompok12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int i, j, nilai, kelompokTertinggi = 0;
        float totalNilai, rataNilai, rataTertinggi = 0;

        i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " : nilai rata-rata = " + rataNilai);

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Kelompok dengan nilai rata-rata tertinggi :");
        System.out.println("Kelompok " + kelompokTertinggi + " dengan nilai rata rata " + rataTertinggi);

        sc.close();
    }
}
