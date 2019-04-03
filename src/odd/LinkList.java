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
public class LinkList {

    private Link first;
    
//  desc sort and  insert
    public void add(char data) {
        Link newLink = new Link(data);

//        data = 0
        if (first == null) {
            first = newLink;
        } 
//        data = 1
        else if (first.next == null) {
//            new<first
            if (newLink.getData() < first.getData()) {
                newLink.next = first;
                first.prev = newLink;
                first = newLink;
            } else {
                first.next = newLink;
                newLink.prev = first;
            }

        } 
//        data > 1
        else {
            Link pointer = first;
            while (pointer.next!=null&&pointer.next.getData()<newLink.getData()) {
                pointer = pointer.next;
            }
            
            newLink.next = pointer;
            newLink.prev = pointer.prev;
            pointer.prev = newLink;
            
            if(newLink.prev == null) first = newLink;
        }

    }

    public boolean isEmpty(){
        return first == null;
    }
    
    public Link delete(){
        
        Link temp = first;
//        data = 0
        if(temp == null) return temp;
//        data = 1
        if(temp.next == null){
            first = null;
            return temp;
        }
        
        first = first.next;
        first.prev = null;
        
        return temp;
    }

    public void display() {
        Link current = first;
        while (current != null) {
            System.out.print(current.getData()+" ");
            current = current.next;
        }
    }


}
