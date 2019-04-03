/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd;

import even.*;

/**
 *
 * @author riza
 */
public class OddApp {
    
    public static void main(String[] args) {
       
        String input = "UNIVERSITAS";
       
        LinkList list = new LinkList();
        
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }
       
        while (!list.isEmpty()) {
            System.out.println(list.delete().getData()+" ");
        }
        
    }
    
}
