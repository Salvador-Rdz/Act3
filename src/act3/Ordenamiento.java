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
public interface Ordenamiento {
    public abstract void selection();
    public abstract void bubble();
    public abstract void insertion();
    public abstract void mergeSort(int inicio, int fin);
    public abstract void quickSort(int inicio, int fin);
}
