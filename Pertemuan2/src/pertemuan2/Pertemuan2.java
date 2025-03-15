package pertemuan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Made Artha
 * TGL: 15 Maret 2025
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = "Wahyudi";
        String nim = "0123456789";
        double ipk = 3.25;
        
        BufferedReader dtain = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Input Nama Mahasiswa: ");
        try{
            nama = dtain.readLine();
            System.out.print("Input NIM Mahasiswa: ");
            nim = dtain.readLine();
            System.out.print("Input IPK Mahasiswa: ");
            ipk = Double.parseDouble(dtain.readLine());
        }catch(IOException e){
            System.out.println("Error pembacaan data");
        }
        
        System.out.print(nama);
        System.out.println(nim);
        
        System.out.printf("Nama Saya %s dengan NIM %s dengan IPK %.2f",nama,nim,ipk);
    }
    
}
