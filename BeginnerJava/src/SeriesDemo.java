
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imrul
 */
public class SeriesDemo {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            sum = sum+i;
        }
        System.out.println(sum);
        Scanner input = new Scanner(System.in);
        int m,n,sum1=0;
        m=input.nextInt();
        n=input.nextInt();
        for (int i = m; i <=n; i++) {
            sum1=sum1+i;
        }
        System.out.println(sum1);
        sum1=0;
        if(m%2==0)
        {
            for (int i = m; i <=n; i=i+2) {
                sum1=sum1+i;
            }
            System.out.println(sum1);
            sum1=0;
        }
        else{
            for (int i = m+1; i <=n; i=i+2) {
                sum1=sum1+i;
            }
            System.out.println(sum1);
            sum1=0;
        }
        if(m%2==1)
        {
            for (int i = m; i <=n; i=i+2) {
                sum1=sum1+i;
            }
            System.out.println(sum1);
            sum1=0;
        }
        else{
            for (int i = m+1; i <=n; i=i+2) {
                sum1=sum1+i;
            }
            System.out.println(sum1);
            sum1=0;
        }
        
    }
}
