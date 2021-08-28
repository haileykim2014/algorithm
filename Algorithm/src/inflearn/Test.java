package inflearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class HashTable {
	//�ؽ����̺� ���� �����͸� ��忡 �����Ѵ�.
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
	//�����͸� ������ ��ũ����Ʈ�� �迭�� ����
	LinkedList<Node>[] data;
	HashTable(int size){
		//�迭���� �̸� �����
		this.data = new LinkedList[size];
	}
	int getHashCode(String key) {
		int hashcode = 0;
		//�Է¹��� Ű, ���ڿ��� ���鼭
		//�� ���Ϳ� �ƽ�Ű���� �����ͼ� hashcode�� �����ش�.
		for(char c:key.toCharArray()) {
			hashcode += c;
		}
		return hashcode;
	}
	//�ؽ��ڵ带 �޾Ƽ� �迭�濡 �ε����κ�ȯ�ϴ� �Լ�
	int convertToIndex(int hashcode) {
		return hashcode % data.length;
		
	}
	Node searchKey(LinkedList<Node>list,String key) {
		//�迭���� ���̸� ���� ��ȯ
		if(list==null) return null;
		//�迭�濡�ִ� ����Ʈ�� ���鼭
			for(Node node:list) {
				//����� Ű�� �˻��ϴ� Ű�� ������
				if(node.key.equals(key)) {
				return node;
				}
			}//���������͸� ��ã������ ���� ��ȯ
			return null;
	}
	//�����͸� �޾Ƽ� �����ϴ� �Լ�
	void put(String key,String value) {
		//Ű�������� �ؽ��ڵ带 �����´�.
		int hashcode = getHashCode(key);
		//�ؽ��ڵ带 ������ �迭���ȣ�� �����´�
		int index = convertToIndex(hashcode);
		//������ �迭������
		LinkedList<Node> list = data[index];
		//�迭���� ���̸� ��ũ�帮��Ʈ�� ����
		if(list == null) {
			list = new LinkedList<Node>();
			data[index]=list;
		}//������ �ش�Ű�� �����͸� �������ִ��� ���ι޾ƿ���
		Node node = searchKey(list,key);
		if(node ==null) {
			list.addLast(new Node(key,value));
		}else {//�ش� ����ǰ����� ��ü
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
		h.put("sung", "She is beautiful");//beautiful�� ������Ʈ
		System.out.println(h.get("sung"));
		System.out.println(h.get("jin"));
		System.out.println(h.get("hee"));
		System.out.println(h.get("min"));
		System.out.println(h.get("hwa"));//not foun
	}
}
