import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class AppointmentServiceTest {
   
   public static List<Appointment> appointment = new ArrayList<>();
   public String exampleId = "aaaaaaaaaa"; //this string is 10 letters
   public String exampleDesctiption = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"; //50 letters
   LocalDate date = LocalDate.now();

   @Test
   public void validAppointmentData() {
      Date date1 = new Date();
      Appointment appointment1 = new Appointment("0000000001", date1, "example");
      assertNotNull(appointment1.getDate());
      assertNotNull(appointment1.getId());
      assertNotNull(appointment1.getDescription());
      assertTrue(exampleId.length() >= appointment1.getId().length()); //checks ID
      assertTrue(exampleDesctiption.length() >= appointment1.getDescription().length()); //checks Description
      assertTrue(date.toString().length() >= date1.toString().length()); //checks date... i think
   }

   @Test
   public void validID(){
      Date date2 = new Date();
      Appointment appointment2 = new Appointment("00000001", date2, "example");
      assertNotNull(appointment2.getId());
      assertTrue(exampleId.length() >= appointment2.getId().length());
   }

   @Test
   public void validDate(){
      Date date3 = new Date();
      Appointment appointment3 = new Appointment("00000001", date3, "example");
      assertNotNull(appointment3.getDate());
      assertTrue(date.toString().length() >= date3.toString().length());
   }

   @Test
   public void validDescription(){
      Date date4 = new Date();
      Appointment appointment4 = new Appointment("0000003", date4, "example");
      assertNotNull(appointment4.getDescription());
      assertTrue(exampleDesctiption.length() >= appointment4.getDescription().length()); //checks Description
   }

}