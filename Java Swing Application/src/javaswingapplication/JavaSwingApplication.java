package javaswingapplication;
import java.awt.*;
import javax.swing.*;
public class JavaSwingApplication extends JFrame  {

    JPanel p1,p2,p3,p4,p41,p42,p43,p44;
    JTabbedPane tab;
   public JavaSwingApplication(){

       p1= new JPanel();
       p2= new JPanel();
       p3= new JPanel();
       p4= new JPanel();
       p41= new JPanel();
       p42= new JPanel();
       p43= new JPanel();
       p44= new JPanel();
       tab= new JTabbedPane();
       tab.add("tab1",p1);
       tab.add("tab1",p2);
       tab.add("tab1",p3);
       tab.add("tab1",p4);
       add(tab);//add()==this.add()
       setVisible(true);
       p1.setBackground(Color.black);
       p2.setBackground(Color.red);
       p3.setBackground(Color.blue);
       p4.setBackground(Color.white);

       this.setSize(400,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


   }
}
