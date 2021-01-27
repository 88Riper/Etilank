/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etilank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Etilank {

    public static ArrayList<Data> list = new ArrayList<>();
    
    public static String email (String email){
        if (email.equals("admin")) {
        } else if (!email.equals("admin")) {
            System.out.println("Gagal login");
            System.exit(0);
        }
        return email;
    }
    
    public static String password(String pass){
        if (pass.equals("Iptu.Saturo")) {
            System.out.println("");
            System.out.println("--Selamat Datang Iptu--");
        } else if (!pass.equals("Pakpol")) {
            System.out.println("Gagal login");
            System.exit(0);
        }
        return pass;
    }
    public static String inputData(){
        String nKendaraan, pelanggaran, nama, tanggal, MeTode, type, noRek, test;
        int pilihan, nominal;
        
        Scanner sc = new Scanner (System.in);
        
	//Pilihan
        System.out.println("===============================");
        System.out.println("Silahkan Isi data dibawah ini");
        System.out.println("Tipe Pelanggaran yang anda lakukan");
        System.out.println("1.Tidak Memakai helm (RP.500.000)");
        System.out.println("2.Tidak membawa surat-surat (RP.200.000)");
        System.out.println("3.telat bayar pajak(RP.700.000)");
        System.out.println("Masukan Nominal Denda yang anda lakukan");
        pilihan = sc.nextInt();
        
        nominal = 0;
        type = "error";
        switch (pilihan){
            case 1:
                type = "Tidak Memakai Helm";
                nominal = 500000;
                break;
            case 2:
                type = "Tidak Membawa surat-surat";
                nominal = 200000;
                break;
            case 3:
                type = "Telat Bayar Pajak";
                nominal = 700000;
                break;
            default:
                System.out.println("Mohon Masukan Pelanggaran Dengan Benar Atau Anda Mendapatkan Denda");
                inputData();
                break;
        }
        
        System.out.println("Masukan Data anda");
        test = "ts" + sc.nextLine();
        
        System.out.println("Masukan Nama Anda");
        nama = "NM" + sc.nextLine();
        
        System.out.println("Tanggal Anda Ditilank");
        tanggal = "TGL" + sc.nextLine();
        
        System.out.println("Masukan Nomor Kendaraan anda");
        nKendaraan = "NKR" + sc.nextLine();
        
        System.out.println("Masukan Metode Pembayaran Anda");
        MeTode = "MT" + sc.nextLine();
        
        System.out.println("Masukan No Rek anda");
        noRek = "NRK" + sc.nextLine();
        
        Etilank et = new Etilank();
        et.addValues(nKendaraan, nama, tanggal, MeTode, type, noRek, pilihan, nominal);
        return "inputData";
    }

    
    private void addValues(String nKendaraan, String nama, String tanggal, String MeTode, String type, String noRek, int pilihan, int nominal) {
     list.add(new Data(nKendaraan, nama ,tanggal ,MeTode, type, noRek, pilihan, nominal ));
     printValues(list);
    }
    class Data{
        String nKendaraan; 
        String pelanggaran;
        String nama;
        String tanggal;
        String MeTode;
        String type;
        String noRek;
        
        int pilihan;
        int nominal;
        
        public Data(String nKendaraan, String nama, String MeTode,String tanggal, String type, String noRek, int pilihan, int nominal){
            this.nKendaraan = nKendaraan;
            this.nama = nama;
            this.MeTode = MeTode;
            this.tanggal = tanggal;
            this.type = type;
            this.noRek = noRek;
            this.pilihan = pilihan;
            this.nominal = nominal;
        
        }
       
    }
    
    public static void menuUtama(){
        
        int pilihan;
        
        Etilank et =  new Etilank();
        Scanner sc =  new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Selamat Datang Di Aplikasi Pembayar E-tilank");
        System.out.println("Silahkan Pilih Menu di bawah ini");
        System.out.println("1. Masukan Data");
        System.out.println("2. Lihat Database");
        System.out.println("3. Menghitung Denda");
        System.out.println("4. Keluar");
        System.out.println("Masukan Angka Menu Untuk Memilih");
        pilihan = sc.nextInt();
        
        switch (pilihan){
            case 1:
                inputData();
                break;
            case 2:
                et.printValues(list);
                break;
            case 3:
                kalkulator();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
    
    public static void kalkulator(){
        int pilih , pilihan , nilai1, nilai2;
        double hasil;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Kalkulator Menghitung Denda");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("Masukan Pilihan Anda");
        pilih = sc.nextInt();
        
        System.out.println("Masukan Angka Pertama : ");
        nilai1 = sc.nextInt();
        System.out.println("Masukan Angka Kedua : ");
        nilai2 = sc.nextInt();
        
        switch(pilih){
            case 1:
                hasil = nilai1 + nilai2;
                System.out.println("Hasilnya Adalah = " +hasil);
                break;
            case 2:
                hasil = nilai1 - nilai2;
                System.out.println("Hasilnya Adalah = " +hasil);
                    break;
                
            case 3:
                hasil = nilai1 * nilai2;
                System.out.println("Hasilnya Adalah = " +hasil);
                break;
            case 4:
                hasil = nilai1 / nilai2;
                System.out.println("Hasilnya Adalah = " +hasil);
                break;    
            
            }
        String Pilihan;
        Pilihan = sc.nextLine();
        
        switch (Pilihan){
            case "":
                menuUtama();
                break;
            default:
    }
    }
    
    public void printValues(ArrayList<Data> list){
        
        System.out.println("==============================");
        System.out.println("Data Base Polri");
        
        System.out.println("No.Kendaraan / Nama Saudara / Pelanggaran / Metode Pembayaran / No.Rekening Saudara / Nominal Yang harus dibayar kan  ");
        
        for(int i = 0; i < list.size(); i++){
            Data data = list.get(i);
            System.out.println(data.nKendaraan + "  /"+ data.nama+"  /"+"  /"+data.type+"  /"+data.MeTode+"  /"+data.noRek+"  /"+data.nominal+"  /"+data.tanggal);
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Klik Enter Untuk Kembali ke menu Utama");
        String Pilihan;
        
        Scanner sc = new Scanner(System.in);
        Pilihan = sc.nextLine();
        
        switch (Pilihan){
            case "":
                menuUtama();
                break;
            default:
                printValues(list);
        }
        
        
    }
    
    public static void main(String[] args) {
        String username, pass;
        
        Etilank et = new Etilank();
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Enter Your ID: ");
        username = sc.nextLine();
        et.email(username);
        
        System.out.println("Enter your Password");
        pass = sc.nextLine();
        et.password(pass);
        
        menuUtama();
    }
    
}
