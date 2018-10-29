/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan52.siapakamu;

/**
 *
 * @author Acer
 */
public class dosen extends manusia {

    private String nip;
    private String matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void mengajarapa() {
        
        System.out.println("saya " + nama + " umur " + umur + " mengajar " + matakuliah);

    }
    public void siapakamu(){
        System.out.println("saya dosen");
    }
}
