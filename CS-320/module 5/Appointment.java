import java.util.Comparator;
import java.util.Date;

public class Appointment {

    //private access modifier for encapsulation
    private String id;
    private Date date;
    private String description;

    //public constructor of Task object accepting 3 String parameters
    public Appointment(String id, Date date, String description) {
        this.id = id; //no longer than 10 letters
        this.date = date; //Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
        this.description = description; //no longer than 50 letters
    }

    //set and get functions
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}