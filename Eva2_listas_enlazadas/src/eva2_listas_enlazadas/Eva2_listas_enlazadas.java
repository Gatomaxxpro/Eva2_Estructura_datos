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
public class Eva2_listas_enlazadas {

  
        public static void main(String[] args) {
        
       

        int datos[] = new int[10000000]; // Utilicé 10 millones en lugar de 1000000000

        long ini = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            datos[i] = (int) (Math.random() * 10000);
        }
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println("Tiempo arreglo: " + tiempo);

        ///////////////////////////////////////////////////

        ListasDoble lista = new ListasDoble();
        ini = System.nanoTime();
        for (int i = 0; i < 10000000; i++) { // También aquí reduje el número de iteraciones
            lista.add((int) (Math.random() * 10000)); // Corregí la forma de multiplicar el random
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("Tiempo lista: " + tiempo);

    }
}
    

    

