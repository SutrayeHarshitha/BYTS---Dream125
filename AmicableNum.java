/*Sum of factors of n1 equals to n2 and sum of factors of n2 is equal to n1 
ex:220,284 &1184,1210 */

import java.util.Scanner;  
public class AmicableNum  {
    public static void main (String args[])  {  
        int firstDiv = 0, secondDiv = 0;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the first number: ");  
        int firstNum = sc.nextInt();  
        System.out.print("Enter the second number: ");  
        int secondNum = sc.nextInt();  
        for(int i=1;i<firstNum;i++)  
            if(firstNum % i == 0)    
                firstDiv = firstDiv + i;  

        for(int i=1;i<secondNum;i++)  
            if(secondNum % i == 0)  
                secondDiv = secondDiv + i;  

        if((firstNum == secondDiv) && (secondNum == firstDiv))  
            System.out.println(firstNum+", "+ secondNum +" are amicable numbers.");  
        else  
            System.out.println(firstNum+", "+ secondNum +" are not amicable numbers.");
    }  
}