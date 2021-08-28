package inflearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class HashTable {
	//해시테이블에 담을 데이터를 노드에 저장한다.
	class Node{
		String key;
		String value;
		public Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
		//getter
		String value() {
			return value;
		}
		//setter
		void value(String value) {
			this.value = value;
		}
	}
	//데이터를 저장할 링크리스트를 배열로 선언
	LinkedList<Node>[] data;
	HashTable(int size){
		//배열방을 미리 만든다
		this.data = new LinkedList[size];
	}
	int getHashCode(String key) {
		int hashcode = 0;
		//입력받은 키, 문자열을 돌면서
		//각 레터에 아스키값을 가져와서 hashcode에 더해준다.
		for(char c:key.toCharArray()) {
			hashcode += c;
		}
		return hashcode;
	}
	//해시코드를 받아서 배열방에 인덱스로변환하는 함수
	int convertToIndex(int hashcode) {
		return hashcode % data.length;
		
	}
	Node searchKey(LinkedList<Node>list,String key) {
		//배열방이 널이면 널을 반환
		if(list==null) return null;
		//배열방에있는 리스트를 돌면서
			for(Node node:list) {
				//노드의 키가 검색하는 키와 같은지
				if(node.key.equals(key)) {
				return node;
				}
			}//같은데이터를 못찾았으면 널을 반환
			return null;
	}
	//데이터를 받아서 저장하는 함수
	void put(String key,String value) {
		//키를가지고 해시코드를 가져온다.
		int hashcode = getHashCode(key);
		//해시코드를 가지고 배열방번호를 가져온다
		int index = convertToIndex(hashcode);
		//기존의 배열방정보
		LinkedList<Node> list = data[index];
		//배열방이 널이면 링크드리스트를 생성
		if(list == null) {
			list = new LinkedList<Node>();
			data[index]=list;
		}//기존에 해당키로 데이터를 가지고있는지 노드로받아오기
		Node node = searchKey(list,key);
		if(node ==null) {
			list.addLast(new Node(key,value));
		}else {//해당 노드의값으로 대체
			node.value(value);
		}
	}
	String get(String key) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];
		Node node = searchKey(list,key);
		return node == null? "Not found":node.value();
	}
}

public class Test{
	public static void main(String[] args) {
		HashTable h = new HashTable(3);
		h.put("sung", "She is pretty");
		h.put("jin", "She is a model");
		h.put("hee", "She is an angel");
		h.put("min", "She is cute");
		h.put("sung", "She is beautiful");//beautiful로 업데이트
		System.out.println(h.get("sung"));
		System.out.println(h.get("jin"));
		System.out.println(h.get("hee"));
		System.out.println(h.get("min"));
		System.out.println(h.get("hwa"));//not foun
	}
}
