package motoyamaha;

import java.util.Scanner;

public class MesinBeraksi {
    public static void main(String[] args) {        
        
        Mesin gearku = new Mesin();
        
        Scanner masukannd = new Scanner(System.in);
        System.out.print("Masukkan Nama Kamu: ");
        String nama = masukannd.nextLine();
        System.out.println("Nama Pemilik Motor : " + nama);
        
        MotoYamaha motorku = new Mesin(2010,"Xeon");
        motorku.tampilHasil();
       
        gearku.setMesinNaik(3);
        //gearku.getGir();
        gearku.setMesinNaik(2);
        //gearku.getGir();
        gearku.tampilHasilMesin();
        
        Mesin gearmu = new Mesin();
        
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        String namak = masukan.nextLine();
        System.out.println("Nama Pemilik Sepeda : " + nama);
        
        MotoYamaha motormu = new Mesin(2011,"Jupiter");
        motormu.tampilHasil();

        gearku.setMesinNaik(3);

        gearku.setMesinNaik(2);

        gearku.tampilHasilMesin();
        
        

    }
}

