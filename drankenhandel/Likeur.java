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
public class Likeur extends Drank
{
    public String land;
    
    public void setLand(String land)
    {
        this.land = land;
    }
    
    public String getLand()
    {
        return land;
    }
    
    public void print()
    {
        System.out.println("Merk: " + getMerk());
        System.out.println("prijs: " + getPrijsFles());
        System.out.println("Type: " + getVoorraad());
        System.out.println("Land: " + getLand());
    }
}
