import java.util.Scanner;
public class tht {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    System.out.print("TUGAS THT OI BANG JANGAN GITULAH MALES BANGET DAH NI SKIMMING TEXT, ");
    System.out.print("UDAH KEK BACA NOVEL NI HA :(");
            // Inisialisasi stok awal dan harga tiket
        int stokVIP = 5;
        int stokFestival = 25;
        int stokTribune = 35;

        int hargaVIP = 1500000;
        int hargaFestival = 800000;
        int hargaTribune = 500000;

        boolean isRunning = true;

        // Mesin Kiosk selalu menyala (Looping Utama)
        while (isRunning) {
            System.out.println("\n=== Universitas Pertamina SoundFest 2026 ===");
            System.out.println("Sisa Stok Tiket:");
            System.out.println("1. VIP       (" + stokVIP + ") - Rp 1.500.000");
            System.out.println("2. Festival  (" + stokFestival + ") - Rp 800.000");
            System.out.println("3. Tribune   (" + stokTribune + ") - Rp 500.000");
            System.out.println("4. Matikan Mesin");
            System.out.print("Pilih menu (1-4): ");
            int menu = input.nextInt();

            // Menu 4 untuk mematikan mesin
            if (menu == 4) {
                System.out.println("Mematikan mesin Kiosk. Terima kasih.");
                isRunning = false;
                break; 
            }

            if (menu < 1 || menu > 4) {
                System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
                continue;
            }

            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            int jumlahBeli = input.nextInt();

            if (jumlahBeli <= 0) {
                System.out.println("Jumlah tiket tidak valid!");
                continue;
            }

            int hargaSatuan = 0;
            int batasUsia = 0;
            String namaKategori = "";
            int stokSaatIni = 0;

            // Penentuan variabel berdasarkan kategori tiket
            switch (menu) {
                case 1:
                    hargaSatuan = hargaVIP;
                    batasUsia = 18;
                    namaKategori = "VIP";
                    stokSaatIni = stokVIP;
                    break;
                case 2:
                    hargaSatuan = hargaFestival;
                    batasUsia = 15;
                    namaKategori = "Festival";
                    stokSaatIni = stokFestival;
                    break;
                case 3:
                    hargaSatuan = hargaTribune;
                    batasUsia = 0; // Tidak ada batas
                    namaKategori = "Tribune";
                    stokSaatIni = stokTribune;
                    break;
            }

            // Aturan 1: Cek stok di awal
            if (jumlahBeli > stokSaatIni) {
                System.out.println("Maaf, stok tiket " + namaKategori + " tidak mencukupi (Sisa: " + stokSaatIni + ").");
                continue; // Langsung kembali ke menu utama
            }

            int tiketBerhasil = 0;
            int totalTagihan = 0;
            boolean batalDarurat = false;

            // Aturan 2: Input usia satu per satu untuk setiap tiket
            for (int i = 1; i <= jumlahBeli; i++) {
                int usia = 0;
                
                // Loop bersarang untuk validasi usia logis
                while (true) {
                    System.out.print("Masukkan usia untuk Tiket ke-" + i + " (ketik -1 untuk batal): ");
                    usia = input.nextInt();

                    // Batal darurat jika pengguna mengetik -1
                    if (usia == -1) {
                        batalDarurat = true;
                        break; 
                    }

                    // Aturan 3: Cek usia logis (misal antara 1 s.d 100 tahun)
                    if (usia <= 0 || usia > 100) { 
                        System.out.println("Usia tidak logis. Silakan masukkan kembali.");
                        continue; // Terus meminta usia untuk tiket yang sama
                    }
                    
                    // Usia logis, keluar dari pengecekan ini
                    break; 
                }

                // Aturan 4: Jika Batal Darurat, hentikan sisa pesanan keseluruhan
                if (batalDarurat) {
                    System.out.println("Batal Darurat! Menghentikan sisa proses pesanan.");
                    break; // Keluar dari loop For (pembelian)
                }

                // Aturan 5: Pengecekan syarat batas usia kategori
                if (usia < batasUsia) {
                    System.out.println("Usia " + usia + " tahun tidak memenuhi syarat minimal " + batasUsia + " tahun untuk kategori " + namaKategori + ". Tiket ke-" + i + " dibatalkan.");
                    continue; // Melompati penambahan tagihan, lanjut ke tiket berikutnya
                }

                // Jika lolos syarat usia
                System.out.println("Verifikasi usia sukses untuk tiket ke-" + i + ".");
                tiketBerhasil++;
                totalTagihan += hargaSatuan;
            }

            // Pengurangan stok hanya berdasarkan tiket yang berhasil diproses
            if (menu == 1) {
                stokVIP -= tiketBerhasil;
            } else if (menu == 2) {
                stokFestival -= tiketBerhasil;
            } else if (menu == 3) {
                stokTribune -= tiketBerhasil;
            }

            // Aturan 6: Cetak Nota Akhir
            System.out.println("\n--- NOTA AKHIR ---");
            System.out.println("Kategori Tiket   : " + namaKategori);
            System.out.println("Tiket Diproses   : " + tiketBerhasil + " dari " + jumlahBeli + " permintaan.");
            System.out.println("Total Tagihan    : Rp " + totalTagihan);
            System.out.println("------------------\n");
            // Done ni yeee :D

        }

        input.close();

        
    }
}
// GIONALDO CANDRAWANSAH