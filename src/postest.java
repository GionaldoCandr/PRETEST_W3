import java.util.Scanner;

public class postest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Simulasi Mentu ATM");

    
        int saldo= 500000;


        do {
            System.out.println("1. Cek saldo| 2. Setor Tunai| 3. Tarik Tunai| 4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda: Rp." + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah setoran: ");
                    int setoran = input.nextInt();
                    saldo += setoran;
                    System.out.println("Setoran berhasil. Saldo Anda sekarang: Rp. " + saldo );
                    break;
                case 3:
                    System.out.print("Masukkan jumlah penarikan: ");
                    int penarikan = input.nextInt();
                    if (penarikan <= 50000) {
                        System.out.println("Penarikan berhasil. Saldo Anda sekarang: Rp. " + (100000 - penarikan));
                    } else {
                        System.out.println("Penarikan tidak dapat dilakukan. Saldo Anda tidak mencukupi.");
                    }
                    break;
        




        } while ( pilihan  == 4);

}
    
}