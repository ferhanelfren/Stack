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
public class Pop_and_Push_Delete {
    
    Scanner scan;
  java.util.Stack<String>stack;
    int n;
    
    void push()
    
    {
        
    
        scan=new Scanner(System.in);
      //  stack= new Stack <String> ();
          stack = new java.util.Stack <String>(); 
        
        
        System.out.println("Stack Push & Pop (Delete)");
        
        System.out.println("Enter 'n' value :");
        n= scan.nextInt();
        
        System.out.println("Enter the Data - PUSH");
        
        for (int i = 0; i < n; i++) {
            
            stack.push(scan.next());
            
        }
        
   
        
        
    }
    
    
    
    
         
        void pop()
        
        {
            
            System.out.println("The Stack - POP");
            
            while(!stack.empty()) 
            
            {
                
                    System.out.println(stack.pop());
                
            }
            
        
        
        
        
        }
        
    
    
}
