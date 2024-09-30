import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Serializable {
    int vehicleID;
    String Make;
    String Model;
    int Year;
    double Mileage;

    List<MaintenanceRecord> records = new ArrayList<>();

    Vehicle(int vehicleID,
    String Make,
    String Model,
    int Year,
    double Mileage){
        this.vehicleID = vehicleID;
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.Mileage = Mileage;
    }

    public void addMaintenanceRecord(MaintenanceRecord record) {
        records.add(record);
    }

    public void getMaintenanceHistory() {
        int count=1;
        for (MaintenanceRecord rec : records) {
            System.out.println("Record "+count);
            rec.getRecordDetails();
            System.out.println();
            count++;
        }
    }

    public void getCurrentMileage() {
        System.out.println("CurrentMileage: "+ this.Mileage);
    }

    public void getVehicleProfile() {
        System.out.println("Vehicle Profile:");
        System.out.println("VehicleID: "+this.vehicleID);
        System.out.println("Make: "+this.Make);
        System.out.println("Model: "+this.Model);
        System.out.println("Year: "+this.Year);
        System.out.println("Mileage: "+this.Mileage);
        System.out.println();
    }
}


