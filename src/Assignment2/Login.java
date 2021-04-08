package Assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener {
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    private JPanel panel1,panel2;
    private JLabel label1,label2,label3;


    Login() {
        panel1 = new JPanel(null);
        panel1.setBounds(0,0,500,120);
        panel1.setBackground(Color.ORANGE);

        panel2 = new JPanel();
        panel2.setBounds(0,620,500,45);
        panel2.setBackground(Color.yellow);

        ImageIcon icon = new ImageIcon(this.getClass().getResource("resources\\logo-uum1.png"));
        JLabel label = new JLabel(icon);
        label.setBounds(10,10,100,100);
        panel1.add(label);


        label1 = new JLabel("<HTML>Point of Sale<BR>UUM</HTML>");
        label1.setBounds(320,20,350,80);
        label1.setForeground(Color.GRAY);
        label1.setFont(new Font("Arial",Font.BOLD,26));
        panel1.add(label1);

        label2 = new JLabel("<HTML>Powered by STIA1123-A192 Group D <BR>© GAN WEI CAI & GOH DENG VEE</HTML>");
        panel2.add(label2);

        label3 = new JLabel("Version 1.0.0.0");
        label3.setBounds(200,580,200,40);
        label3.setFont(new Font("Arial",Font.PLAIN,16));
        add(label3);

        setLocationAndSize();
        addComponentsToFrame();
        addActionEvent();

        setTitle("Login");
        setBounds(700, 150, 500, 700);
        Image titleicon =Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources\\logo-uum1.png"));
        setIconImage(titleicon);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(false);


    }



    public void setLocationAndSize() {
        Font font1 = new Font("Arial",Font.BOLD,18);
        Font font2 = new Font("Arial",Font.PLAIN,18);

        userLabel.setBounds(80, 180, 150, 60);
        userLabel.setFont(font1);
        passwordLabel.setBounds(80, 270, 150, 60);
        passwordLabel.setFont(font1);
        userTextField.setBounds(230, 190, 200, 40);
        userTextField.setFont(font2);
        passwordField.setBounds(230, 280, 200, 40);
        passwordField.setFont(font2);
        showPassword.setBounds(230, 320, 150, 30);
        loginButton.setBounds(100, 380, 100, 30);
        resetButton.setBounds(265, 380, 100, 30);


    }

    public void addComponentsToFrame() {
        add(userLabel);
        add(passwordLabel);
        add(userTextField);
        add(passwordField);
        add(showPassword);
        add(loginButton);
        add(resetButton);
        add(panel1);
        add(panel2);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("user") && pwdText.equalsIgnoreCase("user")) {
                JOptionPane.showMessageDialog(this, "Login Successfully");
                new Home();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }

}
