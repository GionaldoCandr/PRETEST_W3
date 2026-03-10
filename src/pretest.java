import java.util.Scanner;

public class pretest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print( "===== SISTEM KELAYAKAN DONOR DARAH ====");
        System.out.print("\nUsia :");
            int usia = input.nextInt();
        if ( usia < 18 ){
            System.out.print("usia tidak memenuhi kriteria(silahkan input ulang )");
            return;
        }else {
            System.out.print("Usia memenuhi kriteria ( lanjutkan input dibawah) ");
        }
        System.out.print("\nBerat Badan:");
            float berat = input.nextFloat();
             if ( berat < 64 ){
            System.out.print("berat tidak memenuhi kriteria(silahkan input ulang )");
            return;
        }else {
            System.out.print("berat memenuhi kriteria ( lanjutkan input dibawah) ");
        }
        System.out.print("\nKadar Hemogoblin:");
            float kadar = input.nextFloat();
        if ( kadar < 12.5 ){
            System.out.print("kadar tidak memenuhi kriteria(silahkan input ulang )");
            return;
        }else {
            System.out.print("kadar memenuhi kriteria ( lanjutkan input dibawah) ");
        }

        System.out.print("\n========HASIL KELAYAKAN========");
        System.out.print("\nSemua Memenuhi Kriteria");

        System.out.print("\n========MODEL NESTED IF========");


        if ( usia > 18 ){
            if ( berat > 64 ){
                if ( kadar > 12.5){
                    System.out.print("\nsemua memenuhi kriteria !!!");
                }else { 
                    System.out.print ("\ntidak memenuhi kriteria input ulang");
                }
            } else {
                System.out.print("\n tidak memenuhi kriteria input ulang");
            }
        }else {
            System.out.print("\n tidak memenuhi kriteria input ulang");
        }

   }
}