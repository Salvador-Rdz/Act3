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
public class Binaria extends Busquedas
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
    
}
