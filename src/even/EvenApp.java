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
public class EvenApp {
    
    public static void main(String[] args) {
        
        LinkList list = new LinkList();
        
        list.add(new Mahasiswa("Riza", 80));
        list.add(new Mahasiswa("Ahmad", 90));
        list.add(new Mahasiswa("Ferguso", 30));
        list.add(new Mahasiswa("Rodrigo", 10));
        list.add(new Mahasiswa("Antonio", 40));
        list.add(new Mahasiswa("Antonio", 10));
        
        list.display();
        list.add(new Mahasiswa("Bambang", 50));
        System.out.println("-----------");
        list.displayTop(5);
    }
    
}
