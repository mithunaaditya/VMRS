import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage extends JFrame {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JTextField txtEmail;
    private JButton btnRegister;

    public RegisterPage() {
        setTitle("Register");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        // Create form elements
        JLabel lblUsername = new JLabel("Username: ");
        JLabel lblPassword = new JLabel("Password: ");
        JLabel lblEmail = new JLabel("Email: ");

        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        txtEmail = new JTextField();
        btnRegister = new JButton("Register");

        // Add components to the frame
        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(lblEmail);
        add(txtEmail);
        add(btnRegister);

        // Button click action
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Simple validation logic
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());
                String email = txtEmail.getText();

                // Here you would typically save these credentials to a database
                JOptionPane.showMessageDialog(null, "Registration Successful");
                dispose(); // Close the Register page
                new LoginPage(); // Open the Login Page after registration
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegisterPage());
    }
}
