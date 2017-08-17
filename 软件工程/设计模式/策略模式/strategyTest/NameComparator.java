

import java.util.Comparator;

public class NameComparator implements Comparator<Person>{
	public int compare(Person p1,Person p2){
		if( p1.getName().equals(p2.getName())){
			return p1.getID()-p2.getID();
		}else{
			return p1.getName().compareTo(p2.getName());
		}
	}
}