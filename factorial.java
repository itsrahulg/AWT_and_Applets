import java.awt.*;
import java.awt.event.*;

public class factorial {
    public static void main(String[] args) {
        // Creating the frame
        Frame frame = new Frame("Factorial");

        // Creating the panel to hold the buttons and text fields
        Panel panel = new Panel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(panel);

        // Creating the first label and text field
        Label numberLabel = new Label("Enter any number: ");
        TextField numberInput = new TextField();
        numberInput.setPreferredSize(new Dimension(150, 30));

        // Creating the result label and area
        Label resultLabel = new Label("Factorial of number: ");
        TextField answerField = new TextField();
        answerField.setPreferredSize(new Dimension(150, 30));
        answerField.setEditable(false); // Make the answer field non-editable

        // Creating the compute button
        Button computeButton = new Button("Compute");
        computeButton.setPreferredSize(new Dimension(100, 50));

        // Adding components to the panel
        panel.add(numberLabel);
        panel.add(numberInput);
        panel.add(resultLabel);
        panel.add(answerField);
        panel.add(computeButton);

        // Adding action listener to the compute button
        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberInput.getText());
                    long factorial = calculateFactorial(number);
                    answerField.setText(String.valueOf(factorial));
                } catch (NumberFormatException ex) {
                    answerField.setText("Invalid input");
                }
            }
        });

        
        frame.setSize(600, 500);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    
    private static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
