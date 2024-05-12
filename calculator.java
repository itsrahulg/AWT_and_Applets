import java.awt.*;
import java.awt.event.*;
public class calculator extends Frame {
    List l1,l2,l3;
    Button b1;
    TextField t1;

    public calculator(){
        setLayout(new GridLayout(3,1));
        l1 = new List();
        l2 = new List();
        l3 = new List();

       for (int i = 0; i<10 ; i++  ){
           l1.add(String.valueOf(i));
       }
       l2.add("+");
       l2.add("-");
       l2.add("*");

        for (int i = 0; i<10 ; i++  ){
            l3.add(String.valueOf(i));
        }
        add(l1);
        add(l2);
        add(l3);
        

        setLayout(new GridLayout(2,1));

        b1 = new Button("Calculate");
        b1.setPreferredSize(new Dimension(250,50));
        t1 = new TextField();
        t1.setPreferredSize(new Dimension(250,50));

        add(b1);
        add(t1);

        setSize(250, 250);
        setLayout(new FlowLayout());

        setTitle("Calculator Components");


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);

    }
    public static void main(String[] args){
        new calculator();
    }
}