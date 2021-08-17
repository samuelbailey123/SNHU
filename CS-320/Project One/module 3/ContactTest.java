import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Map;
import java.util.HashMap;


public class ContactTest {
    private static Map<Integer, Contact> contacts = new HashMap<>();
    private static int uniqueId=0000;

    @Test public void createValidContactData(){
        Contact contact0 =new Contact("1001","AAA","AAA1","1234567891","Hyd");
        uniqueId ++;
        contacts.put(uniqueId, contact0);
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

 }