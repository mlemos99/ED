/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_02_exercicio1;

/**
 *
 * @author Acer
 */
public class ed_02_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList<Integer> a = new LinkedList<>();
        
        
        a.add(5);
        a.add(10);
        a.add(20);
        a.add(25);
        a.addHead(1);
        
        a.print();
        System.out.println("------------------");

//        a.removeFirst();
//        a.remove(10);
        a.removeLast();
        a.print();
    }
    
}
