    /*
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
    public void selection() //Sorts the values in an array using the selection algorithm
    { 
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
            intercambio(i, m);
        }
    }
    
    public void intercambio(int p1, int p2) //function used to switch two values in this class's array.
    {
        int tmp=vector[p1];
        vector[p1]=vector[p2];
        vector[p2]=tmp;
    }
    @Override
    public void quickSort(int inicio, int fin) //Sorts the values in an array using the quicksort algorithm
    {
        int i, j, pivot;
        i=inicio;j=fin;
        pivot=vector[inicio];
        do //while the start and end don't cross
        {
            //Moves throughout the vector comparing the values with the pivot, moving one by one, forwards or backwards
            while(vector[i]<=pivot && i<j)
            {
                i++;
            }
            while(vector[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                intercambio(j,i); //Uses the swap function to exchange the values
                i++;j--;
            }
        }
        while(i<=j); 
        vector[inicio] = vector[j];
        vector[j] = pivot;
        //Uses recursivity to sort all of the values set by set
        if(inicio<j-1)
        {
            quickSort(inicio, j-1);
        }
        if(i < fin)
        {
            quickSort(j+1, fin);
        }
    }

    @Override
    public void mergeSort(int inicio, int fin) //Sorts the values in an array using the mergeSort algorithm
    {
        if(fin-inicio == 0 || fin - inicio == 1) //if the current evaluated list is of size 0 or 1, it means its already sorted.
        {
            
        }
        else
        {
            int pivote = (inicio + fin)/2;
            mergeSort(inicio, pivote);
            mergeSort(pivote, fin);
            int p1 = inicio;
            int p2 = pivote;
            int p3 = 0;
            //an auxiliary array is created to save the in-order lists.
            int [] listaAux = new int[fin-inicio]; 
            //Moves throughout the pivots and points, while checking the value of each point.
            while(p1<pivote || p2<fin) 
            {
                if(p1<pivote && p2<fin)
                {
                    if(this.vector[p3++]<this.vector[p2++])
                    {
                        listaAux[p3++] = this.vector[p1++]; //In case they're smaller, they're swapped. 
                    }
                    else
                    {
                        listaAux[p3++] = this.vector[p2++];
                    }
                }
                else if (p1<pivote)
                {
                    listaAux[p3++] = listaAux[p1++];
                }
                else
                {
                    listaAux[p3++] = listaAux[p2++];
                }
            }
            for(int i=0; i<fin-inicio;i++)
            {
                this.vector[inicio+i] = listaAux[i];
            }
        }
    }

    @Override
    public void bubble() //Sorts the values in an array using the bubble algorithm
    {
        for(int i=0;i<this.vector.length-1;i++)
        {
            for(int j=0;j<this.vector.length-i-1;j++)
            {
                if(this.vector[j+1]<this.vector[j]) //checks if the next value is smaller than the current value
                {
                   intercambio(j+1,j); //Uses a predefined function to swap out values
                }
            }
        }
    }

    @Override
    public void insertion() //Sorts the values in an array using the insertion algorithm
    {
        int tmp;
        int j = 0;
        for(int i =1;i<this.vector.length-1;i++)
        { 
          tmp=this.vector[i];  
          i--;      
          while((j>=0)&&(this.vector[j]>tmp)) //moves throughout the index backwards while checking if the current value is higher than the vector of reference
          {  
            this.vector[j+1]=this.vector[j]; //Swaps the values on the left with the ones on the right
            j--;
          }
        this.vector[j+1]=tmp;   
       }
    }
    
}
