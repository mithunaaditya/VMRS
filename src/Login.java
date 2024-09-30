import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Login implements Serializable {
    String Username;
    String Password;

    Login(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    boolean login() {
        Loader loader = new Loader();

        ArrayList<Login> users = loader.LoadUsers();

        for (Login x : users)
            if (Objects.equals(this.Username, x.Username) && Objects.equals(this.Password, x.Password))
                return true;

        return false;

    }

    boolean register() {
        try {
            Loader loader = new Loader();

            ArrayList<Login> users = loader.LoadUsers();

            users.add(this);

            loader.SaveUsers(users);

            return true;
        }
        catch (Exception e) {
            return false;
        }


    }
}

