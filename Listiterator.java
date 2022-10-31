package javapackage;
import java.util.*;
public class Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("Amit");
		al.add("vijay");
		al.add("manju");
		System.out.println(al.get(2));
		ListIterator<String> itr= al.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
