import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    
        System.out.println("=======DERET ANGKA TERFILTER======");
        for (int z = 1; z <= 50; z++) {
            if (z % 5 == 0 || z % 3 == 0) { 
                continue;
            }
            System.out.println(z);
    }
}

}