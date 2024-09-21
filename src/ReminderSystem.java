import java.util.ArrayList;
import java.util.List;

public class ReminderSystem {
    List<Reminder> records = new ArrayList<>();

    public void generateReminder(int reminderId, String duedate, String message) {
        Reminder r = new Reminder(reminderId, duedate, message);
        records.add(r);
    }

    public void sendReminder() {}
}
