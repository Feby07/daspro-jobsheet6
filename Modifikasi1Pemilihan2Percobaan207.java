import java.util.Scanner;

public class Modifikasi1Pemilihan2Percobaan207 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        int pilihan_menu, harga;
        String member, metode_pembayaran;
        double diskon, total_bayar, potongan, totalHarga;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("---------------------------------------");
        System.out.println("Maskkan angka dari menu yang dipilih = ");
        pilihan_menu = input07.nextInt();
        input07.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input07.nextLine();
        System.out.println("Masukkan Metode Pembayaran (Cash/QRIS) = ");
        metode_pembayaran = input07.nextLine();
        System.out.println("----------------------------------------");

        if (metode_pembayaran.equalsIgnoreCase("QRIS")) {

         }  if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar Diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Hatga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            
            total_bayar = harga - (harga * diskon);
            potongan = total_bayar - 1000.0;
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Hatga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            totalHarga = harga - 1000;
            System.out.println("Total bayar = " + totalHarga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-----------------------------------------");
    }
}