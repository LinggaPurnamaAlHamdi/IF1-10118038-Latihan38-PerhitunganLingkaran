/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan38.oo.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Perhitungan Lingkaran
 */
public class Hitung {
    private double diameter;
    
public void inputDiameter() {
        String a;
        Scanner sc = new Scanner(System.in);
            System.out.println("======Perhitungan Lingkaran=====");
            System.out.print("Masukkan nilai diameter lingkaran : ");
            a = sc.nextLine();
            while (!a.matches("[0-9]*")){
                    System.out.println("Nilai Diameter Tidak Sesuai\n");
                    System.out.print("Masukkan nilai diameter lingkaran : ");
                    a = sc.nextLine();	
	}
	
            diameter = Double.parseDouble(a); 
            System.out.println("\n=======Hasil Perhitungan Lingkaran======");
            System.out.println("Jari-jari Lingkaran = " + (diameter/2) + " cm");
            System.out.println("Luas Lingkaran = " + (3.14*(diameter/2)*(diameter/2)) + " cm");
            System.out.println("Keliling Lingkaran = " + (3.14*diameter) + " cm");
	}
}