/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan;


public class koleksi {
  String title;
  String publisher;
  int year;
   public koleksi (){
       System.out.println("perpustakaan Agfa");
    }
   public void speak(){
        System.out.println("==================");
        System.out.println("||Selamat Datang||");
        System.out.println("==================");
    }  
   
    public static void main(String[] args) {
    koleksi c = new koleksi();
    c.speak();
        System.out.println("\n");
    Book b = new Book();
    b.speak();
        System.out.println("\n");
    Magazine m = new Magazine();
    m.speak();
    System.out.println("\n");
    Skripsi s = new Skripsi();
    s.speak();
    s.lancar();
        System.out.println("\n");
    }
}

class Book extends koleksi {
    String writer;
    public Book (){
        super ();
        title="Tatacara Sholat Wajib";
        publisher="islamic pedia";
        year= 2023;
        writer = "Agfanadita Rezkia Chaurina";
        System.out.println("Judul Buku : "+title);
        System.out.println("Penerbit : "+publisher);
        System.out.println("Tahun terbit : "+year);
        System.out.println("Penulis : "+writer);
    }

public void speak (){
        System.out.println("Alhamdulillah Selesai");
    }
}

class Magazine extends koleksi {
    String edition;
    public Magazine (){
        super ();
        title = "Majalah Pesona Indonesia";
        publisher = "travel express";
        year = 2021;
        edition = "terbaru";
        System.out.println("Judul Majalah : "+title);
        System.out.println("Penerbit : "+publisher);
        System.out.println("Tahun terbit : "+year);
        System.out.println("Edisi : "+edition);
    }
    public void speak (){
        System.out.println("Happy Holiday");
    }
}

class Skripsi extends Book {
    String NPM;
    public Skripsi (){
        super ();
        NPM = "138";
        System.out.println("NPM = "+NPM);
    }
    public void lancar (){
        System.out.println("Bismillah PBO dapat A");
    }
}
    
