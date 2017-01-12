/*
    Write a method that checks if string has all uique charactors. 
    The running time of this is o(n)
*/

import java.util.Scanner;

public class UniqueCharactorsString{

 public static boolean StTest( String str){
  
    boolean [] char_check = new boolean[256];
    
    for(int i=0; i < str.length(); i++){
     
      int value = str.charAt(i);
    
      if(char_check[value]) 
         
      return false;
         
      char_check[value] = true;
  
  }
  
    return true; 
    
  }

   
 public static void main(String [] args){
 
     Scanner keyboard = new Scanner(System.in);


     System.out.print("Entern a String: ");
     String st = keyboard.nextLine();

 boolean isUnique = StTest(st);

 if(isUnique){
 
     System.out.println("This String contains all unique characters");

 }else {
     
     System.out.println("The String does not contain all unique characters");
 }  
    
 }
 
}