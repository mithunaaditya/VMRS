import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VehicleOwner implements Serializable {
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

    public String getProfile() {
        StringBuilder data = new StringBuilder("{\"ownerID\":" + ownerID + ", \"name\":\"" + name + "\", \"contactInfo\":\"" + contactInfo + "\", \"vehicles\":[");

        for (Vehicle x: this.vehicles) {
            data.append(x.vehicleID).append(",");
        }
        data.deleteCharAt(data.lastIndexOf(","));
        data.append("]}");

        return data.toString();
    }
}
