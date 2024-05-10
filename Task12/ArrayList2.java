package Task12;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create arraylist for strings
		ArrayList<String> al=new ArrayList<>();
		//add elements
		al.add("Cibhi");
		al.add("Rahul");
		al.add("Sarath");
		al.add("Vinith");
		//before removal
		System.out.println("Arraylist before removal: " +al);
		al.clear();
		//after removal
		System.out.println("Arraylist after removal: "+al);

	}

}
