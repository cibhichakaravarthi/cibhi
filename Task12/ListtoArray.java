package Task12;

import java.util.ArrayList;
import java.util.List;

public class ListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a list
		List<String> l=new ArrayList<>();
		l.add("Cibhi");
		l.add("Rahul");
		l.add("Sarath");
		l.add("Vinith");
		//convert list to array
		String[] array=l.toArray(new String[0]);
		//print the elements of the array
		System.out.println("Array Elements: ");
		for(String name:array) {
			System.out.println(name);
		}

	}

}
