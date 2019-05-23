package drankenhandel;

import java.util.ArrayList;

public class Drankenhandel
{

    public static void main(String[] args)
    {
        
        ArrayList<Frisdrank> fd;
        fd = new ArrayList<>();
        
        ArrayList<Bier> br;
        br = new ArrayList<>();
        
        ArrayList<Likeur> lk;
        lk = new ArrayList<>();
       
        
        for(int i = 1; i <=1; i++)
            {                
                Frisdrank frisdrank = new Frisdrank();
                frisdrank.setSuikerpercentage(20);
                frisdrank.setMerk("Pepsi");
                frisdrank.setPrijsFles(1);
                frisdrank.setVoorraad("Frisdrank");
                
                Bier bier = new Bier();
                bier.setKleur("licht");
                bier.setMerk("Grolsch");
                bier.setPrijsFles(5);
                bier.setVoorraad("bier");
                
                Likeur likeur = new Likeur();
                likeur.setLand("Kanarische eilanden");
                likeur.setMerk("Licor");
                likeur.setPrijsFles(10);
                likeur.setVoorraad("Likeur");
                
                fd.add(frisdrank);
                br.add(bier);
                lk.add(likeur);
            }
        
        for(Frisdrank frisdrank : fd)
            {
                    frisdrank.print();
                    
            }
        
        for(Bier bier : br)
            {
                    bier.print();
                    
            }
        
        for(Likeur likeur : lk)
            {
                    likeur.print();
                    
            }
        
        
        
    }
    
}
