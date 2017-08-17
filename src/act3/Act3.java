/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act3;

/**
 *
 * @author Salvador
 */
public class Act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vect = {4,15,63,13,35,24,11}; //Se genera un arreglo en orden para que la busqueda binaria funcione
        Secuencial sec = new Secuencial();
        sec.setV(vect);
        sec.showV();
        System.out.println();
        sec.showF(sec.Search(13));
        Binaria bin = new Binaria();
        bin.setV(vect);
        int b = bin.Search(35);
        bin.showV();        
        bin.showF(b);
    }
    
}
