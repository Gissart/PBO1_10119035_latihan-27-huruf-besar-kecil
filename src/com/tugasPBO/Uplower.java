package com.tugasPBO;
import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = membuat kalimat jadi kapital dan huruf kecil
public class Uplower {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Masukkan kalimat : ");
        String kalimat = scan.nextLine();
        System.out.println("------Hasil Formatting------");
        System.out.println("Huruf besar : "+kalimat.toUpperCase());
        System.out.println("Huruf kecil : "+kalimat.toLowerCase());
    }
}
