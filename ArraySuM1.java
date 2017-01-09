import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraySuM1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum=0;
       
        for(int i = 0;i<number;i++){
            
            sum += scanner.nextInt();
            
        }
        
        System.out.println(sum);
    }
}