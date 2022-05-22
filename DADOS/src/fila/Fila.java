package fila;

public class Fila {
	
	private int start;
	private int end;
	private int[] queue;
	
	public Fila ()
	{
		this.start = -1;
		this.end = -1;
		this.queue = new int[10];
	}
	
	public boolean isEmpty()
	{
		return this.start == -1;
	}
	
	public boolean isFilled()
	{
		return this.end >= 9;
	}
	
	public void add(int value)
	{
		if (this.start == -1)
		{
			this.start = 0;
		}
		
		if(!this.isFilled())
		{
			this.end++;
			this.queue[this.end] = value;
		}
		else
		{
			System.out.println("Queue is full");
		}
	}
	
	public void remove()
	{
		if (!this.isEmpty())
		{
			for(int i = 0; i < this.end; i++)
			{
				this.queue[i] = this.queue[i+1];
			}
			
			this.end--;
			
			if (this.end == -1)
			{
				this.start--;
			}
		}
		else
		{
			System.out.println("Queue is empty!");
		}
	}
	
	public void print()
	{
		if(this.isEmpty())
		{
			System.out.println("The queue is empty!");
		}
		else
		{
			for (int i = 0; i <= this.end; i++)
			{
				System.out.print(this.queue[i] + " <- ");
			}
		}
	}
	
}
