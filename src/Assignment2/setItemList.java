package Assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setItemList extends JFrame implements ActionListener {
    private JTextField tf1,tf2,tf3,tf4,tf5;
    private JLabel l1,l2,l3,l4,l5,l6;
    private JButton b1,b2;

    setItemList(){
        Font font=new Font("Arial",PROPERTIES,20);

        l1=new JLabel("Item");
        l1.setBounds(40,20,300,100);
        l1.setFont(new Font("Arial",Font.BOLD,40));
        add(l1);

        l2=new JLabel("Item Code");
        l2.setBounds(200,110,180,50);
        l2.setFont(font);
        add(l2);

        l3=new JLabel("Item Name");
        l3.setBounds(200,180,180,50);
        l3.setFont(font);
        add(l3);

        l4=new JLabel("Category");
        l4.setBounds(200,250,180,50);
        l4.setFont(font);
        add(l4);

        l5=new JLabel("Group");
        l5.setBounds(200,320,180,50);
        l5.setFont(font);
        add(l5);

        l6=new JLabel("Price");
        l6.setBounds(200,390,180,50);
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

        tf4 = new JTextField();
        tf4.setBounds(370,320,300,50);
        tf4.setFont(font);
        add(tf4);

        tf5 = new JTextField();
        tf5.setFont(font);
        tf5.setBounds(370,390,300,40);
        add(tf5);



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

        setTitle("Item");
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
            tf4.setText("");
            tf5.setText("");
        }
        if (e.getSource() == b2){
            int save = JOptionPane.showConfirmDialog(this,"Do you want to save??");
            if (save == 0){
                JOptionPane.showMessageDialog(this,"Saved Successfully");
                new setItemList();
                this.dispose();
            }else if (save == 1){
                new setItemList();
                this.dispose();
            }else if (save ==2){
                return;
            }
        }
    }
}
