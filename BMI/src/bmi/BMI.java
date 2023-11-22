/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author A S U S
 */
import java.util.Scanner;
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int berat;
        double tinggi;
        double bmi;
        
        System.out.println(" Masukan Berat :");
        berat = input.nextInt();
        System.out.println(" Masukan Tinggi :");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmi= berat/ (tinggi*tinggi);
        System.out.println(" BMI Kamu adalah :" + bmi);
        
        if(bmi<18.5) {
             System.out.println(" Kurus / Kurang ");
        }
        else if (bmi<24.9){
             System.out.println(" Normal / Ideal ");
        }
        else if(bmi<29.9){
             System.out.println(" Berisi / Gemuk ");
        }
        else {
             System.out.println(" Obesitas ");
        }
        
    }
    
}
