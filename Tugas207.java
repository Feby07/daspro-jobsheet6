import java.util.Scanner;;

public class Tugas207 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double hargaTotal, totalBayar;
        double diskon = 0.0;

        System.out.println("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = input07.nextLine().toLowerCase();
        System.out.println("Masukkan jumlah buku yang dibeli : ");
        jumlahBuku = input07.nextInt();

        if (jenisBuku.equals("Kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equals("Novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else {
                diskon += 0.01;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        }

        System.out.println("Diskon yang diperoleh: " + (diskon * 199) + "%" );
        System.out.println("Masukkan total harga buku: ");
        hargaTotal = input07.nextDouble();

        totalBayar = hargaTotal - (hargaTotal * diskon);

        System.out.println("Total yang harus dibayarkan: Rp" + totalBayar);

    }
}