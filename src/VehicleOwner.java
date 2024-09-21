import java.util.ArrayList;
import java.util.List;

public class VehicleOwner {
    int ownerID;
    String name;
    String contactInfo;
    List<Vehicle> vehicles = new ArrayList<>();

    VehicleOwner (int ownerID, String name, String contactInfo) {
        this.ownerID = ownerID;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public void addVehicle(Vehicle v) { vehicles.add(v); }

    public void viewMaintenanceRecord(int id) {
        for (Vehicle x : vehicles)
            if (x.vehicleID == id)
                x.getMaintenanceHistory();
    }

    public void receiveMaintenanceAlert() {}

    public void viewNearbyServiceCenters() {}
}
