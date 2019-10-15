/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_02_exercicio2;

/**
 * Classe Node
 * @author Acer
 * @param <T>
 */
public class Node<T> {
    public Node<T> next; //atributo para o nó seguinte
    public T element; //atributo para o elemento a armazenar no nó

    /**
     * Método construtor do Node
     * @param element 
     */
    public Node(T element) {
        this.next = null;
        this.element = element;
    }

    /**
     * Método para obter o nó seguinte
     * @return next
     */
    public Node<T> getNext() {
        return next;
    }
    
    /**
     * Método para atribuir o nó seguinte
     * @param next 
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Método para obter o elemento a armazenar no nó
     * @return element
     */
    public T getElement() {
        return element;
    }
       
    
}
