import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
     Write a method to sort an array of strings sp that all the anagrams are next to each other.
 */
public class StringAnagrams implements Comparator<String>{

    public  static String sortChars(String s){

        char[] content = s.toCharArray();
        Arrays.sort(content);

        return new String(content);
    }

    public int compare(String s1, String s2){

        return sortChars(s1).compareTo(sortChars(s2));
    }

    public static void main (String [] args){


        String st1 = "tree";
        String st2 = "eert";

        System.out.println(sortChars(st1));
        System.out.println(sortChars(st2));






    }
}
