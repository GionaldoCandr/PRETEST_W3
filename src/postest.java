import java.util.Scanner;

public class postest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Simulasi Menu ATM");

        int saldo = 500000;
        int pilihan;

        do {
            System.out.println("\n1. Cek Saldo | 2. Setor Tunai | 3. Tarik Tunai | 4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("Saldo Anda: Rp." + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah setoran: ");
                    int setoran = input.nextInt();
                    saldo += setoran;
                    System.out.println("Setoran berhasil. Saldo Anda sekarang: Rp." + saldo);
                    break;

                case 3:
                    if (saldo <= 50000){
                        System.out.println("Saldo tidak mencukupi maaf yeee");
                        break;
                    }else {

                        System.out.print("Masukkan jumlah penarikan: ");
                        int penarikan = input.nextInt();
                        
                        if (penarikan <= saldo) {
                            saldo -= penarikan;
                            System.out.println("Penarikan berhasil. Saldo Anda sekarang: Rp." + saldo);
                        } else {
                            System.out.println("Saldo tidak mencukupi.");
                        }
                        break;
                    }

                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan ATM kami.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);

        input.close();
    }
}