import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskServiceTest {
   public static List<Task> tasks = new ArrayList<>();
    TaskService testing = new TaskService();

   @Test
   public void validTask() {
        Task task = new Task("0000001", "example", "activity");
        testing.addTask(task);
        if (task.getId() != null && task.getId().length() <= 10){
            if (task.getName() != null && task.getName().length() <= 20){
                if (task.getDescription() != null && task.getDescription().length() <= 50){
                    System.out.println("Valid Task: PASSED"); 
                }
            }
        }else{
            System.out.println("Valid Task: FAILED");
            fail();
        }
   }

   @Test
   public void checkTaskID() {
        Task task = new Task("0000002x", "exampole", "activity");
        testing.addTask(task);
        if (task.getId() != null && task.getId().length() <= 10){
            System.out.println("Vaild ID: PASSED");
        }else{
            System.out.println("Valid ID: FAILED");
            fail();
        }
   }

   @Test
   public void checkTaskDescription(){
        Task task = new Task("0000002", "example", "activity");
        testing.addTask(task);
        if (task.getDescription() != null && task.getDescription().length() <= 50){
            System.out.println("Vaild Description: PASSED");
        }else{
            System.out.println("Valid Description: FAILED");
            fail();
        }
   }
   @Test
   public void checkTaskName(){
       Task task = new Task("00000003", "example", "information");
       testing.addTask(task); 
       if (task.getName() != null && task.getName().length() <= 20){
           System.out.println("Valid Name: PASSED");
       }else{
           System.out.println("Valid Name: FAILED");
           fail();
       }
   }
}