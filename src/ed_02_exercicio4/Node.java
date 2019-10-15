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
public class Node<T> {
    T element;  //atributo para o elemento a armazenar no nó
    private Node next; //atributo para o nó seguinte
    private Node previous; //atributo para o nó anterior

    /**
     * Método construtor
     * @param element 
     */
    public Node(T element) {
        this.element = element;
    }

    /**
     * Método para obter o nó anterior
     * @return 
     */
    public Node getPrevious() {
        return previous;
    }

    /**
     * Método para atribuir o no anterior
     * @param previous 
     */
    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    /**
     * Método para obter o elemento
     * @return 
     */
    public T getElement() {
        return element;
    }

    /**
     * Método para atribuir o elemento
     * @param element 
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Método para obter o nó seguinte
     * @return 
     */
    public Node getNext() {
        return next;
    }

    /**
     * Método para atribuir o nó seguinte
     * @param next 
     */
    public void setNext(Node next) {
        this.next = next;
    }

}
