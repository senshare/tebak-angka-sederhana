import java.util.Scanner;

public class TebakAngka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("===== Permainan Tebak Angka =====");
            System.out.println("Saya telah memilih sebuah angka antara 1 sampai 100.");
            System.out.println("Silakan tebak angka tersebut!");

            // Generate random number between 1 and 100
            int angkaRandom = (int) (Math.random() * 100) + 1;
            int tebakan;
            int jumlahTebakan = 0;
            boolean tebakanBenar = false;

            while (!tebakanBenar) {
                System.out.print("Masukkan tebakan Anda (1-100): ");
                tebakan = scanner.nextInt();
                jumlahTebakan++;

                if (tebakan < angkaRandom) {
                    System.out.println("Tebakan Anda terlalu kecil. Coba lagi!");
                } else if (tebakan > angkaRandom) {
                    System.out.println("Tebakan Anda terlalu besar. Coba lagi!");
                } else {
                    System.out.println("Selamat! Anda menebak dengan benar.");
                    System.out.println("Jumlah tebakan yang Anda butuhkan: " + jumlahTebakan);
                    tebakanBenar = true;
                }
            }

            System.out.print("Apakah Anda ingin bermain lagi? (ya/tidak): ");
            ulang = scanner.next();

        } while (ulang.equalsIgnoreCase("ya"));

        System.out.println("Terima kasih telah bermain!");
        scanner.close();
    }
}
