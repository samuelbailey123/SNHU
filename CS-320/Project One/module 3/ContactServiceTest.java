import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Map;
import java.util.HashMap;

//test cases
public class ContactServiceTest{
    private static Map<Integer, Contact> contacts = new HashMap<>();
    private static int uniqueId=2000;
    
    @Test
    public void validContactID(){
        Contact contact0 = new Contact("0001", "example", "example", "example", "example");
        uniqueId ++;
        contacts.put(uniqueId++, contact0);
        String exampleTen = "aaaaaaaaaa";
        String example30 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        if (contact0.getContactID() != null && contact0.getContactID().length() <= 10){
            if (contact0.getFirstName() != null && contact0.getFirstName().length() <= 10){
                if (contact0.getLastName() != null && contact0.getLastName().length() <= 10){
                    if(contact0.getPhone() != null && contact0.getPhone().length() <= 10){
                        if(contact0.getAddress() != null && contact0.getAddress().length() <= 30){
                            System.out.println("Valid Contact: PASSED"); 
                        }
                    }
                }
            }
        }else{
            System.out.println("Valid Contact: FAILED");
            fail();
        }
    }

    @Test
    public void firstName(){
        Contact contact1 = new Contact("00002z", "exampleaaaaaaaaaa", "example", "example", "example");
        uniqueId ++;
        contacts.put(uniqueId++, contact1);
        if (contact1.getFirstName() != null && contact1.getFirstName().length() <= 10){
            System.out.println("Valid Name: PASSED");
        }else{
            System.out.println("Valid Name: FAILED");
            fail();
        }
    }

    @Test
    public void lastName(){
        Contact contact1 = new Contact("00002z", "example", "example", "example", "example");
        uniqueId++;
        contacts.put(uniqueId, contact1);
        String example = "aaaaaaaaaa"; //this string is 10 letters
        assertTrue(example.length() >= contact1.getLastName().length());
        assertNotNull(contact1.getLastName());
    }

    @Test
    public void phone(){
        Contact contact2 = new Contact("00002z", "example", "example", "example", "example");
        uniqueId ++;
        contacts.put(uniqueId, contact2);
        String example = "aaaaaaaaaa"; //this string is 10 letters
        assertTrue(example.length() >= contact2.getPhone().length());
        assertNotNull((contact2.getPhone()));
    }

    @Test
    public void address(){
        Contact contact3 = new Contact("00002z", "example", "example", "example", "example");
        uniqueId++;
        contacts.put(uniqueId,contact3);
        String example = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"; //string is 30 letters for the comparison
        assertTrue(example.length() >= contact3.getAddress().length());
        assertNotNull(contact3.getAddress());
    }
    
}