import java.io.Serializable;

public class MaintenanceRecord implements Serializable {
    int recordID;
    String serviceType;
    String serviceDate;
    double mileageAtService;
    String serviceCenter;

    MaintenanceRecord (int recordID,
    String serviceType,
    String serviceDate,
    double mileageAtService,
    String serviceCenter ) {
        this.recordID = recordID;
        this.serviceType = serviceType;
        this.serviceDate = serviceDate;
        this.mileageAtService = mileageAtService;
        this.serviceCenter = serviceCenter;
    }

    public void getRecordDetails() {
        System.out.println("RecordID: "+this.recordID);
        System.out.println("ServiceType: "+this.serviceType);
        System.out.println("ServiceDate: "+this.serviceDate);
        System.out.println("MileageAtService: "+this.mileageAtService);
        System.out.println("ServiceCenter: "+this.serviceCenter);

    }

}
