/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import static java.lang.System.console;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DS-Mao
 */
public class Stack_Code {
    
       
  //  int stack [];//= new int [0];
    int top=0,A;
    
    
        Scanner scan = new Scanner(System.in);
        Stack<String>stack;

    
     //  Scanner s=new Scanner(System.in);
         
         int n;
         
    
    
    
 //   void fill (){
        
        
      //     System.out.println("=======================================");
          //       System.out.println("Welcome, Shall We Proceed?:");
             //    System.out.println("1. Yes");
              //   System.out.println("2. No");
                    //System.out.println("=======================================");
                  
                   // System.out.println("");
            //     A=scan.nextInt();
                 //    System.out.println("");
                     
                     
              //       if (A==1) {
                         
                        
            
                       
                                //    push();
                            
                            
                         
                            
                     
     //   } else {
           //              System.out.println("THANK YOU");
                         
         //    /        }
        
        
        
 //   }
    
    
    
    void push(){        
        //System.out.println("fsakgfjaSFghajdfghakj");
        
       
     // console.log(stack);
     
       // scan = span class=<"keyboard" > new Scanner(System.in);
        scan =new Scanner(System.in);
        stack = new Stack <String>();       
        
        System.out.println("Stack Push (Insert)");
        
        System.out.println("Enter 'n' Value :");
        n=scan.nextInt();
        
        System.out.println("Enter the data - Push");
        
        for (int i = 0; i < n; i++) {
            
            stack.push(scan.next());
            
        }
        
        
    }
    
    
    void display ()
    
    {
        System.out.println("");
        System.out.println("The Stack");
        
        for (int i = 0; i < stack.size(); i++) 
        {
            
            System.out.println(stack.get(i));
            
        }
        
        
        
        
        
    }
    
    
    
    
}
    
    
    
    
    
    

