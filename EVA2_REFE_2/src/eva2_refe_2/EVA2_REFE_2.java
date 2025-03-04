/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_refe_2;

/**
 *
 * @author invitado
 */
public class EVA2_REFE_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ejemplo obj1=new Ejemplo();
       obj1.valor=1000;
       obj1.siguiente =new Ejemplo();
       obj1.siguiente.valor=200;
       obj1.siguiente.siguiente  =new Ejemplo();
       obj1.siguiente.siguiente.valor=300;
       obj1.siguiente.siguiente.siguiente=null;
       Ejemplo temp=obj1;
       while(temp!=null){
        System.out.print("["+temp.valor+"]");
        temp=temp.siguiente;
    }
    }
    
}
class Ejemplo{
    int valor;
    Ejemplo siguiente;
}