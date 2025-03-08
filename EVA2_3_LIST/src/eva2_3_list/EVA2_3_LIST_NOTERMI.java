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
public class EVA2_3_LIST_NOTERMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       

        int datos[] = new int[10000000];

        long ini = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            datos[i] = (int) (Math.random() * 10000);
        }
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println("Tiempo arreglo:" + tiempo);

        
        ///////////////////////////////////////////////////
      
       Lista lista =new Lista();
        ini = System.nanoTime();
        for (int i = 0; i < 1000000000; i++) {
            lista.add((int) Math.random() * 10000);

        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("Tiempo lista:" + tiempo);
           

    }
    
}
