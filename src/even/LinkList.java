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
public class LinkList {

    private Link first;

//  desc sort and  insert
    public void add(Mahasiswa data) {
        Link newLink = new Link(data);

//        data = 0
        if (first == null) {
            first = newLink;
        } 
//        data = 1
        else if (first.next == null) {
//            new>first
            if (newLink.getMhs().getNilai() > first.getMhs().getNilai()) {
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
            while (pointer.next!=null&&pointer.next.getMhs().getNilai()>newLink.getMhs().getNilai()) {
                pointer = pointer.next;
            }
//            swap
            newLink.next = pointer.next;
            newLink.prev = pointer;
            pointer.next = newLink;
        }

    }

    public void display() {
        Link current = first;
        while (current != null) {
            System.out.println(current.getMhs());
            current = current.next;
        }
    }

    public void displayTop(int n) {
        Link current = first;
        int i = 0;
        while (current != null && i < n) {
            System.out.println(current.getMhs());
            current = current.next;
            i++;
        }
    }

}
