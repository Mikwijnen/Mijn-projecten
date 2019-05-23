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
public class Bier extends Drank
{
   private String kleur;
   
   public void setKleur(String kleur)
   {
       this.kleur = kleur;
   }
   
   public String getKleur()
   {
       return kleur;
   }
   
   public void print()
    {
        System.out.println("Merk: " + getMerk());
        System.out.println("Prijs: " + getPrijsFles());
        System.out.println("type: " + getVoorraad());
        System.out.println("kleur: " + getKleur());
    }
}