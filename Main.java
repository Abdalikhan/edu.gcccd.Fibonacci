import java.math.*;
public class Main {
		    static int numOfCalled = 0;		    
		    static BigInteger fib(int n, BigInteger a, BigInteger b ) 
		    {  
		        numOfCalled++;
		        if (n == 0) 
		            return a; 
		        if (n == 1) 
		            return b; 
		        return fib(n - 1, b, a.add(b)); 
		    } 
		      
		    public static void main (String[] args)  
		    { 
		        long start = System.currentTimeMillis();
		        int n = Integer.parseInt(args[0]);
		        //int n =
		        //int n = 9;
		        BigInteger zero = BigInteger.valueOf(0);
		        BigInteger one = BigInteger.valueOf(1);
		        BigInteger result = fib(n,zero,one);
		        long finish = System.currentTimeMillis();
		        long time = finish - start;
		        System.out.println("The " + n + "-th Fibonacci Number is " + result + " and was calculated in " + time + " ms.");  
		        System.out.println("The fib() method got called " + numOfCalled + " times.");
		    } 
		}

			
		



