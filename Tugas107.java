import java.util.Scanner;

public class Tugas107 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner (System.in);

        System.out.println("Masukkan Bilangan 1 = ");
        int bil1 = input07.nextInt();
        System.out.println("Masukkan Bilangan 2 = ");
        int bil2 = input07.nextInt();
        System.err.println("Masukkan Bilangan 3 = ");
        int bil3 = input07.nextInt();

        int bilLbhBesar = bil1;

        if (bil2 > bil1) {
            bilLbhBesar= bil2;
        }

        if (bil3 > bilLbhBesar) {
            bilLbhBesar = bil3;
        }

        System.out.println("Bilangan terbesar adalah: " + bilLbhBesar);
    
    }
}