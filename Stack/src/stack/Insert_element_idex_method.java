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
public class Insert_element_idex_method {
    
    
    
       
        Scanner scan = new Scanner(System.in);
        java.util.Stack<String>stack;

    
  
         
         int n;
         
         
            void push()
            
            
         {        
       
                scan =new Scanner(System.in);
                stack = new java.util.Stack <String>();       

                System.out.println("Stack Insertion using Index");

                System.out.println("Enter 'n' Value :");
                n=scan.nextInt();

              System.out.println("Enter the data - Push");

                for (int i = 0; i < n; i++) {

                    stack.push(scan.next());

       }
        
        
    }
            
            
            
            void AddIndex()
                    
            {
                
                System.out.println("\nInsertion using Index");
                
                System.out.println("Enter the Index :");
                        int index = scan.nextInt();
                        
                        
                 System.out.println("Enter the Element :");
                 
                 String element = scan.next();
                 
                 
                 stack.add(index -1, element);
                 
     
            }
    
    
           
            
     
            
            void display ()
            {
                        display();         
            }
            
            
    
}


 