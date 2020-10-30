package com.pbo;
import java.util.Scanner;
public class Main {
    static void soalNomor1() {
        Scanner input = new Scanner(System.in);
        SoalSatu objSoalSatu = new SoalSatu();
        double bil1,bil2,bil3;
        System.out.print("Masukkan bilangan 1: ");
        bil1 = input.nextDouble();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = input.nextDouble();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = input.nextDouble();
        objSoalSatu.setInputData(bil1,bil2,bil3);
        objSoalSatu.getData();
    }
    static void soalNomor2() {
        Scanner input = new Scanner(System.in);
        SoalDua objSoalDua = new SoalDua();
        double bil1,bil2,bil3;
        System.out.print("Masukkan bilangan 1: ");
        bil1 = input.nextDouble();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = input.nextDouble();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = input.nextDouble();
        objSoalDua.setInputData(bil1,bil2,bil3);
        objSoalDua.getData();
    }
    static void soalNomor3() {
        Scanner input = new Scanner(System.in);
        SoalTiga objSoalTiga = new SoalTiga();
        double bil1,bil2,bil3;
        System.out.print("Masukkan bilangan 1: ");
        bil1 = input.nextDouble();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = input.nextDouble();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = input.nextDouble();
        objSoalTiga.setInputData(bil1,bil2,bil3);
        objSoalTiga.getData();
    }
    public static void main(String[] args) {
	// write your code here
       Scanner input = new Scanner(System.in);
       int pilihan=0;
       while (pilihan != 4) {
           System.out.print("=====================\n"+
                   "Menu: \n" +
                   "=====================\n" +
                   "1. Soal Nomor 1 \n" +
                   "2. Soal Nomor 2\n" +
                   "3. Soal Nomor 3\n" +
                   "4. Keluar Aplikasi\n" +
                   "=====================\n" +
                   "Masukkan pilihan Menu [1-4]:");

           pilihan = input.nextInt();
           switch (pilihan) {
               case 1:
                   System.out.println("Ini soal nomor 1");
                   soalNomor1();
                   break;
               case 2:
                   System.out.println("Ini soal nomor 2");
                   soalNomor2();
                   break;
               case 3:
                   System.out.println("Ini soal nomor 3");
                   soalNomor3();
                   break;
               case 4:
                   System.out.println("Ini keluar aplikasi");
                   break;
               default:
                   System.out.println("Salah pilih menu");
           }
       }
    }
}
