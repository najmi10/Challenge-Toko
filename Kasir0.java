/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge_inheritance;

/**
 *
 * @author ica
 */
class Kasir1 extends Kakiku{
    private String apk;
    
    public Kasir1(String kategori, String jenis, String merk, String warna){
        super(kategori, jenis, merk, warna);
    }
}
public class Kasir0 {
    
    public static void main(String[] args) {
        apkKasir cetak = new apkKasir();
        cetak.apk();
    }
    
}
    
  
    
    

