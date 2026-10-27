import java.util.Scanner;
public class NilaiKelompok16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok/mahasiswa: ");
        int jumlahKelompok = sc.nextInt();
        
        System.out.print("Masukkan jumlah komponen tugas proyek: ");
        int jumlahKomponen = sc.nextInt();

        System.out.println("\n--- INPUT NILAI PROYEK ---");
        for (int i = 1; i <= jumlahKelompok; i++) {
            double totalNilai = 0;
            System.out.println("\nKelompok ke-" + i);
            
            for (int j = 1; j <= jumlahKomponen; j++) {
                System.out.print("  Masukkan nilai komponen ke-" + j + ": ");
                double nilai = sc.nextDouble();
                totalNilai += nilai;
            }
            
            double rataRata = totalNilai / jumlahKomponen;
            System.out.println("  -> Rata-rata nilai Kelompok " + i + " = " + rataRata);
        }

        sc.close();
    }
}