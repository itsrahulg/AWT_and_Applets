import java.awt.*;
import java.awt.event.*;

public class button_layout {
    public static void main(String[] args) {

        Frame frame = new Frame("buttons layout");
        
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();

    
        //panel1
        panel1.setBackground(Color.orange);
        panel1.setPreferredSize(new Dimension(800,100));
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        Button button_one = new Button("one");
        button_one.setPreferredSize(new Dimension(70,50));
        panel1.add(button_one);


        //panel2
        panel2.setBackground(Color.pink);
        Button button_two = new Button("two");
        Button button_three = new Button("three");
        Button button_four = new Button("four");
        button_two.setPreferredSize(new Dimension(70,50));
        button_three.setPreferredSize(new Dimension(70,50));
        button_four.setPreferredSize(new Dimension(70,50));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.add(button_two);
        panel2.add(button_three);
        panel2.add(button_four);
        
 
        //panel3
        panel3.setBackground(Color.blue);
        panel3.setPreferredSize(new Dimension(800,100));
        Button button_five = new Button("five");
        button_five.setPreferredSize(new Dimension(70,50));
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel3.add(button_five);
        

        frame.setLayout(new BorderLayout());
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.CENTER);
        frame.add(panel3,BorderLayout.SOUTH);
       
        frame.setSize(800,500);
        frame.setVisible(true);


        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
 
    }
}
