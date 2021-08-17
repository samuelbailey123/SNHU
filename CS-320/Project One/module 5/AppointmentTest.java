import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentTest {

    public static List<Appointment> appointment = new ArrayList<>();
    public String exampleId = "aaaaaaaaaa"; //this string is 10 letters
    public String exampleDesctiption = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"; //50 letters
    LocalDate date = LocalDate.now();

  @Test
  public void createValidTaskData() {
      Date date0 = new Date();
      Appointment appointment1 = new Appointment("0000000001", date0, "example");
      assertNotNull(appointment1.getDate());
      assertNotNull(appointment1.getId());
      assertNotNull(appointment1.getDescription());
      assertTrue(exampleId.length() >= appointment1.getId().length()); //checks ID
      assertTrue(exampleDesctiption.length() >= appointment1.getDescription().length()); //checks Description
      assertTrue(date.toString().length() >= date0.toString().length()); //checks date... i think
   }
}