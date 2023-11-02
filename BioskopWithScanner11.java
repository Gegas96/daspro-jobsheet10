import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {

        Scanner input11 = new Scanner(System.in);

        int baris = 0, kolom = 0, menu;
        String nama, next;
        String[][] penonton = new String[4][2];
        

        while (true) {
            System.out.println();
            System.out.println("Menu Pilihan");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih (1/2/3): ");
            menu = input11.nextInt();

            while (true) {
                if (menu == 1) {
                    System.out.print("Masukkan nama: ");
                    nama = input11.next();
                    System.out.print("Masukkan baris: ");
                    baris = input11.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input11.nextInt();
                    input11.nextLine();

                    if (baris >= penonton.length) {
                        System.out.println("Maaf nomor baris tidak tersedia");
                        continue;
                    }
                    if (kolom-1 >= penonton[baris-1].length) {
                        System.out.println("Maaf nomor kolom tidak tersedia");
                        continue;
                    }
                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Maaf kursi yang anda pilih telah terisi");
                        System.out.println("Silakan isi baris dan kolom kembali");
                        continue;
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input11.nextLine();
    
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                } else if (menu == 2) {
                    for (int i = 0; i < penonton.length; i++) {
                        String[] penontonBaris = penonton[i];
                        for (int j = 0; j < penontonBaris.length; j++) {
                            if (penontonBaris[j] == null) {
                                penontonBaris[j] = "***";
                            }
                        }
                        System.out.println("Penonton pada baris ke-" + (i + 1) + " : " + String.join(", ", penonton[i]));
                    }
                    break;
                } else if (menu == 3) {
                    System.out.println("Terima kasih telah datang di bioskop kami.");
                }
                break;
            }
            break;
        }
    }
}
