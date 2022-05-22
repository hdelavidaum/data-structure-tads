//import pilha.Pilha;
//import fila.Fila;
import lista.Lista;

public class Main {
	public static void main(String[] args) {
//		Pilha stack = new Pilha();
//		stack.printStack();
//		stack.addToStack(10);
//		stack.addToStack(20);
//		stack.addToStack(30);
//		stack.addToStack(40);
//		stack.addToStack(50);
//		stack.addToStack(60);
//		stack.addToStack(70);
//		stack.addToStack(80);
//		stack.addToStack(90);
//		stack.addToStack(100);
//		stack.addToStack(110);
//		stack.printStack();
//		
//		System.out.println("-----");
//		
//		stack.removeFromStack();
//		stack.removeFromStack();
//		stack.removeFromStack();
//		stack.removeFromStack();
//		stack.removeFromStack();
//		stack.removeFromStack();
//		stack.removeFromStack();
//		stack.removeFromStack();
//		stack.removeFromStack();
//		stack.removeFromStack();
//		stack.removeFromStack();
//		stack.printStack();
		
//		Fila queue = new Fila();
//		
//		queue.add(1);
//		queue.add(2);
//		queue.add(3);
//		queue.add(4);
//		queue.add(5);
//		queue.add(6);
//		queue.add(7);
//		queue.add(8);
//		queue.add(9);
//		queue.add(10);
//		queue.add(11);
//		queue.print();
//		System.out.println("-----");
//		System.out.println("-----");
//		
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		System.out.println("========");
//		
//		queue.print();
		
		
		Lista list = new Lista();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		
		list.print();
		System.out.println("-----");
		System.out.println("-----");
		
		list.removeLast();
		list.print();
		System.out.println("-----");
		System.out.println("-----");
		
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		
		list.print();
		System.out.println("-----");
		System.out.println("-----");
		
		list.remove(list.search(4));
		list.print();
		System.out.println("-----");
		System.out.println("-----");
		
		list.addAfter(list.search(3), 0);
		list.print();
		System.out.println("-----");
		System.out.println("-----");
		
		System.out.println("END GAME");
	}
}
