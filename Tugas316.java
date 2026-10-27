import java.util.Scanner;

public class Tugas316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal harus 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int tokoTerbanyak = 1;
            int maxBarangToko = -1;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("\n--- Toko " + i + " ---");
                
                int jumlahPelanggan;
                do {
                    System.out.print("Masukkan jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("Jumlah pelanggan tidak boleh negatif. Ulangi!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    int jumlahBarang;
                    do {
                        System.out.print("Masukkan jumlah barang pelanggan " + j + ": ");
                        jumlahBarang = sc.nextInt();
                        if (jumlahBarang < 0) {
                            System.out.println("Jumlah barang tidak boleh negatif. Ulangi!");
                        }
                    } while (jumlahBarang < 0);

                    totalBarangToko += jumlahBarang;
                }

                System.out.println("Toko " + i + " -> pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

                totalBarangSeluruhToko += totalBarangToko;

                if (totalBarangToko > maxBarangToko) {
                    maxBarangToko = totalBarangToko;
                    tokoTerbanyak = i;
                }
            }

            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("toko dengan barang terbanyak: " + tokoTerbanyak);
        }

        sc.close();
    }
}