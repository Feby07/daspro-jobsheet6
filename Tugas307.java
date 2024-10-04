import java.util.Scanner;

public class Tugas307 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        String merk, kategori;
        int ukuran;
        int harga = 0; 

        System.out.println("Masukkan merk seoatu (Converse/Sketcher/Nike): ");
        merk = input07.nextLine();
        System.out.println("Masukkan kategori sepatu (Slip On/ High Top/Woman/Man/Kids/Adult)");
        kategori = input07.nextLine();
        System.out.println("Masukkan ukuran sepatu: ");
        ukuran = input07.nextInt();

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On") && ukuran >= 36 && ukuran < 40) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && ukuran >= 40 && ukuran <= 44) {
                harga = 1200000;
            }
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman") && ukuran >= 36 && ukuran <= 40) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && ukuran >= 41 && ukuran <= 44) {
                harga = 1800000;
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids") && ukuran >= 36 && ukuran < 40) {
                harga = 750000;
            } else if (merk.equalsIgnoreCase("Adults")&& ukuran >= 40 && ukuran <= 44)  {
                harga = 1500000;
            }
        } else {
            System.out.println("Merk atau kategori tidak tersedia,");
            return;
        }

        if (harga !=0) {
            System.out.println("Hatga sepatu: Rp " + harga);
        } else {
            System.out.println("Ukuran tidak tersedia");
        }
    }
}