import java.util.Arrays;
import java.util.Scanner;


public class prestring {

	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();
		char p,t;
		int c=Integer.parseInt(s.nextLine());
		int d=Integer.parseInt(s.nextLine());
		String ans="";
		String arr[]=new String[2];
		arr[0]=a;
		arr[1]=b;
		Arrays.sort(arr);
		if(a.length()>b.length())
		{
		ans=ans+a.charAt(0)+b;
		String x=String.valueOf(c);
		p=x.charAt(d-1);
		t=x.charAt(x.length()-d);
		ans=ans+p+t;
		}
		else if(a.length()<b.length())
		{
			ans=ans+b.charAt(0)+a;
			String x=String.valueOf(c);
			p=x.charAt(d-1);
			t=x.charAt(x.length()-d);
			ans=ans+p+t;
		}
		else if(a.length()==b.length())
		{
			ans=ans+arr[0].charAt(0)+arr[1];
			String x=String.valueOf(c);
			p=x.charAt(d-1);
			t=x.charAt(x.length()-d);
			ans=ans+p+t;
		}
System.out.println(ans);
String o="";
	char h[]=ans.toCharArray();
	for(int i=0;i<ans.length();i++)
	{
		if(Character.isUpperCase(h[i]))
		{
			o+=Character.toLowerCase(h[i]);
		}
		else if(Character.isLowerCase(h[i]))
		{
			o+=Character.toUpperCase(h[i]);
		}
		else
		{
			o+=String.valueOf(h[i]);
		}

	}
	System.out.println(o);
			}

}
