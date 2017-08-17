
import java.util.*;

public class Client{
	public static void main(String[] args){
		List<Person> list = new ArrayList<>();
		list.add(new Person(2,"A",11));
		list.add(new Person(3,"A",11));
		list.add(new Person(1,"A",10));
		list.add(new Person(5,"C",13));
		list.add(new Person(6,"C",13));
		list.add(new Person(4,"E",12));
		
		System.out.println(list);
		new Environment().sort(list, new IDComparator());
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		new Environment().sort(list, new NameComparator());
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		new Environment().sort(list, new AgeComparator());
		System.out.println(list);
		
//		Environment env = new Environment(list,new IDComparator());
//		System.out.println(list);
//		env.sort(list,new IDComparator());
//		System.out.println(list);
//		env.sort(list,new NameComparator());
//		System.out.println(list);
//		env.sort(list,new AgeComparator());
//		System.out.println(list);
		
		
	}
}