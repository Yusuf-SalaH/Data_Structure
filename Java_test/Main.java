/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model5;

/**
 *
 * @author Muhammad
 */
public class Main {

    public static void greet(String name)
    {
        System.out.println("Hello " + name);
    }
    
    //Q1:Overload the greet method to just print “Hello” if not given any parameters. It should print “Hello” and then “Hello Ahmed”.
    
    
    //End of Question 2 
    public static void main(String[] args) {
 
        //test Question 1 
        greet();
       greet("Ahmed");
        
        // test Question 2 
        Candy c1 = new Candy();
        System.out.println(c1.taste());
        Candy c2 = new Chocolate();
        System.out.println(c2.taste();
    }
    
}
