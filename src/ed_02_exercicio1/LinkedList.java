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
public class LinkedList <T>{
    private Node<T> head;  //atributo para a cabeça da lista
    private Node<T> tail;  //atributo para a cauda da lista
    private int count;  //contador

    /**
     * Construtor da lista
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    /**
     * Método para obter count
     * @return 
     */
    public int getCount() {
        return count;
    }

    /**
     * Método de lista vazia
     * @return 
     */
    private boolean isEmpty() {
        return (count == 0);
    }
    
    /**
     * Método para adicionar na cabeça da lista
     * @param elem 
     */
    public void addHead(T elem){
      //Criação de um novo node
      Node<T> novoNode = new Node<>(elem);
      
      if (isEmpty()) { //se for vazia
            return;
        } else {
            novoNode.setNext(head); //novoNode vai ser atribuido a referencia do head
            head = novoNode; //o novoNode passa a primeiro elemento
        }
      count ++;
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
            Node<T> current = head; //criamos um node auxiliar com o valor de head
            
            while (current.getNext() != null) { //enquanto o elemento seguinte for diferente de null
                current = current.getNext(); //inserir a frente até chegar onde o next do corrent seja null

            }
            current.setNext(novo); //liga o novo nó a lista 
            this.tail = novo; //o último elemento vai ser o que entrou o novo
        }
        this.count++; //incrementa

    }
   
    /**
     * Método para remover o primeiro elemento da lista
     */
    public void removeFirst(){  
        if (isEmpty()) { //se for vazia
            return;
        } else {
            head = head.getNext(); //remove o nó a cabeça
            this.count--; //reduz o numero de elementos
        }
    }
    
    /**
     * Método que remove o elemento armazenado no ultimo nó da lista
     */
    public void removeLast() {
        if (isEmpty()) {
            return;
        } else {
            Node<T> current = head;
            Node<T> nodeAux = head;
                     
            while (current.getNext() != null) { //enquanto o current.getNext for diferente de null
                nodeAux = current; //node auxiliar vai guardar a posição do current naquele momento
                current = nodeAux.getNext(); //cuurent vai ser igual a posição seguinte do current
            }
            nodeAux.setNext(null); //node auxiliar vai tomar o valor de null
            tail = nodeAux; // o ultimo vai ser igual ao node auxiliar isto é null 
      
            this.count--;
        }
    }

    /**
    * Método que remove o primeiro elemento igual ao valor pretendido 
    */
    public void remove(T value) {
        if (isEmpty()) {
            return; 
        }else {
            Node<T> current = head.getNext(); //current aponta para o seguinte
            Node<T> anterior = head; //current aponta para o anterior
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
