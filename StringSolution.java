import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        String s = "saveChangesInTheEditor"; //= in.next();
        int numupc = 0; 
        int result;
        
        for(int i=0; i <= s.length() ; i++){
            
            if(Character.isUpperCase(s.charAt(i))){   
               
                result = numupc++;
               
                System.out.println(result); 
            }
            
            
        } 
    }
}
