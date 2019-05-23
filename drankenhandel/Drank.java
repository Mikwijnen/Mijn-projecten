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
public class Drank
{
    private int prijsfles;
    private String merk;
    private String voorraad;
    
    public void setPrijsFles(int prijsfles)
    {
        this.prijsfles = prijsfles;
    }
    
    public int getPrijsFles()
    {
        return prijsfles;
    }

    public void setMerk(String merk)
    {
        this.merk = merk;
    }
    
    public String getMerk()
    {
        return merk;
    }
    
    public void setVoorraad(String voorraad)
    {
        this.voorraad = voorraad;
    }
    
    public String getVoorraad()
    {
        return voorraad;
    }
    
    
    
}
