import javax.swing.*;
import java.awt.*;

public class HotelReservationSystem {

    // Declare the JFrame as a field
    public HotelReservationSystem() {
        // 1. Create the JFrame object
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame BorderJFrame = new JFrame("Hotel Reservation System");
        BorderJFrame.setSize(750, 400);
        BorderJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderJFrame.setLocationRelativeTo(null);

        // 2. Set BorderLayout on the JFrame
        BorderJFrame.setLayout(new GridLayout(3, 2 ,10, 10));


        // 3. Add each panel to a region of the BorderLayout
        BorderJFrame.add(createGuestPanel());
        BorderJFrame.add(createRoomPanel());
        BorderJFrame.add(createDatePanel());
        BorderJFrame.add(createPaymentPanel());
        BorderJFrame.add(createSubmitPanel());

        // 4. Make the window visible
        BorderJFrame.setVisible(true);
    }

    // ---------- PANEL 1: Guest Information ----------
    private JPanel createGuestPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.setBorder(BorderFactory.createTitledBorder("Guest Information"));

        panel.add(new JLabel("Full Name:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Email:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Phone:"));
        panel.add(new JTextField());

        return panel;
    }

    // ---------- PANEL 2: Room Selection ----------
    private JPanel createRoomPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.setBorder(BorderFactory.createTitledBorder("Room Selection"));

        panel.add(new JLabel("Room Type:"));
        String[] types = {"Single", "Double", "Family"};
        panel.add(new JComboBox<>(types));

        panel.add(new JLabel("Room Number:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Guests:"));
        panel.add(new JSpinner(new SpinnerNumberModel(1, 1, 10, 1)));

        return panel;
    }

    // ---------- PANEL 3: Booking Dates ----------
    private JPanel createDatePanel() {
        JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));
        panel.setBorder(BorderFactory.createTitledBorder("Booking Dates"));

        panel.add(new JLabel("Check-In:"));
        panel.add(new JTextField("YYYY-MM-DD"));

        panel.add(new JLabel("Check-Out:"));
        panel.add(new JTextField("YYYY-MM-DD"));

        return panel;
    }

    // ---------- PANEL 4: Payment Details ----------
    private JPanel createPaymentPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.setBorder(BorderFactory.createTitledBorder("Payment Details"));

        panel.add(new JLabel("Payment Method:"));
        String[] methods = {"Cash", "Airtel", "MTN"};
        panel.add(new JComboBox<>(methods));

        panel.add(new JLabel("Mobile Number:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Total Amount:"));
        panel.add(new JTextField());

        return panel;
    }

    // submit

    private JPanel createSubmitPanel(){
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));


        JButton submitBtn = new JButton("Submit");
        panel.add(submitBtn);

        return panel;

    }
}