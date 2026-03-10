import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("KALKULATOR SEDERHANA");
        System.out.print("\nAngka pertama: ");
        float a = input.nextFloat();
        System.out.print("\nAngka kedua: ");
        float b = input.nextFloat();
        if (a == 0 & b == 0) {
            System.out.println("error ");
        }else {
        System.out.println("masukkan pilihan operasu");
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.print(":" );
        int j = input.nextInt();
        switch ( j){
            case 1:
                System.out.println(a + b);
                break;
                case 2:
                    System.out.println(a - b);
                break;
                case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (a == 0 || b == 0) {
                    System.out.println("error");
                    break;
                }else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("error");
        }

    }


    }
}