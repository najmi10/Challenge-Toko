/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge_inheritance;
class Kakiku {
    private String merk;
    private String jenis;
    private String warna;
    private String kategori;
    
    public Kakiku(String merk, String jenis, String warna, String kategori){
       this.merk = merk;
       this.warna = warna;
       this.jenis = jenis;
       this.kategori = kategori;
        
        System.out.println("\nKategori Sepatu \t: " + kategori);
        System.out.println("Jenis Sepatu      \t: " + jenis);
        System.out.println("Merk Sepatu       \t: " + merk);
        System.out.println("Warna Sepatu      \t: " + warna);

  

    
        
    }
}
