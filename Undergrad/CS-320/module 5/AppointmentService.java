import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class AppointmentService {

    private static Map<Integer, Appointment> appointments = new HashMap<>();

    public Map<Integer, Appointment> addAppointment(Appointment appointment){
        appointments.put(appointment.getId().length(),appointment);
        return appointments;
    }

    public Map<Integer, Appointment> deleteAppointment(String id){
        Iterator itr = appointments.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Appointment> entry = (Map.Entry<Integer, Appointment>) itr.next();
            if (entry.getValue().getId() == id) {
                itr.remove();
            }
        }
        return appointments;
    }

    public Map<Integer, Appointment> updateAppointment(String id, Date date, String description) {
        Iterator itr = appointments.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Appointment> entry = (Map.Entry<Integer, Appointment>) itr.next();
            if (entry.getValue().getId() == id) {
                entry.getValue().setDate(date);
                entry.getValue().setDescription((description));
            }
        }
        return appointments;
    }


}