import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactService {

   private static int uniqueId=2000; // <<this ID # can be changed, this is just a default
   private static Map<Integer, Contact> contacts = new HashMap<>(); // map data structure from cs-260

   //method for adding a contact
   public Map<Integer, Contact> addContact(Contact contact) {
       uniqueId++;
       contacts.put(uniqueId, contact);
       return contacts;
   }
  
   //method for deleting a contact
   public Map<Integer, Contact> deleteContact(String contactID) {
       Iterator itr = contacts.entrySet().iterator();
       while (itr.hasNext()) {
           Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>) itr.next();
           if (entry.getValue().getContactID() == contactID) {
               itr.remove();
           }
       }
       return contacts;
   }
  

   //update contact method
   public Map<Integer, Contact> updateContact(String contactID, String firstName, String lastName, String number,
           String address) {
       Iterator itr = contacts.entrySet().iterator();
       while (itr.hasNext()) {
           Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>) itr.next();
           if (entry.getValue().getContactID() == contactID) {
               entry.getValue().setFirstName(firstName);
               entry.getValue().setLastName(lastName);
               entry.getValue().setPhone(number);
               entry.getValue().setAddress(address);
           }
       }
       return contacts;
   }
}