package Assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Home extends JFrame implements ActionListener {
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    private JMenuBar mb;
    private JMenu maintenance, transaction, enquiry, report, housekeeping, wizards, help, exit;
    private JMenu personnel, member, customer, supplier, tourism, item, miscellaneous;
    private JMenuItem cashier, supervisor, salesperson, promoter;
    private JMenuItem member1, membership, occupation, city, state, country, tint, pml, memberlabel;
    private JMenuItem customer1, pcl;
    private JMenuItem supplier1, psl;
    private JMenuItem agency, guide, tourist;
    private JMenuItem category, group, shelf, item1, ipc, si, il, isn, ir, mi, colour, ioq, lioq, goq, bill, pi, subpi, subpg, lp, pt, tsr, cts;
    private JMenuItem cc, voucher, sd, counter, table, area, project, fc, reason, tax, mic, tcm;
    private JMenu it;
    private JMenuItem cr, rr, cashrec, desposit, point, vi, tt, mvr, so;
    private JMenuItem receive, pr, deliveryorder, invoice, cashsale, dn, cn, issue, adjustment1, adjustment2;
    private JMenu printitem;
    private JMenuItem pb, cs, dc, ccc, ss, tgs, ocd, md;
    private JMenuItem itemlist, ilabel, cl, gl, sil, pil;
    private JMenuItem receiptreport, salesreport, inventoryreport;
    private JMenuItem generalsetup, transactionsetup;
    private JMenuItem usermanual;
    private JMenuItem aboutus, contactus;
    private JMenuItem logout, quit;
    private JButton b1, b2, b3, b4;


    Home() {
        mb = new JMenuBar();
        setMaintenance();
        setTransaction();
        setEnquiry();
        setReport();
        setHousekeeping();
        setWizards();
        setHelp();
        setExit();

        setTime();
        setImage();
        setQuickButton();
        setLabel();
        addActionEvent();


        mb.add(maintenance);
        mb.add(transaction);
        mb.add(enquiry);
        mb.add(report);
        mb.add(housekeeping);
        mb.add(wizards);
        mb.add(help);
        mb.add(exit);

        setTitle("Home");
        setJMenuBar(mb);
        setBounds(380, 100, 1200, 850);
        Image titleicon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources\\logo-uum1.png"));
        setIconImage(titleicon);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cashier) {
            new setCashier();
        }
        if (e.getSource() == supervisor) {
            new setSupervisor();
        }
        if (e.getSource() == salesperson) {
            new setSalesperson();
        }
        if (e.getSource() == promoter) {
            new setPromoter();
        }
        if (e.getSource() == member1) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == membership) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == occupation) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == city) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == state) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == country) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == tint) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == pml) {
            JOptionPane.showMessageDialog(this, "Printer could not be found");
        }
        if (e.getSource() == memberlabel) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == customer1) {
            new setCustomer();
        }
        if (e.getSource() == pcl) {
            JOptionPane.showMessageDialog(this, "Printer could not be found");
        }
        if (e.getSource() == supplier1) {
            new setSupplier();
        }
        if (e.getSource() == psl) {
            JOptionPane.showMessageDialog(this, "Printer could not be found");
        }
        if (e.getSource() == agency) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == guide) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == tourist) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == category) {
            new setCategory();
        }
        if (e.getSource() == group) {
            new setGroup();
        }
        if (e.getSource() == shelf) {
            new setShelf();
        }
        if (e.getSource() == item1) {
            new setItemList();
        }
        if (e.getSource() == ipc) {
            new setPriceChange();
        }
        if (e.getSource() == si) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == il) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == isn) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == ir) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == mi) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == colour) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == ioq) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == lioq) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == goq) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == bill) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == pi) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == subpi) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == subpg) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == lp) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == pt) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == tsr) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == cts) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == cc) {
            new setCreditCard();
        }
        if (e.getSource() == voucher) {
            new setVoucher();
        }
        if (e.getSource() == sd) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == counter) {
            JOptionPane.showMessageDialog(this, "Current version could not be linked to other counters");
        }
        if (e.getSource() == table) {
            new setTable();
        }
        if (e.getSource() == area) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == project) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == fc) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == reason) {
            new setReason();
        }
        if (e.getSource() == tax) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == mic) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == tcm) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == cr) {
            new Cashierlogin();
        }
        if (e.getSource() == rr) {
            JOptionPane.showMessageDialog(this, "Your record could not be found");
        }
        if (e.getSource() == cashrec) {
            new setCashRec();
        }
        if (e.getSource() == desposit) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == point) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == vi) {
            new setVoucherIssue();
        }
        if (e.getSource() == tt) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == mvr) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == so) {
            new setSO();
        }
        if (e.getSource() == receive) {
            new setReceive();
        }
        if (e.getSource() == pr) {
            new setPurchaseReturn();
        }
        if (e.getSource() == deliveryorder) {
            new setDO();
        }
        if (e.getSource() == invoice) {
            new setInvoice();
        }
        if (e.getSource() == cashsale) {
            new Cashierlogin();
        }
        if (e.getSource() == dn) {
            new setDebitNote();
        }
        if (e.getSource() == cn) {
            new setCreditNote();
        }
        if (e.getSource() == issue) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == adjustment1) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == adjustment2) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == pb) {
            JOptionPane.showMessageDialog(this, "Your printer could not be found");
        }
        if (e.getSource() == cs) {
            JOptionPane.showMessageDialog(this, "Your counter is activating");
        }
        if (e.getSource() == dc) {
            JOptionPane.showMessageDialog(this, "Your record could not be found");
        }
        if (e.getSource() == ccc) {
            JOptionPane.showMessageDialog(this, "Your record could not be found");
        }
        if (e.getSource() == ss) {
            JOptionPane.showMessageDialog(this, "Your record could not be found");
        }
        if (e.getSource() == tgs) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == ocd) {
            JOptionPane.showMessageDialog(this, "Your device could not be found");
        }
        if (e.getSource() == md) {
            JOptionPane.showMessageDialog(this, "Your current version is not supported this feature");
        }
        if (e.getSource() == itemlist) {
            JOptionPane.showMessageDialog(this, "Your printer could not be found");
        }
        if (e.getSource() == ilabel) {
            JOptionPane.showMessageDialog(this, "Your printer could not be found");
        }
        if (e.getSource() == cl) {
            JOptionPane.showMessageDialog(this, "Your printer could not be found");
        }
        if (e.getSource() == gl) {
            JOptionPane.showMessageDialog(this, "Your printer could not be found");
        }
        if (e.getSource() == sil) {
            JOptionPane.showMessageDialog(this, "Your printer could not be found");
        }
        if (e.getSource() == pil) {
            JOptionPane.showMessageDialog(this, "Your printer could not be found");
        }
        if (e.getSource() == receiptreport) {
            JOptionPane.showMessageDialog(this, "Your record could not be found");
        }
        if (e.getSource() == salesreport) {
            JOptionPane.showMessageDialog(this, "Your record could not be found");
        }
        if (e.getSource() == inventoryreport) {
            JOptionPane.showMessageDialog(this, "Your record could not be found");
        }
        if (e.getSource() == generalsetup) {
            new setGeneralSetup();
        }
        if (e.getSource() == transactionsetup) {
            new setTransactionSetup();
        }
        if (e.getSource() == usermanual) {
            new setUserManual();
        }
        if (e.getSource() == aboutus) {
            new setAboutUs();
        }
        if (e.getSource() == contactus) {
            new setContactUs();
        }
        if (e.getSource() == logout) {
            new Login();
            this.dispose();
        }
        if (e.getSource() == quit) {
            System.exit(0);
        }
        if (e.getSource() == b1) {
            new Cashierlogin();
        }
        if (e.getSource() == b2) {
            JOptionPane.showMessageDialog(this, "Record is empty");
        }
        if (e.getSource() == b3) {
            JOptionPane.showMessageDialog(this, "Your printer could not be found");
        }
        if (e.getSource() == b4) {
            new Login();
            this.dispose();
        }
    }

    public void setMaintenance() {
        maintenance = new JMenu("Maintenance");
        setPersonnel();
        setMember();
        setCustomer();
        setSupplier();
        setTourism();
        setItem();
        setMiscellaneous();
    }

    public void setPersonnel() {
        personnel = new JMenu("Personnel File");
        maintenance.add(personnel);
        cashier = new JMenuItem("Cashier");
        supervisor = new JMenuItem("Supervisor");
        salesperson = new JMenuItem("Salesperson / Agent");
        promoter = new JMenuItem("Promoter");
        personnel.add(cashier);
        personnel.add(supervisor);
        personnel.add(salesperson);
        personnel.add(promoter);
    }

    public void setMember() {
        member = new JMenu("Member File");
        maintenance.add(member);
        member1 = new JMenuItem("Member");
        membership = new JMenuItem("Membership Class");
        occupation = new JMenuItem("Occupation");
        city = new JMenuItem("City");
        state = new JMenuItem("State");
        country = new JMenuItem("Country");
        tint = new JMenuItem("Tint Color");
        pml = new JMenuItem("Print Member List");
        memberlabel = new JMenuItem("Membership Label");
        member.add(member1);
        member.add(membership);
        member.add(occupation);
        member.add(city);
        member.add(state);
        member.add(country);
        member.add(tint);
        member.add(pml);
        member.add(memberlabel);
    }

    public void setCustomer() {
        customer = new JMenu("Customer File");
        maintenance.add(customer);
        customer1 = new JMenuItem("Customer");
        pcl = new JMenuItem("Print Customer List");
        customer.add(customer1);
        customer.add(pcl);
    }

    public void setSupplier() {
        supplier = new JMenu("Supplier File");
        maintenance.add(supplier);
        supplier1 = new JMenuItem("Supplier");
        psl = new JMenuItem("Print Supplier List");
        supplier.add(supplier1);
        supplier.add(psl);
    }

    public void setTourism() {
        tourism = new JMenu("Tourism File");
        maintenance.add(tourism);
        agency = new JMenuItem("Tour Agency");
        guide = new JMenuItem("Tour Guide");
        tourist = new JMenuItem("Tourist");
        tourism.add(agency);
        tourism.add(guide);
        tourism.add(tourist);
    }

    public void setItem() {
        item = new JMenu("Item File");
        maintenance.add(item);
        category = new JMenuItem("Category");
        group = new JMenuItem("Group");
        shelf = new JMenuItem("Shelf");
        item1 = new JMenuItem("Item");
        ipc = new JMenuItem("Item Price Change");
        si = new JMenuItem("Service Item");
        il = new JMenuItem("Item Location");
        isn = new JMenuItem("Item Serial No.");
        ir = new JMenuItem("Item Reference");
        mi = new JMenuItem("Matrix Item");
        colour = new JMenuItem("Colour");
        ioq = new JMenuItem("Item Opening Quantity");
        lioq = new JMenuItem("Location Item Opening Quantity");
        goq = new JMenuItem("Grade Opening Quantity");
        bill = new JMenuItem("Bill Of Material");
        pi = new JMenuItem("Promotion Item");
        subpi = new JMenuItem("Sub-Purchased Item");
        subpg = new JMenuItem("Sub-Purchased Group");
        lp = new JMenuItem("Location Promotion");
        pt = new JMenuItem("Promotion Type");
        tsr = new JMenuItem("Touchscreen remark");
        cts = new JMenuItem("Customize touch screen");
        item.add(category);
        item.add(group);
        item.add(shelf);
        item.add(item1);
        item.add(ipc);
        item.add(si);
        item.add(il);
        item.add(isn);
        item.add(ir);
        item.add(mi);
        item.add(colour);
        item.add(ioq);
        item.add(lioq);
        item.add(goq);
        item.add(bill);
        item.add(pi);
        item.add(subpi);
        item.add(subpg);
        item.add(lp);
        item.add(pt);
        item.add(tsr);
        item.add(cts);
    }

    public void setMiscellaneous() {
        miscellaneous = new JMenu("Miscellaneous File");
        maintenance.add(miscellaneous);
        cc = new JMenuItem("Credit Card");
        voucher = new JMenuItem("Voucher");
        sd = new JMenuItem("Special Discount");
        counter = new JMenuItem("Counter");
        table = new JMenuItem("Table");
        area = new JMenuItem("Area");
        project = new JMenuItem("Project");
        fc = new JMenuItem("Foreign Currency");
        reason = new JMenuItem("Reason");
        tax = new JMenuItem("Tax");
        mic = new JMenuItem("Major Industry Code");
        tcm = new JMenuItem("Tariff Code Maintenance");
        miscellaneous.add(cc);
        miscellaneous.add(voucher);
        miscellaneous.add(sd);
        miscellaneous.add(counter);
        miscellaneous.add(table);
        miscellaneous.add(area);
        miscellaneous.add(project);
        miscellaneous.add(fc);
        miscellaneous.add(reason);
        miscellaneous.add(tax);
        miscellaneous.add(mic);
        miscellaneous.add(tcm);
    }

    public void setTransaction() {
        transaction = new JMenu("Transaction");
        cr = new JMenuItem("Cash Receipt");
        rr = new JMenuItem("Receipt Record");
        cashrec = new JMenuItem("Cash Recording");
        desposit = new JMenuItem("Deposit");
        point = new JMenuItem("Point Redemption");
        vi = new JMenuItem("Voucher Issue");
        tt = new JMenuItem("Tourism Transaction");
        mvr = new JMenuItem("Member Visual Record");
        so = new JMenuItem("Sales Order");
        transaction.add(cr);
        transaction.add(rr);
        transaction.add(cashrec);
        transaction.add(desposit);
        transaction.add(point);
        transaction.add(vi);
        transaction.add(tt);
        transaction.add(mvr);
        transaction.add(so);
        setInventory();
    }

    public void setInventory() {
        it = new JMenu("Inventory Transaction");
        transaction.add(it);
        receive = new JMenuItem("Receive");
        pr = new JMenuItem("Purchase Return");
        deliveryorder = new JMenuItem("Delivery Order");
        invoice = new JMenuItem("Invoice");
        cashsale = new JMenuItem("Cash Sale");
        dn = new JMenuItem("Debit Note");
        cn = new JMenuItem("Credit Note");
        issue = new JMenuItem("Issue");
        adjustment1 = new JMenuItem("Adjustment - Increase");
        adjustment2 = new JMenuItem("Adjustment - Reduce");
        it.add(receive);
        it.add(pr);
        it.add(deliveryorder);
        it.add(invoice);
        it.add(cashsale);
        it.add(dn);
        it.add(cn);
        it.add(issue);
        it.add(adjustment1);
        it.add(adjustment2);
    }

    public void setEnquiry() {
        enquiry = new JMenu("Enquiry");
        pb = new JMenuItem("Print Bill");
        printitem = new JMenu("Print Item");
        cs = new JMenuItem("Counter Status");
        dc = new JMenuItem("Daily Checkout");
        ccc = new JMenuItem("Close Counter Checkout");
        ss = new JMenuItem("Salesperson Sales");
        tgs = new JMenuItem("Tou Group Sales");
        ocd = new JMenuItem("Open Cash Drawer");
        md = new JMenuItem("Message Display");
        enquiry.add(pb);
        enquiry.add(printitem);
        setPrintitem();
        enquiry.add(cs);
        enquiry.add(dc);
        enquiry.add(ccc);
        enquiry.add(ss);
        enquiry.add(tgs);
        enquiry.add(ocd);
        enquiry.add(md);

    }

    public void setPrintitem() {
        itemlist = new JMenuItem("Item List");
        ilabel = new JMenuItem("Item Label");
        cl = new JMenuItem("Category List");
        gl = new JMenuItem("Group List");
        sil = new JMenuItem("Service Item List");
        pil = new JMenuItem("Promotional Item List");
        printitem.add(itemlist);
        printitem.add(ilabel);
        printitem.add(cl);
        printitem.add(gl);
        printitem.add(sil);
        printitem.add(pil);
    }

    public void setReport() {
        report = new JMenu("Report");
        receiptreport = new JMenuItem("Receipt Report");
        salesreport = new JMenuItem("Sales Report");
        inventoryreport = new JMenuItem("Inventory Report");
        report.add(receiptreport);
        report.add(salesreport);
        report.add(inventoryreport);
    }

    public void setHousekeeping() {
        housekeeping = new JMenu("Housekeeping");
        generalsetup = new JMenuItem("General Setup");
        transactionsetup = new JMenuItem("Transaction Setup");
        housekeeping.add(generalsetup);
        housekeeping.add(transactionsetup);

    }

    public void setWizards() {
        wizards = new JMenu("Wizard");
        usermanual = new JMenuItem("User Manual");
        wizards.add(usermanual);
    }

    public void setHelp() {
        help = new JMenu("Help");
        aboutus = new JMenuItem("About Us");
        contactus = new JMenuItem("Contact Us");
        help.add(aboutus);
        help.add(contactus);
    }

    public void setExit() {
        exit = new JMenu("Exit");
        logout = new JMenuItem("Logout");
        quit = new JMenuItem("Quit");
        exit.add(logout);
        exit.add(quit);
    }

    public void setTime() {
        final JLabel time = new JLabel();
        time.setBounds(950, 110, 300, 50);
        add(time);

        final DateFormat timeFormat = new SimpleDateFormat("d MMM yyyy (EE) HH:mm:ss");
        ActionListener t = e -> {
            Date date = new Date();
            String time1 = timeFormat.format(date);
            time.setFont(new Font("Arial", Font.BOLD, 18));
            time.setText(time1);
        };
        Timer timer = new Timer(1000, t);
        timer.setInitialDelay(0);
        timer.start();
    }

    public void setImage() {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("Resources\\Home-Head1.png"));
        l1 = new JLabel(imageIcon);
        l1.setBounds(-3, -40, 1200, 200);
        add(l1);

        ImageIcon imageIcon1 = new ImageIcon(this.getClass().getResource("Resources\\Bottom-Layer1.png"));
        l2 = new JLabel(imageIcon1);
        l2.setBounds(-3, 768, 1200, 30);
        add(l2);
    }

    public void setQuickButton() {
        ImageIcon imageIcon2 = new ImageIcon(this.getClass().getResource("Resources\\quick-button1.png"));
        b1 = new JButton(imageIcon2);
        b1.setBounds(120, 330, 200, 200);
        add(b1);
        b1.addActionListener(this);

        ImageIcon imageIcon3 = new ImageIcon(this.getClass().getResource("Resources\\quick-button2.png"));
        b2 = new JButton(imageIcon3);
        b2.setBounds(370, 330, 200, 200);
        add(b2);
        b2.addActionListener(this);

        ImageIcon imageIcon4 = new ImageIcon(this.getClass().getResource("Resources\\quick-button3.png"));
        b3 = new JButton(imageIcon4);
        b3.setBounds(620, 330, 200, 200);
        add(b3);
        b3.addActionListener(this);

        ImageIcon imageIcon5 = new ImageIcon(this.getClass().getResource("Resources\\quick-button4.png"));
        b4 = new JButton(imageIcon5);
        b4.setBounds(870, 330, 200, 200);
        add(b4);
        b4.addActionListener(this);
    }

    public void setLabel() {
        l3 = new JLabel("Quick Access");
        l3.setBounds(30, 150, 500, 200);
        l3.setFont(new Font("Arial", Font.BOLD, 48));
        add(l3);

        l4 = new JLabel("Cash Sales");
        l4.setBounds(180, 520, 150, 50);
        l4.setFont(new Font("Arial", Font.PLAIN, 16));
        add(l4);

        l5 = new JLabel("Daily Sales Report");
        l5.setBounds(410, 520, 150, 50);
        l5.setFont(new Font("Arial", Font.PLAIN, 16));
        add(l5);

        l6 = new JLabel("Print Bill");
        l6.setBounds(690, 520, 150, 50);
        l6.setFont(new Font("Arial", Font.PLAIN, 16));
        add(l6);

        l7 = new JLabel("Logout");
        l7.setBounds(950, 520, 150, 50);
        l7.setFont(new Font("Arial", Font.PLAIN, 16));
        add(l7);

        l8 = new JLabel("Powered by STIA1123-A192 Group D");
        l8.setBounds(5, 735, 400, 50);
        l8.setFont(new Font("Arial", Font.BOLD, 18));
        add(l8);

        l9 = new JLabel("Version 1.0.0.0");
        l9.setBounds(1060, 735, 400, 50);
        l9.setFont(new Font("Arial", Font.BOLD, 18));
        add(l9);
        add(l9);
    }

    public void addActionEvent() {
        cashier.addActionListener(this);
        supervisor.addActionListener(this);
        salesperson.addActionListener(this);
        promoter.addActionListener(this);
        member1.addActionListener(this);
        membership.addActionListener(this);
        occupation.addActionListener(this);
        city.addActionListener(this);
        state.addActionListener(this);
        country.addActionListener(this);
        tint.addActionListener(this);
        pml.addActionListener(this);
        memberlabel.addActionListener(this);
        customer1.addActionListener(this);
        pcl.addActionListener(this);
        supplier1.addActionListener(this);
        psl.addActionListener(this);
        agency.addActionListener(this);
        guide.addActionListener(this);
        tourist.addActionListener(this);
        category.addActionListener(this);
        group.addActionListener(this);
        shelf.addActionListener(this);
        item1.addActionListener(this);
        ipc.addActionListener(this);
        si.addActionListener(this);
        il.addActionListener(this);
        isn.addActionListener(this);
        ir.addActionListener(this);
        mi.addActionListener(this);
        colour.addActionListener(this);
        ioq.addActionListener(this);
        lioq.addActionListener(this);
        goq.addActionListener(this);
        bill.addActionListener(this);
        pi.addActionListener(this);
        subpi.addActionListener(this);
        subpg.addActionListener(this);
        lp.addActionListener(this);
        pt.addActionListener(this);
        tsr.addActionListener(this);
        cts.addActionListener(this);
        cc.addActionListener(this);
        voucher.addActionListener(this);
        sd.addActionListener(this);
        counter.addActionListener(this);
        table.addActionListener(this);
        area.addActionListener(this);
        project.addActionListener(this);
        fc.addActionListener(this);
        reason.addActionListener(this);
        tax.addActionListener(this);
        mic.addActionListener(this);
        tcm.addActionListener(this);
        cr.addActionListener(this);
        rr.addActionListener(this);
        cashrec.addActionListener(this);
        desposit.addActionListener(this);
        point.addActionListener(this);
        vi.addActionListener(this);
        tt.addActionListener(this);
        mvr.addActionListener(this);
        so.addActionListener(this);
        receive.addActionListener(this);
        pr.addActionListener(this);
        deliveryorder.addActionListener(this);
        invoice.addActionListener(this);
        cashsale.addActionListener(this);
        dn.addActionListener(this);
        cn.addActionListener(this);
        issue.addActionListener(this);
        adjustment1.addActionListener(this);
        adjustment2.addActionListener(this);
        pb.addActionListener(this);
        cs.addActionListener(this);
        dc.addActionListener(this);
        ccc.addActionListener(this);
        ss.addActionListener(this);
        tgs.addActionListener(this);
        ocd.addActionListener(this);
        md.addActionListener(this);
        itemlist.addActionListener(this);
        ilabel.addActionListener(this);
        cl.addActionListener(this);
        gl.addActionListener(this);
        sil.addActionListener(this);
        pil.addActionListener(this);
        receiptreport.addActionListener(this);
        salesreport.addActionListener(this);
        inventoryreport.addActionListener(this);
        generalsetup.addActionListener(this);
        transactionsetup.addActionListener(this);
        usermanual.addActionListener(this);
        aboutus.addActionListener(this);
        contactus.addActionListener(this);
        logout.addActionListener(this);
        quit.addActionListener(this);
    }
}
