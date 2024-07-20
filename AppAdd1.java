import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class AppAdd1 extends Applet implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1;
    public void init()
    {
        l1=new Label("Enter no1:");
        l2=new Label("Enter no2:");
        l3=new Label("Result=");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        b1=new Button("Add");
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a+b;
            t3.setText(""+c);
        }
    }
}
/*<html>
    <body>
        <applet code="AppAdd1" width="500" height="500">
        </applet>
    </body>
</html>*/

