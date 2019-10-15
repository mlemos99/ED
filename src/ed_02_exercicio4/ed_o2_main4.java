/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_02_exercicio4;

/**
 *
 * @author Acer
 */
public class ed_o2_main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkedList<Integer>  a = new DoubleLinkedList<> ();       
        

          a.addHead(10);
          
//        
        a.print();
        System.out.println("------------------");
//
//        a.removeFirst(10);

        a.removeLast();
        a.print();
    }
    
}
