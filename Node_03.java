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
public class Node_03 {
    Node_03 prev, next;
    Konsumen konsumen;
    Pesan pesan;
    
    
   Node_03(Node_03 prev, Node_03 next,Konsumen konsumen, Pesan pesan){
   this.prev = prev;
   this.next = next;
   this.pesan = pesan;
   this.konsumen = konsumen;
   this.next = next;
  
   }
}
