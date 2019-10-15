/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_02_exercicio2;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Acer
 */
public class LinkedListNosSentinela<T> {
    private Node head;//referencia para a primeira
    private Node tail;//referencia para a ultima
    private int count;//contador de elementos da lista

    //construtor para uma lista vazia
    public LinkedListNosSentinela() {
        this.head = null;
        this.tail = null;
        this.count = 0;

    }

    public int getCount() {
        return count;
    }

    private boolean isEmpty() {
        return (count == 0);
    }
    
    
/**
     * Método para adicionar a lista
     * @param elem
     */
    public void add(T elem){
        //criação de um novo node
        Node<T> novo = new Node<>(elem);
   
        if (isEmpty()) { // se for vazia
            head = novo; 
            tail = head; 
        } else {
            Node<T> current = head; //pesquisar a posição do elemento
            
            while (current.getNext() != null) { //enquanto o elemento seguinte for diferente de null
                current = current.getNext(); //inserir a frente

            }
            current.setNext(novo); //liga o novo nó a lista 
            this.tail = novo; //o último elemento vai ser o que entrou o novo
        }
        this.count++; //incrementa

    }    
    
 /**
    * Método que remove o primeiro elemento igual ao valor pretendido 
    */
    public void remove(T value) {
        if (isEmpty()) {
            return; 
        }else {
            Node<T> current = head.getNext();
            Node<T> anterior = head;
            while (current != null) {

                if (value.equals(current.getElement())) {
                    anterior.setNext(current.getNext());
                }
                anterior = current;
                current = current.getNext();
            }
        }
        count--;
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

        System.out.println(this.count); //conta o numero de elementos
        
        if (this.head !=null) { // se o head for diferente de null
            System.out.println("head    "+this.head.getElement().toString()); // dá o valor do 1 elemento
        }
        
        if (this.tail !=null) { // se tail for diferente de null
            System.out.println("tail    "+this.tail.getElement().toString()); // dá o valor do ultimo elemento
        }
    }
        
}
