/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author sdurko
 */
public class Game 
{
    
    public void Print()
    {
        for(int x=1;x<=100;x++)
        {
          System.out.println(CheckForFizzBuzz(x));  
        }
    }
    
    private boolean IsMultipleOf(int multiple, int number)
    {   
        return number % multiple == 0;
    }
    
    private String CheckForFizzBuzz(int number)
    {        
        boolean ofThree = IsMultipleOf(3,number);
        boolean ofFive = IsMultipleOf(5,number);
        
        if(ofThree && ofFive)
        {return "FizzBuzz";}
        else if(ofThree)
        {return "Fizz";}
        else if(ofFive)
        {return "Buzz";}
        
        return Integer.toString(number);
    }
}