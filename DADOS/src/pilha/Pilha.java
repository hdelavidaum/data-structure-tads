package pilha;

public class Pilha {
	public int stack[];
	public int position;
	
	public Pilha ()
	{
		this.stack = new int[10];
		this.position = -1;
	};

	public boolean isEmptyStack ()
	{
		return this.position < 0;
	};
	
	public boolean isFilledStack ()
	{
		return this.position >= this.stack.length - 1;
	};
	
	public void addToStack (int value)
	{
		if (!this.isFilledStack())
		{
			this.position++;
			this.stack[position] = value;
		};
	};
	
	public void removeFromStack ()
	{
		if(!this.isEmptyStack())
		{
			this.stack[this.position] = 0;
			this.position--;
		};
	};
	
	public void printStack ()
	{
		if(this.isEmptyStack()) {
			System.out.println("The stack is empty");
		}
		else 
		{
			for (int i = this.stack.length - 1; i >= 0; i--)
			{
				if (this.stack[i] != 0)
				{
					System.out.println("|" + this.stack[i] + "|");
				}
			}
		}
		
	}
	
}
