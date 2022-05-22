package lista;

public class Lista {

	private Node firstItem;
		
	public Lista()
	{
		this.firstItem = null;
	};
	
	public boolean isEmpty() {
		return this.firstItem == null;
	};
	
	public void addFirst(int value) {
		Node temp = new Node();
		temp.setData(value);
		temp.setNext(this.firstItem);
		this.firstItem = temp;
	};
	
	public void addLast(int value) {
		if (this.isEmpty()) {
			this.addFirst(value);
		} else {
			Node temp = this.firstItem;
			
			while(temp != null && temp.getNext() != null) {
				temp = temp.getNext();
			}
			
			if (temp.getNext() == null) {
				Node newTemp = new Node();
				newTemp.setData(value);
				temp.setNext(newTemp);
			}
		}
	}
	
	public void addAfter(Node node, int value) {
		Node temp = this.firstItem;
		Node newTemp = new Node();
		
		while(temp.getNext() != null) {

			if(temp.getData() == node.getData()) {
				newTemp.setData(value);
				newTemp.setNext(temp.getNext());
				temp.setNext(newTemp);
				break;
			}
			temp = temp.getNext();
		}
		
	}
	
	public void removeFirst() {
		this.firstItem = this.firstItem.getNext();
	}
	
	public void removeLast() {
		Node temp = this.firstItem;
		Node nextTemp = temp.getNext();
		
		while(nextTemp != null) {
			if(nextTemp.getNext() == null) {
				temp.setNext(null);
			}

			temp = nextTemp;
			nextTemp = nextTemp.getNext();
		}
	}
	
	public void remove(Node node) {
		Node temp = this.firstItem;
		Node nextTemp = temp.getNext();
		
		while (nextTemp != null) {
			
			if (nextTemp.getData() == node.getData()) {
				temp.setNext(nextTemp.getNext());
				break;
			}
			temp = nextTemp;
			nextTemp = nextTemp.getNext();		
		}
	}
	
	public Node search(int value) {
		Node temp = this.firstItem;
		
		while(temp != null && temp.getData() != value) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	public void print() {
		Node temp = this.firstItem;
		while (temp != null) {
			System.out.print(temp.getData() + ", ");
			temp = temp.getNext();
		}
	}

}
 