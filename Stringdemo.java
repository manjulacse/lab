package javapackage;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1= "manjula";
String s2= "devi";
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println(s1.toUpperCase());
System.out.println(s2.toLowerCase());
System.out.println(s1.charAt(0));
System.out.println(s1.concat(s2));
System.out.println(s1.replace('m', 'a'));
System.out.println(s1.compareTo(s2));
System.out.println(s1.substring(4));
System.out.println(s1.trim());
System.out.println(s1.startsWith("m"));
System.out.println(s2.endsWith("i"));
String[] s3= s1.split("");

for(String i: s3) {
	System.out.println(i+ " ");
}

	}

}
