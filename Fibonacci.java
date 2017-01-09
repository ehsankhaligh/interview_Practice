//https://www.youtube.com/watch?v=pqivnzmSbq4
public class Fibonacci{

  public static int Fib(int num){
  
     //Recursion 
     if(num == 0){
     
        return 0;
    
     }else if( num == 1){
     
         return 1;
     
     }else if (num > 1){
      
        return Fib(num - 1) + Fib (num - 2);
        
     }else {return -1;}
     
   }
   
   //iterrative sub
   public static int Fibo(int n){
     
       if(n < 0){
        
         return -1;
         
       } if( n==0){
          
          return 0;
       
       }
       
       int a = 1, b = 1;
       
       for(int i = 3; i <= n; i++){
         
         int c = a + b;
          
           a = b;
           b = c; 
         
        
         
       }
       return b;
        
   }
   
   public static void main(String [] args){
      
     System.out.println(Fib(20));
     System.out.println(Fibo(20));
   
   }
}