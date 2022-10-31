public class FileOutput {
public static void main (String args[]) {
try {
 FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
String s= "welcome";
byte[] b= s.getBytes();
fout.write(b);
}
catch ( Exception e)
{
System.out.println(e);
}
}
}