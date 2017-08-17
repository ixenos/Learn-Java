

import java.util.*;


/**
 * 1.����Collections.sort(...,Comparator<E> comparator)����
 * 2.Comparator��Ϊ������Խӿ�
 * 3.��������ࣺ����һ��������ʵ��Comparator�ӿ�
 * 4.��������ࣺȻ��ֱ��������������Ϊ����Comparator�Ĺ���
 * 5.������ɫ���ڻ�����ɫ�жԴ�������List<Person>��������
 */
public class Environment{
	private Comparator<Person> com;
	private List<Person> list;
	
	public Environment(){
		
	}
	
	public Environment(List<Person> list,Comparator<Person> com){
		this.list = list;
		this.com = com;
	}
	
	public void setPSort(Comparator<Person> com){
		this.com = com;
	}
	
	public void sort(List<Person> list,Comparator<Person> com){ //�ββ��ܵ�ʵ����
		Collections.sort(list,com);
	}
	
	
} 