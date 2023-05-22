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
public class mainKinetik {
    
        private double massa;
        private double kecepatan;

        public double getMassa() {
            return massa;
        }

        public void setMassa(double massa) {
            this.massa = massa;
        }

        public double getKecepatan() {
            return kecepatan;
        }

        public void setKecepatan(double kecepatan) {
            this.kecepatan = kecepatan;
        }
        
        public double hitungEnergiKinetic(){
            return 0.5 * massa * Math.pow (kecepatan, 2 );
            
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            mainKinetik objekKinetic = new mainKinetik();
            
            System.out.println("Masukkan massa sepeda (kg) : ");
            double massa = scanner.nextDouble();
            objekKinetic.setMassa(massa);
            
            System.out.println("Masukkan kecepatan sepeda (m/s)");
            double kecepatan = scanner.nextDouble();
            objekKinetic.setKecepatan(kecepatan);
            
            double energiKinetikHasil = objekKinetic.hitungEnergiKinetic();
            
            System.out.println("Energi sepeda adalah: " + energiKinetikHasil + "Joule");
            
        }
       
        
    }

}
