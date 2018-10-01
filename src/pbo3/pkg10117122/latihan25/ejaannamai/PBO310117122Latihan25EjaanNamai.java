/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan25.ejaannamai;
import java.util.Scanner;
/**
 *
 * @author lenovo
 * 
 * NAMA  : BONAVENTURA ALDINO SENDA SENI
 * KELAS : PBO-3
 * NIM   : 10117122
 * Deskripsi Program : User memasukan nama, menampilkan ejaan nama per karakter
 * 
 */
public class PBO310117122Latihan25EjaanNamai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama; 
        int panjangNama;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda : ");
        nama = in.nextLine();
       
        System.out.println("Ejaan untuk " + nama + " adalah\n");
        
        char []arrHuruf = nama.toCharArray();
        panjangNama = arrHuruf.length;
        for (int i = 0; i < panjangNama; i++){
            for (int j = 0; j < panjangNama; j++){
                if(arrHuruf[i]!=' '){
                   if(j==panjangNama-1){
                   System.out.println("Huruf ke-" + (i+1) + " : " + arrHuruf[i]);
                   } 
                }
            }
        }
        System.out.println("(Developed by : Bonaventura Aldino Senda Seni)");
    }
}
