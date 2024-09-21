public class Main {
    public static void main(String[] args) {
        MaintenanceRecord record = new MaintenanceRecord(1,"Oil Change", "12/09/24", 22.54, "Chennai");
        MaintenanceRecord record2 = new MaintenanceRecord(2,"Gas Leak","10/10/24", 21.23, "Kolkata");

        Vehicle veh = new Vehicle(101, "Sedan","TopEnd",2005,20.00);

        veh.addMaintenanceRecord(record);
        veh.addMaintenanceRecord(record2);

        veh.getMaintenanceHistory();
        veh.getVehicleProfile();
    }
}
