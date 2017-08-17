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
public abstract class Busquedas 
{
    //Variables
    int[] vector;
    //Methods
    public void setV (int v) //Fills this class's vector with random numbers, receives the desired size of the array
    {
        vector = new int[v];
        for (int i=0; i<v-1;i++)
        {
            vector[i] = (int) (Math.random()*100); //Generates a random number and fills up every array number.
        }
    }   
    public void setV(int [] vector) //Fills this class's vector with a predefined vector
    {
        this.vector = vector; 
    }
    public int[] getV() //Returns this class's vector
    {
        return this.vector;
    }
    public void showV() //Prints all of the items withing the vector.
    {
        for(int i=0;i<this.vector.length;i++)
        {
            System.out.print(this.vector[i]+", ");
        }
    }
    public void showF (int n) //Prints the position where the item to find is located.
    {
        if(n!=-1)
        {
            System.out.println("El valor se encuentra en la posición "+n);       
        }
        else
        {
            System.out.println("El valor no se encuentra en el vector");
        }
    }
    //Abstract method
    public abstract int Search (int item); 
}
