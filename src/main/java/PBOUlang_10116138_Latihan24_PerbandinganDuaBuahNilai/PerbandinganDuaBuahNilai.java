/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan24_PerbandinganDuaBuahNilai;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Perbandingan dua buah nilai
 * NORunning
 */
public class PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);

        int nNilai1, nNilai2, Hasil, i;
        String jawaban, peritah;

        boolean ulang = true;

        while (ulang == true) {
            System.out.println("Masukan nilai pertama : ");
            Scanner scanner = new Scanner(System.in);
            nNilai1 = scanner.nextInt();

            System.out.println("Masukan nilai kedua : ");
            nNilai2 = scanner.nextInt();

            jawaban = (nNilai1 > nNilai2 ? "besar" : "kecil");
            System.out.println("Hasil : " + nNilai1 + " Lebih " + jawaban + " dari " + nNilai2);
            
            System.out.print("Ulangi Aktifitas ? (ya/tidak) : ");
            String perintah = scanner.next();
            
            if (perintah.equals("tidak")){
                ulang = false;
                System.out.println("Keluar");
            } else {
                System.out.print("Masukan Nilai Pertama : ");
                nNilai1 = scanner.nextInt();
                
                 System.out.print("Masukan Nilai Kedua : ");
                nNilai2 = scanner.nextInt();
            
                jawaban = (nNilai1 > nNilai2 ? "besar" : "kecil");
                
                System.out.println("Hasil : " + nNilai1 + " Lebih " + jawaban + " dari " + nNilai2);
                System.out.println("Ulang aktifitas ? (ya/tidak) : ");
                perintah = scanner.next();
            }
    }
    
}
}

