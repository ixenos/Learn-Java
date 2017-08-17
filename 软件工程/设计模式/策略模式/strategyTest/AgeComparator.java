

import java.util.Comparator;

public class AgeComparator implements Comparator<Person>{
	public int compare(Person p1,Person p2){
		if( p1.getAge() == p2.getAge() ){
			return p1.getID()-p2.getID();
		}else{
			return  (Integer.valueOf(p1.getAge())).compareTo(Integer.valueOf(p2.getAge()));
		}
	}
}