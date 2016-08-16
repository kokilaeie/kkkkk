import java.io.*;
import java.util.*;
class rev
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
StringBuffer sb=new StringBuffer(s.next());
StringBuffer sb=new StringBuffer(s.reverse());
System.out.println(sb);
StringBuffer sb2=new StringBuffer(aeiou);
for(int i=0;i<sb2.length;i++)
{
for(int j=0;j<sb.length;j++)
{
if(sb.charAt(i)==sb2.charAt(j))
{
sb.deletecharAt(j);
}
}
}
System.out.println(sb);
}
}


