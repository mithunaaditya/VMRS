class reminder{
    int reminderId;
    String duedate;
    String message;

    reminder(int reminderId, String duedate, String message){
        this.reminderId = reminderId;
        this.duedate = duedate;
        this.message = message;
    }

    void getReminderDetails(){
        System.out.println("Reminder ID: " + reminderId);
        System.out.println("Duedate: " + duedate);
        System.out.println("Message: " + message);
    }
}
