import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        // It displays its ASCII value
        System.out.println('a' + 'b');
        
        System.out.println("c" + "d");

        System.out.println("a"+'b');    //Type is String
        
        System.out.println('a'+3);
  
        System.out.println((char) ('c' + 3));
    
        //In the case below the integer value will be converted to Integer that will call toString(),
        //So this is same as "a"+"1"
        System.out.println("a" + 1);

        System.out.println("a" + new ArrayList<>());
    
        System.out.println("a" + new Integer(56));
        
        //🔴🔴 The '+' operator only works for primitive values or any one of the value is String.
        //The type of below is String
        System.out.println(new ArrayList<>()+ "" + new Integer(56));
  }   
}
