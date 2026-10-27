import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int j = 1; j <= 4; j++) {            
            System.out.println("Hari ke-" + j + ":");
            
            int totalHariIni = 0;
        
            for (int i = 1; i <= 3; i++) {
                System.out.print("Produk " + i + ": ");
                int produk = input.nextInt();
                totalHariIni += produk; 
            }
            System.out.println("Total Penjualan  : " + totalHariIni);
            System.out.println(); 
        }       
        
        input.close();
    }
}