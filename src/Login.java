public class Login {
    String Username;
    String Password;

    Login(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
        void Authenticate(String Username, String Password){
            if(this.Username.equals(Username) && this.Password.equals(Password)){
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Login Failed");
            }
        }
}

