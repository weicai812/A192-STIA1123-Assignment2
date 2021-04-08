package Assignment2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class setSO extends JFrame {
    private JTable table;
    private int i=0;

    setSO(){
        Font font1=new Font("Arial",PROPERTIES,16);

        table = new JTable();

        Object[] columns = {"No","Item Code","Item Description","Quantity","Price"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);

        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("Arial",1,16);
        table.setFont(font);
        table.setRowHeight(30);


        JTextField textItemCode = new JTextField();
        JTextField textQuantity = new JTextField();
        JTextField textCustomer= new JTextField();
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnCheckOut = new JButton("Checkout");
        JLabel supplier = new JLabel("Supplier Code");
        supplier.setFont(font1);
        supplier.setBounds(450,300,150,50);
        add(supplier);
        JLabel itemcode = new JLabel("Item Code");
        itemcode.setFont(font1);
        itemcode.setBounds(20,300,150,50);
        add(itemcode);
        JLabel quantity = new JLabel("Quantity");
        quantity.setFont(font1);
        quantity.setBounds(20,350,150,50);
        add(quantity);

        textItemCode.setBounds(120, 305, 200, 40);
        textItemCode.setFont(font1);
        add(textItemCode);
        textCustomer.setBounds(600, 305, 200, 40);
        textCustomer.setFont(font1);
        add(textCustomer);
        textQuantity.setBounds(120, 355, 200, 40);
        textQuantity.setFont(font1);
        add(textQuantity);

        JLabel l1 = new JLabel("Description");
        l1.setBounds(20,405,150,50);
        l1.setFont(font1);
        add(l1);

        JLabel l2 = new JLabel("Price");
        l2.setBounds(20,455,150,50);
        l2.setFont(font1);
        add(l2);

        JTextArea ta1 = new JTextArea();
        ta1.setFont(font1);
        ta1.setBorder(BorderFactory.createLineBorder(Color.black));
        ta1.setBounds(120,405,600,40);
        ta1.setEditable(false);
        add(ta1);

        JTextArea ta2 = new JTextArea();
        ta2.setFont(font1);
        ta2.setBorder(BorderFactory.createLineBorder(Color.black));
        ta2.setBounds(120,455,200,40);
        ta2.setEditable(false);
        add(ta2);

        btnAdd.setBounds(350, 500, 100, 40);
        btnDelete.setBounds(500, 500, 100, 40);
        btnCheckOut.setBounds(200,500,100,40);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(10, 0, 880, 300);

        add(pane);
        add(btnAdd);
        add(btnDelete);
        add(btnCheckOut);
        Object[] row = new Object[5];
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                row[1] = textItemCode.getText();
                row[3] = textQuantity.getText();
                i++;
                row[0] = i;
                row[2] = "";
                row[4]= "";
                model.addRow(row);
                textItemCode.setText("");
                textQuantity.setText("");
            }
        });

        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table.getSelectedRow();
                if(i >= 0){
                    model.removeRow(i);
                }
                else{
                    JOptionPane.showMessageDialog(null,"No Record to Delete");
                }
            }
        });

        table.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e){

                int i = table.getSelectedRow();
                textItemCode.setText(model.getValueAt(i, 1).toString());
                ta1.setText(model.getValueAt(i, 2).toString());
                textQuantity.setText(model.getValueAt(i, 3).toString());
                ta2.setText(model.getValueAt(i, 4).toString());
            }
        });

        btnCheckOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new setSO();
                dispose();
            }
        });

        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(480);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);


        add(pane);
        setTitle("Sales Order");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Image titleicon =Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources\\logo-uum1.png"));
        setIconImage(titleicon);
        setBounds(550,300,900,600);
        setLayout(null);
        setVisible(true);
        setResizable(false);

    }
}
