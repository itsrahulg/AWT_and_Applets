import java.awt.*;
import java.awt.event.*;

public class temperature {
    public static void main(String[] args) {
        Frame frame = new Frame("Temperature Converter");

        // Set the layout to GridLayout with 2 rows and 2 columns
        frame.setLayout(new GridLayout(2, 2, 10, 10));

        Label celsiusLabel = new Label("Celsius: ");
        Label fahrenheitLabel = new Label("Fahrenheit: "); 
        TextField celsiusField = new TextField(10);
        TextField fahrenheitField = new TextField(10);
        
        // Allow floating-point input
        celsiusField.setText("0.0");
        fahrenheitField.setText("32.0");

        frame.add(celsiusLabel);
        frame.add(celsiusField);
        frame.add(fahrenheitLabel);
        frame.add(fahrenheitField);

        frame.setSize(500, 100);

        // Add a window listener to handle closing events
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        frame.setVisible(true);
    }
}
