package ShoppingCart.GUI;

import javax.swing.*;
import java.awt.event.*;

public class ShoppingCartPrinterGUI extends JFrame {
    private JTextField itemNameField1, itemPriceField1, itemQuantityField1;
    private JTextField itemNameField2, itemPriceField2, itemQuantityField2;
    private JButton calculateButton;
    private JLabel totalLabel;

    public ShoppingCartPrinterGUI() {
        setTitle("Shopping Cart Printer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel item1Label = new JLabel("Item 1");
        item1Label.setBounds(20, 20, 100, 20);
        panel.add(item1Label);

        JLabel itemNameLabel1 = new JLabel("Name:");
        itemNameLabel1.setBounds(20, 50, 100, 20);
        panel.add(itemNameLabel1);

        itemNameField1 = new JTextField();
        itemNameField1.setBounds(120, 50, 150, 20);
        panel.add(itemNameField1);

        JLabel itemPriceLabel1 = new JLabel("Price:");
        itemPriceLabel1.setBounds(20, 80, 100, 20);
        panel.add(itemPriceLabel1);

        itemPriceField1 = new JTextField();
        itemPriceField1.setBounds(120, 80, 80, 20);
        panel.add(itemPriceField1);

        JLabel itemQuantityLabel1 = new JLabel("Quantity:");
        itemQuantityLabel1.setBounds(20, 110, 100, 20);
        panel.add(itemQuantityLabel1);

        itemQuantityField1 = new JTextField();
        itemQuantityField1.setBounds(120, 110, 80, 20);
        panel.add(itemQuantityField1);

        JLabel item2Label = new JLabel("Item 2");
        item2Label.setBounds(20, 150, 100, 20);
        panel.add(item2Label);

        JLabel itemNameLabel2 = new JLabel("Name:");
        itemNameLabel2.setBounds(20, 180, 100, 20);
        panel.add(itemNameLabel2);

        itemNameField2 = new JTextField();
        itemNameField2.setBounds(120, 180, 150, 20);
        panel.add(itemNameField2);

        JLabel itemPriceLabel2 = new JLabel("Price:");
        itemPriceLabel2.setBounds(20, 210, 100, 20);
        panel.add(itemPriceLabel2);

        itemPriceField2 = new JTextField();
        itemPriceField2.setBounds(120, 210, 80, 20);
        panel.add(itemPriceField2);

        JLabel itemQuantityLabel2 = new JLabel("Quantity:");
        itemQuantityLabel2.setBounds(20, 240, 100, 20);
        panel.add(itemQuantityLabel2);

        itemQuantityField2 = new JTextField();
        itemQuantityField2.setBounds(120, 240, 80, 20);
        panel.add(itemQuantityField2);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(280, 210, 100, 30);
        calculateButton.addActionListener(new CalculateButtonListener());
        panel.add(calculateButton);

        totalLabel = new JLabel();
        totalLabel.setBounds(20, 280, 200, 20);
        panel.add(totalLabel);

        add(panel);
    }

    private class CalculateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double price1 = Double.parseDouble(itemPriceField1.getText());
                int quantity1 = Integer.parseInt(itemQuantityField1.getText());
                double price2 = Double.parseDouble(itemPriceField2.getText());
                int quantity2 = Integer.parseInt(itemQuantityField2.getText());

                double totalCost = (price1 * quantity1) + (price2 * quantity2);

                totalLabel.setText("Total Cost: $" + totalCost); // Update the totalLabel with the calculated total cost
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ShoppingCartPrinterGUI gui = new ShoppingCartPrinterGUI();
            gui.setVisible(true);
        });
    }
}
