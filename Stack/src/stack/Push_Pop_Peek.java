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
public class Push_Pop_Peek {
    
    

    
    
        Scanner scan = new Scanner(System.in);
        java.util.Stack<String>stack;

    
  
         
         int n;
         
         
          void push(){        
       
        scan =new Scanner(System.in);
        stack = new java.util.Stack <String>();       
        
        System.out.println("Stack Push, Pop & Peek");
        
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
          
          
      
          
          if (stack.isEmpty()) {
              
              System.out.println("The Stack is Empty...");
              
          } else {
              
               System.out.println(stack.peek());
               
          }
          
          
      }     
          
       void pop()
        
        {
            
            System.out.println("The Stack - POP");
            
            while(!stack.empty()) 
            
            {
                
                    System.out.println(stack.pop());
                
            }
            
        
        peek();
        
        
        }    
    
    
    
}
