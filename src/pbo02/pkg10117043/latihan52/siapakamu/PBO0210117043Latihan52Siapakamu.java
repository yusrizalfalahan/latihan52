/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan52.siapakamu;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * 
 * @author Acer
 */
public class PBO0210117043Latihan52Siapakamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dosen Dosen = new dosen();
        
        Dosen.setNama("Rizki adam kurniawan");
        Dosen.setUmur(27);
        Dosen.setNip("41227829930");
        Dosen.setMatakuliah("PBO");
        System.out.println("NIP DOSEN\t: " +Dosen.getNip());
        Dosen.siapakamu();
        Dosen.mengajarapa();
       
        System.out.println("");
        mahasiswa mhs = new mahasiswa();
        
        mhs.setNama("nindi");
        mhs.setNim("10110269");
        mhs.setUmur(17);
        mhs.setKelas("PBO02");      
        System.out.println("NIM MAHASISWA\t: " + mhs.getNim());
        mhs.siapakamu();
        mhs.kelasapa();
       
        
    }
    
}
