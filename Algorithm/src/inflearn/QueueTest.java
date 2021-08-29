package inflearn;

import java.util.NoSuchElementException;

class Queue<T>{
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data; //생성자에서 해당 타입의 데이터를 받아서 내부변수에 저장
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	
	
	public void add(T item) {
		Node<T> t= new Node<T>(item); // T타입의 아이템을 받아서 노드를 하나 생성한다.
		
		if(last != null ) {//마지막 노드가 있다면
			last.next=t;//그 뒤에 새로 생성한 노드 붙이기
		}
		last =t;//t가 마지막노드일때
		if(first==null) { //데이터가 없으면
			first = last; //같은값을 할당
		}		
	}
	
	
	public T remove() {
		if(first == null) {//큐가 비어있으면 
			throw new NoSuchElementException(); // 익셉션에러를 던진다.
		}
		T data = first.data; //맨 앞에있는애를 반환하기전에 그 다음 주자에 있는애를 first로 만들어준다.
		first = first.next;
		
		if(first  == null) { //첫번쨰가 널일떄, 라스트를 널로 변경해준다
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
		
		System.out.println(q.remove());//꺼내기 1
		System.out.println(q.remove());//꺼내기 2
		System.out.println(q.peek());//보기 3
		System.out.println(q.remove());//꺼내기 3
		System.out.println(q.isEmpty());//비었는지 확인 false
		System.out.println(q.remove());//4
		System.out.println(q.isEmpty());//비었는지 확인 true
	} 

}
