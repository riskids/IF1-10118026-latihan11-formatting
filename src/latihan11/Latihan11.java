/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan11;

/**
 *
 * @author dwisr
 * NAMA      : RISKI DWI SABARIYANTO
 * KELAS     : IF -1 
 * NIM       : 10118026
 * Deskripsi : Program untuk belajar formating angka
 * 
 */
public class Latihan11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 10000;
        int iMinus = -i;
        
        System.out.println("i : " +i);
        System.out.printf("%%d : %d%n" ,i);
        System.out.printf("%%10d : %10d%n" ,i);
        System.out.printf("%%+10d : %+10d%n" ,i);
        System.out.printf("%%+10d : %+10d%n" ,iMinus);
        System.out.printf("%%,10d : %,10d%n" ,i);
        System.out.printf("%%-10d : %-10d%n" ,i);
        double f = 45232434.123;
        System.out.println(" f : "+ f);
        System.out.printf("%%f: %f%n" ,i);
        System.out.printf("%%.f: %.2f%n" ,i);
        System.out.printf("%%12.2f: %12.2f%n" ,i);
        System.out.printf("%%,12.2f: %,12.2f%n" ,i);
    }
    
}
