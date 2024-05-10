package Task12;

import java.util.TreeMap;
class Tree implements Comparable {
	String name;
	int id;
	Tree(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	//Defining the alphabetical order
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(((Tree) o).name);
	}
}

public class TreeMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a tree map to store employee id and name
		TreeMap<Tree, String> em=new TreeMap<>();
		//add employee id and name
		em.put((new Tree(01, "Cibhi")), "Cibhi");
		em.put((new Tree(02, "Rahul")), "Rahul");
		em.put((new Tree(03, "Sarath")), "Sarath");
		em.put((new Tree(04, "Vinith")), "Vinith");
		em.put((new Tree(05, "Arun")), "Arun");
		em.put((new Tree(06, "Mohan")), "Mohan");
		//print the name in alphabetical order
		System.out.println("Names of employee name in alphabetical order");
		for(String name:em.values()) {
			
			System.out.println(name);
		}

	}

}
