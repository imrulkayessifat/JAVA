/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPackage;

/**
 *
 * @author imrul
 */
public class palindromeDemo {
    public static void main(String[] args) {
        String s1 = "madam";
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();
        if(s1.equals(s2)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        
    }
}
