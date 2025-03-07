

package eva2_3_list;


public class Nodo {
    private int valor;
    private Nodo siguiente;
    
    public Nodo(){
        siguiente=null;//No hay nodo mas adelante (ultimo)
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    
}
