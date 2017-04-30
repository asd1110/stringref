package tpl;
import java.io.*;
import java.util.*;
public class UserMainCode2 {
	public static int output1;
    
	
    public static void LargestPossiblePalin(String input1){
        String s1=input1.toLowerCase();
        int wn=0;
        int flag=0;
        for(int i=0;i<s1.length();i++){
        	int count=1;
        	for(int j=i+1;j<s1.length();j++){
        		if(s1.charAt(i) == s1.charAt(j)){
        			count++;
        			s1=s1.substring(0, j)+s1.substring(j+1,s1.length());
        		}
        	}
        	if(count%2==0){
        		wn+=count;
        	}
        	else{
        		if(count==1){
        			flag=1;
        		}
        		else{
        			wn+=(count/2)*2;
        			flag=1;
        		}
        	}
        	System.out.println(s1.charAt(i)+":"+count);
        }
        if(flag == 1){
    		wn+=1;
    	}
        if(wn == 1){
        	wn*=-1;
        }
        output1=wn;
    	System.out.println("result:"+output1);
    }
    
    

}
