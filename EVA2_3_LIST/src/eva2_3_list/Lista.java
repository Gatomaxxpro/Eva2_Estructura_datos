/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_list;

/**
 *
 * @author invitado
 */
public class Lista {
     private Nodo inicio;
     private Nodo fin;
    public Lista (){
        inicio=null;//No hay nodos en la lista
         fin =null;
         
    }
    //agregar un nodo al final de la lista
    public void add(int valor){
        //AGREGAR UN NODO
        Nodo nuevo = new Nodo(valor); 
     
        // Y si la lista esta vacia?
            if (inicio==null){
                inicio=nuevo;
                fin =nuevo;
            }else{
                
                //MOVERNOS ASTA EL UILTIMO NODO
                /*Nodo temp =inicio;
                while(temp.getSiguiente()!=null){
                    //COMO ME MUEVO AL SIGUIENTE NODO?
                    temp=temp.getSiguiente();
                }
                //temp ya se encuentra en el ultimo nodo
                temp.setSiguiente(nuevo);*/
                //conctamos
                fin.setSiguiente(nuevo);
                //movemos fin al nuevo nodo (nuevo nodo)
                   fin=nuevo;
               
            } 
                
        }
    public void printList(){
       Nodo temp=inicio;
       while (temp!=null){
           System.out.println("["+temp.getValor()+"]");
           temp=temp.getSiguiente();
       }
    } 
}
