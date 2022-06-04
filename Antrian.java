/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.pkg2;

/**
 *
 * @author HP
 */
public class Antrian {
    Node_03 head;
    int size; 
    
    Antrian(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(Konsumen kon, Pesan pe) {
        if(isEmpty()){
            head = new Node_03(null, kon, pe, null);
        } else {
            Node_03 newNode = new Node_03(null, kon, pe, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(Konsumen kon, Pesan pe) {
        if(isEmpty()) {
            addFirst(kon, pe);
        }else {
            Node_03 current = head;
            while(current.next != null) {
                current = current.next;
            }
            Node_03 newNode = new Node_03(current, kon, pe, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void print() {
        if(!isEmpty()) {
            Node_03 tmp = head;
            while(tmp != null) {
                tmp = tmp.next;
            }
            System.out.println("Lists berhasil diisi!");
        }else {
            System.out.println("ANTRIAN YANG ADA MASIH KOSONG! ");
        }
    }
    
    public void removeFirst() throws Exception{
        if(isEmpty()) {
            throw new Exception("ANTRIAN MASIH KOSONG TIDAK DAPAT MENGHAPUS Node");
        } else if (size == 1) {
            head = null;
            System.out.println(head.konsumen.namaKonsumen + "TELAH SELESAI MEMESAN ");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}
