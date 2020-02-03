/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author GOD
 */
public class Push_Peek {
    
    
    
       int top=0,A;
    
    
        Scanner scan = new Scanner(System.in);
        java.util.Stack<String>stack;

    
     //  Scanner s=new Scanner(System.in);
         
         int n;
    
    
      void push(){        
        //System.out.println("fsakgfjaSFghajdfghakj");
        
       
     // console.log(stack);
     
       // scan = span class=<"keyboard" > new Scanner(System.in);
        scan =new Scanner(System.in);
        stack = new java.util.Stack <String>();       
        
        System.out.println("Stack Push (Insert)");
        
        System.out.println("Enter 'n' Value :");
        n=scan.nextInt();
        
        System.out.println("Enter the data - Push");
        
        for (int i = 0; i < n; i++) {
            
            stack.push(scan.next());
            
        }
        
        
    }
    
    
      void peek ()
      
      {
      
          System.out.println("Top Value of The Stack - PEEK");
          
          
          System.out.println(stack.peek());
          
          
          
      }
    
    
    
    
}
