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
public class Link {
   
    private Mahasiswa mhs;
    Link next;
    Link prev;

    public Link(Mahasiswa data) {
        this.mhs = data;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }
    
}
