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
public class Secuencial extends Busquedas //Inherits from the abstract class "Busquedas"
{
    @Override
    public int Search(int item) //Receives the item to find
    {
        for(int i=0;i<vector.length-1;i++) //Searches manually through all of the items in the vector
        {
            if(vector[i] == item)
            {
                return i;
            }
        }
        return -1;
    }
}
