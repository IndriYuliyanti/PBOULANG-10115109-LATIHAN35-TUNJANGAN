/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihantunjangan;
import java.util.Scanner;
/**
 *
 * @author nama : indri yuliyanti
 *          nim : 10115109
 *          kls : pbo ulang
 *          tugas pert 3 : TUNJANGAN
 */
public class Pboulang10115109Latihantunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner in = new Scanner(System.in);
        int gajipokok = 0;
        int tunj = 0;
        int total = 0;

        Scanner sc = new Scanner(System.in);
        String status ;
        String hasil = "Menikah";

        System.out.print(" ===========Program Tunjangan============");
        System.out.print("\n Berapa gaji pokok anda perbulan? : Rp.");
        gajipokok = in.nextInt();
        System.out.print(" Status Anda? (Menikah/Belum)     : ");
        status = sc.nextLine();
       
        System.out.println("======Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok       : Rp."+gajipokok);
       
        if (status.equals(hasil)){
            tunj = (gajipokok*35)/100 ;
            total = gajipokok+tunj;
        }else
        tunj = 0;
        total = gajipokok+tunj;
        System.out.println("Tunjangan        : Rp."+tunj);
        System.out.println("Total Gaji       : Rp."+total);
        
    }
    
}
