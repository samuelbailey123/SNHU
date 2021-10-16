import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TaskTest {
  @Test
  public void validTask() {
      Task task = new Task("0000000001", "nameHere", "Description here");
      String example = "aaaaaaaaaa"; //10 letter string
      String example1 = "aaaaamamammamammamam" //20 letter string
      String example2 = "lalalalalalalalalalalalalalalalalalalalalalalalala"; //50 letter string
      assertTrue(example2.length() >= task.getDescription().length());
      assertNotNull(task.getDescription());
      assertTrue(example1.length() >= task.getName().length());
      assertNotNull(task.getName());
      assertNotNull(task.getId());
      assertTrue(example.length() >= task.getId.length());

   }
}
