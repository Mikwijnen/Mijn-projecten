/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balh9.h10;

public class Bal extends AbstractBal implements Ventiel
{
    public Bal()
    {
        setSize(30);
    }
    
    public Bal(int Grootte)
    {
        setSize(Grootte);
    }
    
    
    @Override
    protected void setWeight(float weight)
    {
    }
    
    @Override
    protected float getWeight()
    {
          return size;
    }
    
    public void opblazen()
    {
        setSize(getSize() +2);
    }
    
    
}
