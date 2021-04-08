package Assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setCashier extends JFrame implements ActionListener {
    private JTextField tf1,tf2,tf3;
    private JLabel l1,l2,l3,l4,l5,l6;
    private JPasswordField pf1;
    private JRadioButton rb1,rb2;
    private ButtonGroup bg1;
    private JButton b1,b2;

    setCashier(){
        Font font=new Font("Arial",PROPERTIES,20);

        l1=new JLabel("Cashier");
        l1.setBounds(40,20,150,100);
        l1.setFont(new Font("Arial",Font.BOLD,40));
        add(l1);

        l2=new JLabel("Name");
        l2.setBounds(220,110,150,50);
        l2.setFont(font);
        add(l2);

        l3=new JLabel("Staff ID");
        l3.setBounds(220,180,150,50);
        l3.setFont(font);
        add(l3);

        l4=new JLabel("Username");
        l4.setBounds(220,250,150,50);
        l4.setFont(font);
        add(l4);

        l5=new JLabel("Password");
        l5.setBounds(220,320,150,50);
        l5.setFont(font);
        add(l5);

        l6=new JLabel("Status");
        l6.setBounds(220,390,150,50);
        l6.setFont(font);
        add(l6);

        tf1 = new JTextField();
        tf1.setBounds(370,110,300,50);
        tf1.setFont(font);
        add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(370,180,300,50);
        tf2.setFont(font);
        add(tf2);

        tf3 = new JTextField();
        tf3.setBounds(370,250,300,50);
        tf3.setFont(font);
        add(tf3);

        pf1 = new JPasswordField();
        pf1.setBounds(370,320,300,50);
        pf1.setFont(font);
        add(pf1);

        rb1 = new JRadioButton("Active");
        rb1.setFont(font);
        rb1.setBounds(370,390,150,40);
        add(rb1);

        rb2 = new JRadioButton("Inactive");
        rb2.setFont(font);
        rb2.setBounds(520,390,150,40);
        add(rb2);

        bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);

        b1 = new JButton("Add new");
        b1.setFont(font);
        b1.setBounds(250,480,150,40);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("Save");
        b2.setFont(font);
        b2.setBounds(500,480,150,40);
        add(b2);
        b2.addActionListener(this);

        setTitle("Cashier");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Image titleicon =Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources\\logo-uum1.png"));
        setIconImage(titleicon);
        setBounds(550,300,900,600);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            pf1.setText("");
        }
        if (e.getSource() == b2){
            int save = JOptionPane.showConfirmDialog(this,"Do you want to save??");
            if (save == 0){
                JOptionPane.showMessageDialog(this,"Saved Successfully");
                new setCashier();
                this.dispose();
            }else if (save == 1){
                new setCashier();
                this.dispose();
            }else if (save ==2){
                return;
            }
        }
    }
}
