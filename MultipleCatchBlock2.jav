	public class MultipleCatchBlock2 {  
2.	  
3.	    public static void main(String[] args) {  
4.	          
5.	           try{    
6.	                int a[]=new int[5];    
7.	                
8.	                System.out.println(a[10]);  
9.	               }    
10.	               catch(ArithmeticException e)  
11.	                  {  
12.	                   System.out.println("Arithmetic Exception occurs");  
13.	                  }    
14.	               catch(ArrayIndexOutOfBoundsException e)  
15.	                  {  
16.	                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
17.	                  }    
18.	               catch(Exception e)  
19.	                  {  
20.	                   System.out.println("Parent Exception occurs");  
21.	                  }             
22.	               System.out.println("rest of the code");    
23.	    }  
24.	}  
