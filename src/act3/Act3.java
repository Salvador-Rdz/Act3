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
        int [] vect = {1,2,3,4,5,6,7,8,9,10,12}; //Se genera un arreglo en orden para que la busqueda binaria funcione
        Secuencial sec = new Secuencial();
        sec.setV(vect);
        sec.showF(sec.Search(1));
        Binaria bin = new Binaria();
        bin.setV(vect);
        bin.showF(bin.Search(4));
        
    }
    
}
