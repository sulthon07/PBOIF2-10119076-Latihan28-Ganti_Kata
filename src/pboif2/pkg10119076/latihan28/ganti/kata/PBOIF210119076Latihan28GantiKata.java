/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan28.ganti.kata;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama : Sulthon naufal akmal
 * Kelas : IF2
 * NIM : 10119076
 */
public class PBOIF210119076Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String kalimat,ganti , menjadi;
       
       System.out.println("====program mengganti kata====");
       System.out.print("Masukkan kalimat: ");
       kalimat = in.nextLine();
       System.out.print("Ganti Kata: ");
       ganti = in.nextLine();
       System.out.print("Menjadi Kata: ");
       menjadi = in.nextLine();
       
       System.out.println("====Hasil Formating====");
       System.out.println("Kalimat AWaal: "+ kalimat);
       System.out.println("Kalimat Baru: "+ kalimat.replace(ganti,menjadi));
       System.out.println("\nHasil find dan replace : "+kalimat.replace(ganti,menjadi));
        
       
       System.out.println("=================================");
       System.out.println("Developed by Sulthon Naufal Akmal");
       
    }
}
