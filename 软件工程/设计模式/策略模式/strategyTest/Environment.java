

import java.util.*;


/**
 * 1.利用Collections.sort(...,Comparator<E> comparator)排序
 * 2.Comparator作为抽象策略接口
 * 3.抽象策略类：定义一个抽象类实现Comparator接口
 * 4.具体策略类：然后分别定义具体策略类的行为，即Comparator的规则
 * 5.环境角色：在环境角色中对传进来的List<Person>进行排序
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
	
	public void sort(List<Person> list,Comparator<Person> com){ //形参不能当实参用
		Collections.sort(list,com);
	}
	
	
} 