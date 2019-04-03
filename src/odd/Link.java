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
public class Link {
   
    private char data;
    Link next;
    Link prev;

    public Link(char data) {
        this.data = data;
    }

    public char getData() {
        return data;
    }
    
}
