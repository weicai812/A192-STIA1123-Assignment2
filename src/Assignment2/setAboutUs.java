package Assignment2;

import javax.swing.*;
import java.awt.*;

public class setAboutUs extends JFrame {
    private static final long serialVersionUID = 1L;

    setAboutUs(){
        Font f = new Font("Arial",Font.BOLD,50);
        Font font=new Font("Arial",PROPERTIES,20);
        JTextArea textArea = new JTextArea(35,0);
        JLabel a =new JLabel("<HTML>Name: GAN WEI CAI<BR>Matric Number: 269979</HTML>") ;
        a.setBounds(5,330,890,50);
        a.setFont(font);

        JLabel a2 =new JLabel("<HTML>Name: GOH DENG VEE<BR>Matric Number: 269843</HTML>") ;
        a2.setBounds(5,720,890,50);
        a2.setFont(font);
        textArea.add(a2);

        JLabel a1= new JLabel("About Us");
        a1.setFont(f);
        a1.setBounds(5,5,400,80);
        add(a1);



        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("resources\\AboutUs1.jpg"));
        JLabel icon = new JLabel(imageIcon);
        icon.setBounds(0,10,300,300);
        textArea.add(icon);
        textArea.add(a);

        ImageIcon imageIcon2 = new ImageIcon(this.getClass().getResource("resources\\AboutUs2.png"));
        JLabel icon2 = new JLabel(imageIcon2);
        icon2.setBounds(0,400,300,300);
        textArea.add(icon2);

        textArea.setLineWrap(true);
        textArea.setFont(font);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(0,80,890,500);
        add(scrollPane);

        setTitle("About Us");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Image titleicon =Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources\\logo-uum1.png"));
        setIconImage(titleicon);
        setBounds(550,300,900,600);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

}
