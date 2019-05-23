package balh9.h10;

public abstract class AbstractBal
{
	
	protected int size; //grootte in cm
	
	protected void setSize(int size)
	{
		this.size = size;
	}
	
	protected int getSize()
	{
		return size;
	}
	
	protected abstract void setWeight(float weight);
	protected abstract float getWeight();
	
}
