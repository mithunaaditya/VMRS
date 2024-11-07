import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ViewVehiclesPage extends JFrame {

    // Sample data: List of Vehicle objects
    Loader load = new Loader();
    VehicleOwner owner = load.LoadVehicleOwner();
    List<Vehicle> vehicles = owner.vehicles;

    // Constructor to initialize ViewVehiclesPage
    public ViewVehiclesPage() {
        this.vehicles = vehicles;

        setTitle("View Vehicles");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); // BorderLayout for center panel

        // Panel to hold vehicle buttons
        JPanel vehiclePanel = new JPanel();
        vehiclePanel.setLayout(new GridLayout(0, 1)); // Dynamically adjust layout based on the number of vehicles

        // Check if vehicles list is empty
        if (vehicles.isEmpty()) {
            // Display a blank page (message)
            JLabel blankMessage = new JLabel("No vehicles available", JLabel.CENTER);
            vehiclePanel.add(blankMessage);
        } else {
            // Add a button for each vehicle's ID
            for (Vehicle v : vehicles) {
                JButton vehicleButton = new JButton(String.valueOf(v.vehicleID));

                // Set a tooltip for each button to show vehicle details
                vehicleButton.setToolTipText(v.Model);

                // Optional: ActionListener for each button to show vehicle details or take an action
                vehicleButton.addActionListener(e -> {

                });

                // Add the button to the panel
                vehiclePanel.add(vehicleButton);
            }
        }

        // Add vehicle panel to the frame
        add(new JScrollPane(vehiclePanel), BorderLayout.CENTER); // Make it scrollable if necessary

        setVisible(true);
    }

    public static void main(String[] args) {
        // Sample list of vehicles
        new ViewVehiclesPage();
    }
}
