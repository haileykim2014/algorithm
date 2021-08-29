package inflearn;

import java.util.NoSuchElementException;

class Queue<T>{
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data; //�����ڿ��� �ش� Ÿ���� �����͸� �޾Ƽ� ���κ����� ����
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	
	
	public void add(T item) {
		Node<T> t= new Node<T>(item); // TŸ���� �������� �޾Ƽ� ��带 �ϳ� �����Ѵ�.
		
		if(last != null ) {//������ ��尡 �ִٸ�
			last.next=t;//�� �ڿ� ���� ������ ��� ���̱�
		}
		last =t;//t�� ����������϶�
		if(first==null) { //�����Ͱ� ������
			first = last; //�������� �Ҵ�
		}		
	}
	
	
	public T remove() {
		if(first == null) {//ť�� ��������� 
			throw new NoSuchElementException(); // �ͼ��ǿ����� ������.
		}
		T data = first.data; //�� �տ��ִ¾ָ� ��ȯ�ϱ����� �� ���� ���ڿ� �ִ¾ָ� first�� ������ش�.
		first = first.next;
		
		if(first  == null) { //ù������ ���ϋ�, ��Ʈ�� �η� �������ش�
			last =null;
		}
		return data;
	}
	
	public T peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}


public class QueueTest {
	public static void main(String[] args) {
		
		Queue<Integer> q = new Queue<Integer>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println(q.remove());//������ 1
		System.out.println(q.remove());//������ 2
		System.out.println(q.peek());//���� 3
		System.out.println(q.remove());//������ 3
		System.out.println(q.isEmpty());//������� Ȯ�� false
		System.out.println(q.remove());//4
		System.out.println(q.isEmpty());//������� Ȯ�� true
	} 

}
