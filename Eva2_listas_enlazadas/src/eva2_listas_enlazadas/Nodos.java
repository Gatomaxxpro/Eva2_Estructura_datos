/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_listas_enlazadas;

/**
 *
 * @author invitado
 */
public class Nodos {

    private int valor;
    private Nodos previo;
    private Nodos siguiente;

    // Constructor sin parámetros
    public Nodos() {
        siguiente = null;  // No hay nodo siguiente
        previo = null;     // No hay nodo previo
    }

    // Constructor con un valor y un nodo siguiente
    public Nodos(int valor) {
        this.valor = valor;
        this.siguiente = null;  // El siguiente es null porque este es el último nodo por ahora
        this.previo = null;     // El previo es null porque aún no hay nodo previo
    }

    // Constructor con un valor, un nodo previo y un nodo siguiente
    public Nodos(int valor, Nodos previo, Nodos siguiente) {
        this.valor = valor;
        this.previo = previo;   // Establecemos el nodo previo
        this.siguiente = siguiente; // Establecemos el nodo siguiente
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos siguiente) {
        this.siguiente = siguiente;
    }

    public Nodos getPrevio() {
        return previo;
    }

    public void setPrevio(Nodos previo) {
        this.previo = previo;
    }
}