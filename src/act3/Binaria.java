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
public class Binaria extends Busquedas implements Ordenamiento
{

    @Override
    public int Search(int item) 
    {
        //Variables
        int inicio, centro, fin;
        int valorCentro;
        quicksort(0,vector.length-1);
        inicio = 0; fin = vector.length-1;
        centro = (inicio + fin)/2;
        //While the starting value of the setup is lower than the final position of the vector
        while(inicio < fin)
        {
            valorCentro=vector[centro]; //Gets the current value of the center of the vector
            if(valorCentro == item) //Checks if
            {
                return centro;
            }
            else
            {
                if(item < valorCentro)
                {
                    fin = centro;
                    centro = (inicio + fin)/2;
                }
                else
                {
                    inicio = centro;
                    centro = (inicio + fin)/2;
                }
            }
        }
        return -1;
    }

    @Override
    public void seleccion() //Sorts the values in an array usin the selection algorithm
    {
        int auxiliar; //dummy variable 
        for (int i = 0; i < vector.length - 1; i++) 
        { 
            int m = i; 
            for (int j = i + 1; j < vector.length; j++) 
            { 
              if (vector[j] < vector [m]) //checks if the lowest index is equal to the next index
              { 
                  m = j;
              }
            }
            //updates the array values
            auxiliar = vector[i];
            vector[i]=vector[m];
            vector[m]=auxiliar;
        }
    }
    
    public void intercambio(int p1, int p2)
    {
        int tmp=vector[p1];
        vector[p1]=vector[p2];
        vector[p2]=tmp;
    }
    public void quicksort(int inicio, int fin)
    {
        int i, j, pivot;
        i=inicio;j=fin;
        pivot=vector[(i+j)/2];
        do
        {
            while(vector[i]<pivot)
            {
                i++;
            }
            while(vector[j]<pivot)
            {
                j--;
            }
            if(i<=j)
            {
                intercambio(i,j);
                i++;j--;
            }
        }
        while(i<=j);
        if(inicio<j)
        {
            quicksort(inicio, j);
        }
        if(i < fin)
        {
            quicksort(i, fin);
        }
    }
    
}
