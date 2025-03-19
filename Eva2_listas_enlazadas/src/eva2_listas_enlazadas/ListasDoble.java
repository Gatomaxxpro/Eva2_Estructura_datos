/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_listas_enlazadas;

public class ListasDoble {
    private Nodos inicio;
    private Nodos fin;

    public ListasDoble() {
        inicio = null; // No hay nodos en la lista
        fin = null;
    }

    // Agregar un nodo al final de la lista
    public void add(int valor) {
        // Crear un nuevo nodo
        Nodos nuevo = new Nodos(valor);

        // Si la lista está vacía
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            // Conectamos el nodo al final de la lista
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin); // Conectamos el nodo previo
            fin = nuevo; // Movemos el fin al nuevo nodo
        }
    }

    // Método para imprimir la lista
    public void printList() {
        Nodos temp = inicio;
        while (temp != null) {
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
    }
}
    



