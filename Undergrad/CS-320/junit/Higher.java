import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.String;

public class Higher {
    public static void main(String[] args){
        int a = 25; 
        int b = -25; 
        int c = higher(a,b);
        System.out.println("The higher of 25 and -25 is " + c); 
    }

    public static int higher(int a, int b){
        if(a > b){
            return a; 
        }else{
            return b;
        }
    }
    public static String checkString(String input){
        if (input.length() <= 10){
            return input;
        }else{
            return null;
        }
    }

    @Test
    public void testHigher(){
        assertEquals(25, higher(25,25));
        assertEquals(5, higher(3,5));
    }

    @Test
    public void stringTest(){
        String string1 = "sam";
        String string2 = "aaa";
        if(string1 != null){
            assertEquals(string1.length(), string2.length());
        }else{
            fail();
        }
    }
}
