package Assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setCategory extends JFrame implements ActionListener {
    private JLabel l1,l2;
    private JTextField tf1,tf2;
    private JButton b1;


    setCategory(){
        Font font=new Font("Arial",PROPERTIES,20);

        l1 = new JLabel("Category Code");
        l1.setBounds(100,40,150,40);
        l1.setFont(font);
        add(l1);

        l2 = new JLabel("Category Name");
        l2.setBounds(100,110,150,40);
        l2.setFont(font);
        add(l2);

        tf1 = new JTextField();
        tf1.setFont(font);
        tf1.setBounds(250,40,200,40);
        add(tf1);

        tf2 = new JTextField();
        tf2.setFont(font);
        tf2.setBounds(250,110,200,40);
        add(tf2);

        b1=new JButton("Save");
        b1.setFont(font);
        b1.setBounds(300,180,100,40);
        add(b1);
        b1.addActionListener(this);

        setTitle("Category");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Image titleicon =Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources\\logo-uum1.png"));
        setIconImage(titleicon);
        setBounds(700,300,600,300);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            JOptionPane.showMessageDialog(this,"Saved Successfully");
            new setCategory();
            this.dispose();
        }
    }
}
