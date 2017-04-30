package tpl;
import java.io.*;
import  java.util.*;
public class UserMainCode {

	public static String output1;
    
	
    public static void reverseWords_andCase(String input1,int input2){
    	String result="";
        if(input2 == 0){
        	String[] arr=input1.split(" ");
        	for(int i=0;i<arr.length;i++){
        		StringBuffer temp=new StringBuffer(arr[i]);
        		arr[i]=temp.reverse().toString();
        		result+=arr[i];
        		result+=" ";
        	}
        }
        else{
        	String[] arr=input1.split(" ");
        	for(int i=0;i<arr.length;i++){
        		String rev=new StringBuilder(arr[i]).reverse().toString().trim();
        		String cr="";
        		for(int j=0;j<rev.length();j++){
        			//boolean x=Character.isAlphabetic(arr[i].charAt(j));
        			if(arr[i].charAt(j)==',' || arr[i].charAt(j)==';' || arr[i].charAt(j)=='-' || arr[i].charAt(j)=='/' || arr[i].charAt(j)==':' || arr[i].charAt(j)=='.'){
        				cr+=rev.charAt(j);
        				
        			}
        			else{
        				cr+=Character.isUpperCase(arr[i].charAt(j))?Character.toUpperCase(rev.charAt(j)):Character.toLowerCase(rev.charAt(j));
        			}
        			
        		}
        		result+=cr.trim();
        		result+=" ";
        	}
        }
        output1=result.trim();
        System.out.println(output1);
    }	
}
