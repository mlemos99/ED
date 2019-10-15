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
public class DoubleLinkedList <T>{
    private Node<T> head; //atributo para a cabeça da lista
    private int count;
   
    
    /**
     * Método construtor
     */
    public DoubleLinkedList() {
        this.head = null;
        this.count = 0;
    }
    
    /**
     * Método de DoubleLinkedList vazia
     * @return 
     */
    public boolean isEmpty(){
      if (head.getNext() == null) {
            return true;
        }else {
            return false;
        }

    }
    

    /**
     * Método para obter o head
     * @return 
     */
    public Node getHead() {
        return head;
    }

    /**
     * Método para atribuir o head
     * @param head 
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * Método para adicionar a cabeça da Lista
     * @param elem
     */
    public void addHead(T elem) {
      Node<T> novoNode = new Node<>(elem);
      
      if(this.count ==0){
             this.head = novoNode;
         }else{
            novoNode.setNext(head);
            head.getNext().setPrevious(novoNode); //novoNode vai ser atribuido a referencia do head
            head = novoNode; //o novoNode passa a primeiro elemento            
        }
       count ++;
    }
    
   
    
//     /**
//     * Método para remover o primeiro elemento da lista
//     */
//    public void removeFirst(T elem){  
//        Node<T> deleteNode = new Node<>(elem);
//        
//        if (deleteNode == null) { //se for vazia
//            return;
//        } else if(deleteNode.getNext() != null){
//            head.getNext().setPrevious(null); //remove o nó a cabeça
//            head = deleteNode;
//        }
//        this.count--;             //reduz o numero de elementos
//    }

    /**
     * Método para remover o ultimo elemento
     */
    public void removeLast() {
        Node aux = head; //atual

        if (head == null) {
        } else if (head.getNext() == null) {
            head = null;
        } else {
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.getPrevious().setNext(null);
            aux.setPrevious(null);
        }
        count --;
    }

    
    /**
     * Método para imprimir a lista
     */
    public void print() {
        Node<T> current = this.head; 
        while (current != null) { //enquanto o current for diferent de null
            System.out.println(current.getElement().toString()); //print o elemento
            current = current.getNext(); // print o elemento e os seguintes
        }

//        System.out.println(this.count); //conta o numero de elementos
//        
//        if (this.head !=null) { // se o head for diferente de null
//            System.out.println("head    "+this.head.getElement().toString()); // dá o valor do 1 elemento
//        }

    }

}
