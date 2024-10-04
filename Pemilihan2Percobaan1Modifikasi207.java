import java.util.Scanner;

public class Pemilihan2Percobaan1Modifikasi207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tahun;

        System.out.println("Masukkan Tahun: ");
        tahun = sc.nextInt();

        if (tahun % 400 == 0) {
            System.out.println("Tahun Kabisat"); // Jika habis dibagi 400, kabisat
        } else {
            if (tahun % 100 == 0) {
                System.out.println("Bukan Tahun Kabisat"); // Jika habis dibagi 100 tapi tidak habis dibagi 400, bukan kabisat
            } else {
                if (tahun % 4 == 0) {
                    System.out.println("Tahun Kabisat"); // Jika habis dibagi 4 dan tidak habis dibagi 100, kabisat
                } else {
                    System.out.println("Bukan Tahun Kabisat"); // Tidak habis dibagi 4, bukan kabisat
                }
            }
        }
    }
    
}