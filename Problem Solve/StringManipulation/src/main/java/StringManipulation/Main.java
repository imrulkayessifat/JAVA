/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

/**
 *
 * @author imrul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1="Hello";
        String str2="Hello";
        if(str1==str2){
            System.out.println("match");
        }else{
            System.out.println("no match");
        }
        
        String str3=new String("Hello");
        String str4=new String("Hello");
        if(str3==str4){
            System.out.println("match");
        }else{
            System.out.println("no match");
        }
        
        if(str3.equals(str4)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        
        if(str3.compareTo(str4)==0){
            System.out.println("compared");
        }else{
            System.out.println("not compared");
        }
        
        String str="John, Jennie, Jim, Jack, Joe";
        System.out.println("str is: "+str);
        int len = str.length();
        System.out.println("length is : "+len);
        System.out.println(str.charAt(0)+" | "+str.charAt(len-1));
        
        String s1= str.toUpperCase();
        System.out.println("str after : "+str);
        System.out.println("s1 is : "+s1);
        
        if(str.contains("Jim")){
            System.out.println("Jim is in the string");
        }
        
        String s2 = str.substring(5);
        System.out.println("s2 is : "+s2);
        
        String s3 = str.substring(6,10);
        System.out.println("s3 is : "+s3);
        
        String s4 = str.replace('J', 'K');
        System.out.println("s4 is : "+s4);
        
        char[] chArr = str.toCharArray();
        for(char ch : chArr){
            System.out.print(ch+" ");
        }
        System.out.println("");
        
        String[] strArr = str.split(",");
        for(String s : strArr){
            System.out.print(s.trim());
        }
        System.out.println("");
        String email = "john@gmail.com";
        String phone = "3929832920";
        String pass  = "password322";
        
        if(!email.isEmpty()){
            System.out.println("Email is Available");
            if(!email.contains("@")&& !email.contains(".")){
                System.out.println("mail not valid");
            }else{
                System.out.println("mail is valid");
            }
        }
        
        String string = new String("Hello");
        string.concat(" World");
        System.out.println("string is: "+string);
        
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        System.out.println("Buffer is : "+buffer);
        
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");
        System.out.println("Builder is : "+builder);
    }
    
}
