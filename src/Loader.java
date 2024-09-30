import java.io.*;
import java.util.ArrayList;

public class Loader {
    public void SaveVehicleOwner(VehicleOwner obj) throws IOException {
        String fileName = "VehOwn.obj";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();
    }

    public VehicleOwner LoadVehicleOwner() {
        try {
            String fileName = "VehOwn.obj";
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            VehicleOwner output = (VehicleOwner) ois.readObject();
            ois.close();
            return output;
        }
        catch (Exception e) {
            return new VehicleOwner(0, "Error","Error");
        }
    }

    public void SaveUsers(ArrayList<Login> users) throws IOException {
        String fileName = "Users.obj";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(users);
        oos.close();
    }

    public ArrayList<Login> LoadUsers() {
        try {
            String fileName = "Users.obj";
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Login> output = (ArrayList<Login>) ois.readObject();
            ois.close();
            return output;
        }
        catch(Exception e) {
            return new ArrayList<>();
        }
    }
}
