class Excep{
public static void main( String args[]) {
try {
try {
 int a[]= new int [5];
 a[5]=3;
 }
catch (Array indexOutofBoundsException e) 
{
  System.out.println(e);
}
}
catch (Exception e)
{
 System.out.println(" handle");
}
}
}