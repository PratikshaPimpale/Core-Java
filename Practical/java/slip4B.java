//B) Write a java program for the following: (use Swing)
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Slip10B extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    Panel p1,p2,p3,p4,p5;
    GridLayout g1,g2,g3,g4,g5,g6;
    JFrame jf;
    public Slip10B()
    {
        jf = new JFrame();
        l1 = new JLabel("Simple Interest Calculator");
        l2 = new JLabel("Principle Amount");
        l3 = new JLabel("Interest Rate(%)");
        l4 = new JLabel("Time(Yrs)");
        l5 = new JLabel("Total Amount");
        l6 = new JLabel("Interest Amount");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t4 = new JTextField(20);
        t5 = new JTextField(20);
        b1 = new JButton("Calculate");
        b2 = new JButton("Clear");
        b3 = new JButton("Close");
        p1 = new Panel();
        g1= new GridLayout(1,1);
        p1.setLayout(g1);
        p1.add(l1);
        p2 = new Panel();
        g2 = new GridLayout(1,2);
        p2.setLayout(g2);
        p2.add(l2);
        p2.add(t1);
        p3 = new Panel();
        g3 = new GridLayout(1,4);
        p3.setLayout(g3);
        p3.add(l3);
        p3.add(t2);
        p3.add(l4);
        p3.add(t3);
        p4 = new Panel();
        g4 = new GridLayout(2,2);
        p4.setLayout(g4);
        p4.add(l5);
        p4.add(t4);
        p4.add(l6);
        p4.add(t5);
        p5 = new Panel();
        g5 = new GridLayout(1,3);
        p5.setLayout(g5);
        p5.add(b1);
        p5.add(b2);
        p5.add(b3);
        g6 = new GridLayout(5,1);
        this.setLayout(g6);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.setSize(500,250);
        this.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int p = Integer.parseInt(t1.getText());
        float rt = Float.parseFloat(t2.getText());
        float tm = Float.parseFloat(t3.getText());
        if(ae.getSource()==b1)
        {
            double iamt = (p*tm*rt)/100;
            t5.setText(Double.toString(iamt));
            double tamt = iamt+p;
            t4.setText(Double.toString(tamt));
        }
        if(ae.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
        if(ae.getSource()==b3)
        {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String args[])
    {
        Slip10B s1 = new Slip10B();
    }
}
