import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        Loader loader = new Loader();

        //Login user = new Login("TestUser","TestPassword");

        //user.register();

        //System.out.println(user.login());

        //ArrayList<Login> users = new ArrayList<>();

        //ArrayList<Login> users = loader.LoadUsers();

        //users.add(user);


        //loader.SaveUsers(users);



        //System.out.println(loader.LoadUsers());

        //VehicleOwner owner = new VehicleOwner(101,"TestName","TestContact");
        //Vehicle veh = new Vehicle(101,"TestMake1","TestModel1",2005,25.04);
        //Vehicle veh2 = new Vehicle(202,"TestMake2","TestModel2",2006,26.04);

        //owner.addVehicle(veh);
        //owner.addVehicle(veh2);

        //loader.SaveVehicleOwner(owner);

        VehicleOwner owner = loader.LoadVehicleOwner();
        System.out.println(owner.getProfile());
    }
}
