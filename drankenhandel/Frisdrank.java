/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drankenhandel;

/**
 *
 * @author Gebruiker
 */
public class Frisdrank extends Drank
{
    private int suikerpercentage;
    
    public void setSuikerpercentage(int suikerpercentage)
    {
        this.suikerpercentage = suikerpercentage;
    }
    
    public int getSuikerpercentage()
    {
        return suikerpercentage;
    }
    
    public void print()
    {
        System.out.println("Merk: " + getMerk());
        System.out.println("Prijs: " + getPrijsFles());
        System.out.println("Type: " + getVoorraad());
        System.out.println("Suiker: " +getSuikerpercentage());
    }
}
