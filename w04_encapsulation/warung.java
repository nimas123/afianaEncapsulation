/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w04_encapsulation;

import java.util.Scanner;

/**
 *
 * @author Afiana Septi Laili
*Teknik Informatika - Univ.Islam.Balitar
*NIM : 22104410032
 */
public class Warung {
    
    public String makanan, minuman;

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }
    
    
    
    public static void main(String[] args) {
        
        Warung warung = new Warung();
         System.out.println("Masukkan makanan :");
        Scanner varMakanan = new Scanner(System.in);
        warung.setMakanan(varMakanan.nextLine());
//        warung.setMakanan("Bakso Bearanak");
//        warung.setMinuman("Joshua");
        
        System.out.println("Menu makanan :"+warung.getMakanan());
//        System.out.println("Menu minuman :"+warungB.getMinuman());

   }
}
