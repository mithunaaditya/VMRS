import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddVehiclePage extends JFrame {

    // Declare the form components
    private JTextField txtVehicleID;
    private JTextField txtMake;
    private JTextField txtModel;
    private JSpinner spnYear;
    private JTextField txtMileage;
    private JButton btnSubmit;

    public AddVehiclePage() {
        setTitle("Add Vehicle");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2)); // Grid layout for neat arrangement of fields

        // Create labels and text fields/spinners
        JLabel lblVehicleID = new JLabel("Vehicle ID: ");
        JLabel lblMake = new JLabel("Make: ");
        JLabel lblModel = new JLabel("Model: ");
        JLabel lblYear = new JLabel("Year: ");
        JLabel lblMileage = new JLabel("Mileage: ");

        txtVehicleID = new JTextField();
        txtMake = new JTextField();
        txtModel = new JTextField();

        // Spinner for year selection (from 1900 to current year)
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        spnYear = new JSpinner(new SpinnerNumberModel(currentYear, 1900, currentYear, 1));

        txtMileage = new JTextField();
        btnSubmit = new JButton("Submit");

        // Add components to the frame
        add(lblVehicleID);
        add(txtVehicleID);
        add(lblMake);
        add(txtMake);
        add(lblModel);
        add(txtModel);
        add(lblYear);
        add(spnYear);
        add(lblMileage);
        add(txtMileage);
        add(new JLabel()); // Empty label for alignment
        add(btnSubmit);

        // Button action listener
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validate the inputs
                try {
                    // Parse inputs and handle validation
                    int vehicleID = Integer.parseInt(txtVehicleID.getText());
                    String make = txtMake.getText().trim();
                    String model = txtModel.getText().trim();
                    int year = (int) spnYear.getValue();
                    double mileage = Double.parseDouble(txtMileage.getText());

                    // Validate that all fields are filled
                    if (make.isEmpty() || model.isEmpty() || txtVehicleID.getText().isEmpty() || txtMileage.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
                    } else {
                        // Simulate adding the vehicle (you can store this data in a list or database)
                        JOptionPane.showMessageDialog(null,
                                "Vehicle Added Successfully:\n" +
                                        "ID: " + vehicleID + "\n" +
                                        "Make: " + make + "\n" +
                                        "Model: " + model + "\n" +
                                        "Year: " + year + "\n" +
                                        "Mileage: " + mileage);

                        // Clear fields after submission
                        txtVehicleID.setText("");
                        txtMake.setText("");
                        txtModel.setText("");
                        txtMileage.setText("");
                    }
                } catch (NumberFormatException ex) {
                    // Handle invalid input for numeric fields
                    JOptionPane.showMessageDialog(null, "Please enter valid values for Vehicle ID and Mileage.");
                }
            }
        });

        // Set window to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddVehiclePage();
            }
        });
    }
}
