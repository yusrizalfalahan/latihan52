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
public class mahasiswa extends manusia {

    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasapa() {
        
        System.out.println("saya " + nama + " umur " + umur + " mahasiswa " + kelas);

    }
    @Override
    public void siapakamu(){
        System.out.println("saya mahasiswa");
    }
}
