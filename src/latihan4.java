import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    
        System.out.println("====PENYERDEHANAAN LOGIKA=======");
    
System.out.println("nilai kelulusan :");
int angka = input.nextInt();
System.out.println("presentase absensi : ");
int presen = input.nextInt();



String hasil = (angka >= 75 && presen >= 80) ? "lulus" : "tidak lulus";
System.out.println(hasil);



}

}