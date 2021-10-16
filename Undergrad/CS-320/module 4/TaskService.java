import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskService {
    // this entire file is for testing everything/making sure it works
    public static List<Task> tasks = new ArrayList<>();
    public static void main(String[] args) {
        TaskService service = new TaskService();
        
        //example tasks
        service.addTask(new Task("0000001", "example", "activity"));
        service.addTask(new Task("0000002", "example", "activity"));
        service.addTask(new Task("0000003", "example", "activity"));
        
        //display all added and updated Task object
        for (Task obj : tasks) {
            System.out.println(obj);
        }
        //updating a task
        service.addTask(new Task("0000001", "exampleO", "activity1"));
        System.out.println("Delete Task ID #0000002");
        service.deleteTask("0000002");
        System.out.println("Update Task ID #0000003");
        service.update(new Task("0000003", "example1", "activity2"));

        //display tasks
        for (Task obj : tasks) {
            System.out.println(obj);
        }
    }
    public boolean addTask(Task task) { //this function checks if the ID has already been used
        int index = getIndex(task);
        //validate id if doesn't exist, name & description
        if (index < 0 && validateID(task.getId()) && validateName(task.getName()) && validateDescription(task.getDescription())) {
            tasks.add(task);
            return true;
        }
        return false;
    }
    public void deleteTask(String id) {//this function deletes the task ID if the task is real 
        int index = getIndex(new Task(id, "", ""));
        if (index >= 0)
            tasks.remove(index);
    }
    public void update(Task task) {//updates task
        for (Task obj : tasks) {
            if (obj.equals(task) && validateName(task.getName()) && validateDescription(task.getDescription())) {
                obj.setName(task.getName());
                obj.setDescription(task.getDescription());
            }
        }
    }
    public int getIndex(Task task) {
        int index = Collections.binarySearch(tasks, task, Task.compareById);
        return index;
    }
    public boolean validateID(String id) { // checks ID # to see if real
        if (id != null && id.length() <= 10)
            return true;
        return false;
    }
    public boolean validateName(String name) {
        if (name != null && name.length() <= 20)
            return true;
        return false;
    }
    public boolean validateDescription(String description) { //function checks to make sure description is under 50 characters
        if (description != null && description.length() <= 50)
            return true;
        return false;
    }
}