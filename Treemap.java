package javapackage;
import java.util.*;
public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  TreeMap<Integer,String > map= new TreeMap<Integer,String>();
		  map.put(100,"manju");
		  map.put(29,"hi");
		  map.put(19,"jai");
		  System.out.println(map.headMap(29,true));
		  System.out.println(map.headMap(100));
		  
	}

}
