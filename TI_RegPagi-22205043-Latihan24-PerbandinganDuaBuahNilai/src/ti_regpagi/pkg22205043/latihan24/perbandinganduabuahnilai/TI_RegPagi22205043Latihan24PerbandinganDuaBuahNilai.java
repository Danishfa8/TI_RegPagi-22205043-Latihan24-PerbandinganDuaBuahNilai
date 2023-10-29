/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205043.latihan24.perbandinganduabuahnilai;

/*
 *  Nama      : Danish Fadlan Azam
 *  NIM       : 22205043
 *  Prodi     : Teknik Informatika
 *  Deskripsi : program ini untuk membandingkan dua buah nilai dari user
 */

import java.util.Scanner;
public class TI_RegPagi22205043Latihan24PerbandinganDuaBuahNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Progam Perbandingan Nilai =====");
        boolean ulangi = true;
        
        while(ulangi){
            System.out.print("\nMasukkan nilai pertama\t: ");
            int nilai1 = input.nextInt();
            System.out.print("Masukkan nilai kedua\t: ");
            int nilai2 = input.nextInt();                                    
            
            if(nilai1 > nilai2){
                System.out.println("hasil : " +nilai1+ " lebih besar dari " +nilai2);
            } else if(nilai1 < nilai2){
                System.out.println("hasil : " +nilai1+" lebih kecil dari " +nilai2);
            } else{
                System.out.println("hasil : " +nilai1+ " sama dengan " +nilai2);
            }
            
            System.out.print("\nulangi aktifitas? (ya/tidak)");
            String aktifitas = input.next().toUpperCase();                                
            
            if(aktifitas.equals("YA")){
                System.out.print("Program akan diulangi\n");                
            } else if(aktifitas.equals("TIDAK")){
                System.out.print("Program Berhenti Terimakasih\n");
                ulangi = false;
            }
        }
    }
    
}
