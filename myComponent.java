import java.awt.*;
import java.awt.event.*;

public class myComponent {
    public static void main(String[] args) {
        Frame frame = new Frame("My Components");

        // Set the layout to FlowLayout
        frame.setLayout(new FlowLayout());

        Label label1 = new Label("Enter First number");
        Label label2 = new Label("Enter Second number"); 
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");

        t1.setBounds(30, 30, 50, 50);

        frame.add(label1);
        frame.add(t1);
        frame.add(label2);
        frame.add(t2);
        
        frame.add(b1);
        frame.add(b2);

        frame.setSize(300, 200);

        
        // Add a window listener to handle closing events
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        frame.setVisible(true);
    }
}