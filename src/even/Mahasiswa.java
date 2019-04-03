/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even;

/**
 *
 * @author riza
 */
public class Mahasiswa {
    private String nama;
    private int nilai;

    public Mahasiswa(String name, int assignment) {
        this.nama = name;
        this.nilai = assignment;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "name=" + nama + ", assignment=" + nilai + '}';
    }
    
    
    
}
